package team.codedone.guice.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MessageLogger implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] objectArray = invocation.getArguments();
        for (Object object : objectArray) {
            System.out.println("=========> " + object.toString());
        }
        return invocation.proceed();
    }
}
