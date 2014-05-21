package com.glacier.netloan.service.borrow;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


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
	
	
	/**
	 * @Title: getAttentionBorrowing 
	 * @Description: TODO(根据关注借款Id获取关注借款信息) 
	 * @param @param attentionBorrowingId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getAttentionBorrowing(String attentionBorrowingId) {
    	
        return null;
    }

}
