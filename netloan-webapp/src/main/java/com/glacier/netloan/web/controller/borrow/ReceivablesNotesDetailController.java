package com.glacier.netloan.web.controller.borrow;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.borrow.ReceivablesNotesDetailQueryDTO;
import com.glacier.netloan.entity.borrow.ReceivablesNotesDetail;
import com.glacier.netloan.service.borrow.ReceivablesNotesDetailService;
/**
 * @ClassName: ReceivablesNotesDetailController 
 * @Description: TODO(收款记录明细控制层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-9下午4:51:48
 */
@Controller
@RequestMapping(value = "/receivablesNotesDetail")
public class ReceivablesNotesDetailController extends AbstractController{
	@Autowired
	private ReceivablesNotesDetailService receivablesNotesDetailService;// 注入收款记录明细业务Bean

	// 进入收款记录明细列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPreview() {
        ModelAndView mav = new ModelAndView("borrow_mgr/receivablesNotesDetail_mgr/receivablesNotesDetail");
        return mav;
    }
    
    // 进入收款记录明细Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoReceivablesNotesDetailFormPreview(String receNotesDetailId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/receivablesNotesDetail_mgr/receivablesNotesDetail_form");
        if(StringUtils.isNotBlank(receNotesDetailId)){
            mav.addObject("receivablesNotesDetailData", receivablesNotesDetailService.getReceivablesNotesDetail(receNotesDetailId));
        }
        return mav;
    }
    
    // 进入收款记录明细Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoReceivablesNotesDetailDetailPage(String receNotesDetailId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/receivablesNotesDetail_mgr/receivablesNotesDetail_detail");
        if(StringUtils.isNotBlank(receNotesDetailId)){
            mav.addObject("receivablesNotesDetailData", receivablesNotesDetailService.getReceivablesNotesDetail(receNotesDetailId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer,ReceivablesNotesDetailQueryDTO receivablesNotesDetailQueryDTO) {
        return receivablesNotesDetailService.listAsGrid(pservicer,receivablesNotesDetailQueryDTO);
    }
    
    // 增加收款记录明细
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addReceivablesNotesDetail(@Valid ReceivablesNotesDetail review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        } 
        return null;
    }
    
    // 修改收款记录明细
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editReceivablesNotesDetail(@Valid ReceivablesNotesDetail review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return receivablesNotesDetailService.editReceivablesNotesDetail(review);
    }
    
    // 批量删除收款记录明细
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delReceivablesNotesDetail(@RequestParam List<String> receNotesDetailIds,@RequestParam List<String> receivablesNotesDetailTitle) {
    	return receivablesNotesDetailService.delReceivablesNotesDetail(receNotesDetailIds, receivablesNotesDetailTitle);
    }
}
