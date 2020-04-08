package bank.domain;

public class StopWatch {
    private long start=0;
    private long stop=0;
    private long spendTime=0;
    public void start(){
        start= System.currentTimeMillis();
    }
    public void stop(){
        stop= System.currentTimeMillis();
    }
    public long getSpendTime(){
        spendTime= stop-start;
        return spendTime;
    }
}
