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
import com.glacier.netloan.dto.query.borrow.ReceivablesNotesQueryDTO;
import com.glacier.netloan.entity.borrow.ReceivablesNotes;
import com.glacier.netloan.service.borrow.ReceivablesNotesService;
/**
 * @ClassName: ReceivablesNotesController 
 * @Description: TODO(收款记录控制层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-9下午4:49:55
 */
@Controller
@RequestMapping(value = "/receivablesNotes")
public class ReceivablesNotesController extends AbstractController{
	@Autowired
	private ReceivablesNotesService receivablesNotesService;// 注入收款记录业务Bean

	// 进入收款记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPreview() {
        ModelAndView mav = new ModelAndView("borrow_mgr/receivablesNotes_mgr/receivablesNotes");
        return mav;
    }
    
    // 进入收款记录Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoReceivablesNotesFormPreview(String receNotesId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/receivablesNotes_mgr/receivablesNotes_form");
        if(StringUtils.isNotBlank(receNotesId)){
            mav.addObject("receivablesNotesData", receivablesNotesService.getReceivablesNotes(receNotesId));
        }
        return mav;
    }
    
    // 进入收款记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoReceivablesNotesDetailPage(String receNotesId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/receivablesNotes_mgr/receivablesNotes_detail");
        if(StringUtils.isNotBlank(receNotesId)){
            mav.addObject("receivablesNotesData", receivablesNotesService.getReceivablesNotes(receNotesId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer,ReceivablesNotesQueryDTO receivablesNotesQueryDTO) {
        return receivablesNotesService.listAsGrid(pservicer,receivablesNotesQueryDTO);
    }
    
    // 增加收款记录
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addReceivablesNotes(@Valid ReceivablesNotes review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
       // return receivablesNotesService.addReceivablesNotes(review);
        return null;
    }
    
    // 修改收款记录
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editReceivablesNotes(@Valid ReceivablesNotes review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return receivablesNotesService.editReceivablesNotes(review);
    }
    
    // 批量删除收款记录
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delReceivablesNotes(@RequestParam List<String> receNotesIds,@RequestParam List<String> receivablesNotesTitle) {
    	return receivablesNotesService.delReceivablesNotes(receNotesIds, receivablesNotesTitle);
    }
}
