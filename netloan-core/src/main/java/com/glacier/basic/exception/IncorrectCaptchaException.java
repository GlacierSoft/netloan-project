package com.glacier.basic.exception;

import org.apache.shiro.authc.AuthenticationException;

@SuppressWarnings("serial")
public class IncorrectCaptchaException extends AuthenticationException{ 
    
    public IncorrectCaptchaException() { 
       super(); 
    } 
    
    public IncorrectCaptchaException(String message, Throwable cause) { 
       super(message, cause); 
    } 
    
    public IncorrectCaptchaException(String message) { 
       super(message); 
    } 
    
    public IncorrectCaptchaException(Throwable cause) { 
       super(cause); 
    } 
  }
