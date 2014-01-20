package com.glacier.netloan.util;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.entity.sysmgr.User;

@Aspect
@Component
public class MethodLogAspectJ {

    @Pointcut("@annotation(com.glacier.netloan.util.MethodLog)")
    public void methodCachePointcut() {
    }

    /**
     * 
    * @Title: methodCacheHold 
    * @Description: TODO(此方法后期用来记录用户的操作日志) 
    * @param @param joinPoint
    * @param @return
    * @param @throws Throwable 
    * @return Object 
    * @throws
     */
    @SuppressWarnings("rawtypes")
    @Around("methodCachePointcut()")
    public Object methodCacheHold(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            Object result = null;// 方法执行结果
            result = joinPoint.proceed();// 处理完毕，进行日志写入
            String targetName = joinPoint.getTarget().getClass().getName();// 目标类
            String methodName = joinPoint.getSignature().getName();// 目标方法
            boolean success = false;// 操作结果
            String operaInform = "";// 通知
            String methode = "";// 操作描述
            String operaTime = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date());
            String operator = ((User)SecurityUtils.getSubject().getPrincipal()).getUsername();
            Object[] arguments = joinPoint.getArgs();
            Class targetClass = Class.forName(targetName);
            Method[] method = targetClass.getMethods();
            for (Method m : method) {
                if (m.getName().equals(methodName)) {
                    Class[] tmpCs = m.getParameterTypes();
                    if (tmpCs.length == arguments.length) {
                        MethodLog methodCache = m.getAnnotation(MethodLog.class);
                        methode = methodCache.opera();
                        break;
                    }
                }
            }
            if (result instanceof JqReturnJson) {
                success = ((JqReturnJson) result).isSuccess();
                operaInform = ((JqReturnJson) result).getMsg();
            }
            System.out.println(targetName);
            System.out.println(methodName);
            System.out.println(success);
            System.out.println(operaInform);
            System.out.println(methode);
            System.out.println(operaTime);
            System.out.println(operator);
            return result;
        } catch (Exception e) {
            // 异常处理记录日志..log.error(e);
            throw e;
        }
    }
}
