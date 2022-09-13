package ss4_Object.StopWatch;
import java.util.Scanner;
import java.util.Date;
public class StopWatch {
    private long startTime,endTime;
    public StopWatch(){

    }
    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void end(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return (getEndTime()-getStartTime());
    }
}
