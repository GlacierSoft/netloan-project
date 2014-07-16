package com.glacier.netloan.service.borrow;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.glacier.netloan.dao.borrow.ReceivablesNotesDetailMapper;
import com.glacier.netloan.dao.borrow.ReceivablesNotesMapper;
import com.glacier.netloan.dao.borrow.TenderNotesMapper;
import com.glacier.netloan.entity.borrow.ReceivablesNotes;
import com.glacier.netloan.entity.borrow.ReceivablesNotesDetail;
import com.glacier.netloan.entity.borrow.ReceivablesNotesDetailExample;
import com.glacier.netloan.entity.borrow.ReceivablesNotesExample;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.borrow.TenderNotesExample;


/**
 * @ClassName: BankingStatisticsService 
 * @Description: TODO(理财统计业务层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-21下午5:27:11
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class BankingStatisticsService {
	
	@Autowired
	private ReceivablesNotesDetailService receivablesNotesDetailService;
	
	@Autowired
	private ReceivablesNotesDetailMapper receivablesNotesDetailMapper;
	
	@Autowired
	private ReceivablesNotesMapper receivablesNotesMapper;
	
	@Autowired
	private TenderNotesMapper tenderNotesMapper;
	
	/**
	 * @Title: getBankingStatistics 
	 * @Description: TODO(个人理财统计) 
	 * @param  @param memberId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
    public Object getBankingStatistics(String memberId) {
    	float nextAll = 0f;//全部待收本息
    	float alrReceInterest = 0f;//已赚利息
    	float alrOverdueInterest = 0f;//已赚逾期罚息 
    	float alrReceMoney = 0f;//已回收本息 
    	float totalBorrowMoney = 0f;//总借出金额
    	JSONObject obj = new JSONObject();//定义json对象
    	
    	//计算全部待收本息
    	ReceivablesNotesDetailExample receivablesNotesDetailExample = new ReceivablesNotesDetailExample();
    	receivablesNotesDetailExample.createCriteria().andMemberIdEqualTo(memberId).andReceStateEqualTo("notReceiving");
    	//查询所有符合条件的收款记录明细，然后通过for循环,计算出本息
    	List<ReceivablesNotesDetail> receivablesNotesDetails = receivablesNotesDetailMapper.selectByExample(receivablesNotesDetailExample);//查询属于该会员的已收款的收款记录明细列表
    	for(ReceivablesNotesDetail receivablesNotesDetail : receivablesNotesDetails){
	    		nextAll += receivablesNotesDetail.getCurrentReceMoeny();//计算未来全部待收本息	
    	}
    	//计算全部已赚利息
    	ReceivablesNotesDetailExample receivablesNotesDetailExample2 = new ReceivablesNotesDetailExample();
    	receivablesNotesDetailExample2.createCriteria().andMemberIdEqualTo(memberId).andReceStateEqualTo("alreadReceivables");
    	//查询所有符合条件的收款记录明细，然后通过for循环,计算出本息
    	List<ReceivablesNotesDetail> receivablesNotesDetails2 = receivablesNotesDetailMapper.selectByExample(receivablesNotesDetailExample2);//查询属于该会员的已收款的收款记录明细列表
    	for(ReceivablesNotesDetail receivablesNotesDetail : receivablesNotesDetails2){
	    		alrReceInterest += receivablesNotesDetail.getIncome();//计算出已赚利息
    	}
    	//计算已赚逾期罚息
    	ReceivablesNotesExample receivablesNotesExample = new ReceivablesNotesExample();
    	receivablesNotesExample.createCriteria().andMemberIdEqualTo(memberId);
    	List<ReceivablesNotes> receivablesNotess = receivablesNotesMapper.selectByExample(receivablesNotesExample);
    	for(ReceivablesNotes receivablesNotes : receivablesNotess){
    		alrOverdueInterest += receivablesNotes.getAlrOverdueInterest();//计算已赚逾期罚息
    		alrReceMoney += receivablesNotes.getAlrReceMoney();//计算已回收本息
    	}
    	//计算已回收笔数
    	ReceivablesNotesExample receivablesNotesExample2 = new ReceivablesNotesExample();
    	receivablesNotesExample2.createCriteria().andMemberIdEqualTo(memberId).andReceStateEqualTo("Receivables");
    	List<ReceivablesNotes> receivablesNotess2 = receivablesNotesMapper.selectByExample(receivablesNotesExample2);
    	//计算总借出金额
    	TenderNotesExample tenderNotesExample = new TenderNotesExample();
    	tenderNotesExample.createCriteria().andMemberIdEqualTo(memberId);
    	List<TenderNotes> tenderNotess = tenderNotesMapper.selectByExample(tenderNotesExample);
    	for(TenderNotes tenderNotes : tenderNotess){
    		if(tenderNotes.getSubTotal() == 0.0){
    			totalBorrowMoney += tenderNotes.getTenderMoney();
    		}else{
    			totalBorrowMoney += tenderNotes.getLowestSub() * tenderNotes.getSubSum();
    		}
    	}
    	
    	 //将计算出来的数据放到json对象中
		obj.put("nextAll", nextAll);
		obj.put("alrReceInterest", alrReceInterest);
		obj.put("alrOverdueInterest", alrOverdueInterest);
		obj.put("totalBorrowNum", receivablesNotess.size());
		obj.put("alrReceMoney", alrReceMoney);
		obj.put("alrReceNum", receivablesNotess2.size());
		obj.put("nextReceNum", receivablesNotess.size() - receivablesNotess2.size());
		obj.put("totalBorrowMoney", totalBorrowMoney); 
        return obj;
    }

}
