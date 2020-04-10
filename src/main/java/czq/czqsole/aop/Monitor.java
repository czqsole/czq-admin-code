package czq.czqsole.aop;

import czq.czqsole.annotation.MethodLog;
import czq.czqsole.domain.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Author: czqsole
 * Date: 2018/9/8
 */
@Aspect
@Component
public class Monitor {

    @Pointcut("execution(* addWork())")
    public void pointCut(){}

    @Before("execution(* czq.czqsole.service.impl.WorkServiceImpl.getAll(..))")
    public void beforeLog() {
        System.out.println("before method.");
    }

    @After("execution(* czq.czqsole.service.impl.WorkServiceImpl.getAll(..))")
    public void afterLog() {
        System.out.println("after method.");
    }

    @Around("@annotation(methodLog)")
    public Object watch(ProceedingJoinPoint point, MethodLog methodLog) throws Throwable {
        methodLog.description();
        point.getArgs();
        try {
            System.out.println("around: before method proceed.");
            Object o = point.proceed();
            System.out.println("around: after method proceed.");
            return o;
        } catch (Exception e) {
            System.out.println("method proceed exception!");
        }
        return null;

    }
}
