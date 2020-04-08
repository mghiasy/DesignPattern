package bank.domain;

import java.lang.reflect.*;
import java.util.logging.Logger;

public class LoggingProxy implements InvocationHandler {
    private Object target;
    MethodLogger logger= new MethodLogger();

    public LoggingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnVal = method.invoke(target,args);
        logger.log("Calling method "+method.getName() + "with args : ");
        for (int p=0; p<args.length;p++){
            logger.log(" param["+p+"]");
        }
        return returnVal;
    }
}
