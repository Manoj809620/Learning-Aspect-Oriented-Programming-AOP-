package in.main.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class Aspectclass {
    @Before("execution(* in.main.*.*.*(..))")
    public void before(JoinPoint js) {
        System.out.println("starting .............");
    }
    @After("execution(* in.main.*.*.*(..))")
    public void After(JoinPoint js) {
        System.out.println("stoping ..................");
    }
}
