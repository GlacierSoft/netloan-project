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
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.service.borrow.TenderNotesService;

@Controller
@RequestMapping(value = "/tenderNotes")
public class TenderNotesController extends AbstractController{
	@Autowired
	private TenderNotesService tenderNotesService;// 注入投标记录业务Bean

	// 进入投标记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPreview() {
        ModelAndView mav = new ModelAndView("borrow_mgr/tenderNotes_mgr/tenderNotes");
        return mav;
    }
    
    // 进入投标记录Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoTenderNotesFormPreview(String tenderNotesId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/tenderNotes_mgr/tenderNotes_form");
        if(StringUtils.isNotBlank(tenderNotesId)){
            mav.addObject("tenderNotesData", tenderNotesService.getTenderNotes(tenderNotesId));
        }
        return mav;
    }
    
    // 进入投标记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoTenderNotesDetailPage(String tenderNotesId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/tenderNotes_mgr/tenderNotes_detail");
        if(StringUtils.isNotBlank(tenderNotesId)){
            mav.addObject("tenderNotesData", tenderNotesService.getTenderNotes(tenderNotesId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer) {
        return tenderNotesService.listAsGrid(pservicer);
    }
    
    // 增加投标记录
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addTenderNotes(@Valid TenderNotes review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return tenderNotesService.addTenderNotes(review);
    }
    
    // 修改投标记录
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editTenderNotes(@Valid TenderNotes review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return tenderNotesService.editTenderNotes(review);
    }
    
    // 批量删除投标记录
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delTenderNotes(@RequestParam List<String> tenderNotesIds,@RequestParam List<String> tenderNotesTitle) {
    	return tenderNotesService.delTenderNotes(tenderNotesIds, tenderNotesTitle);
    }
}
