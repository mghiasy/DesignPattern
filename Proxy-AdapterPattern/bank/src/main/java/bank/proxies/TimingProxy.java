package bank.proxies;
import bank.domain.StopWatch;

import java.lang.reflect.*;

public class TimingProxy implements InvocationHandler {
    private Object target;

    public TimingProxy(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StopWatch stopWatch= new StopWatch();
        stopWatch.start();
        //invoke the method on target
        Object retVal= method.invoke(target,args);

        stopWatch.stop();
        System.out.println("The method "+method.getName()+ " tooks "+ stopWatch.getSpendTime()+" ms ");
        return retVal;
    }
}
