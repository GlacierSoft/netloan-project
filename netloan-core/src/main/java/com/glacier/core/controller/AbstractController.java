package com.glacier.core.controller;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.validation.BindingResult;

import com.glacier.jqueryui.util.JqReturnJson;

public abstract class AbstractController {

    protected Object returnErrorBindingResult(BindingResult bindingResult) {
        return new JqReturnJson(bindingResult.getFieldErrors().get(0).getDefaultMessage());
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
