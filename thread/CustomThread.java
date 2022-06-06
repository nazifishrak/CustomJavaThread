package thread;

public class CustomThread extends Thread {

//-----------------Fields--------------------------
    private String threadName;
    private Integer startingPoint;
    private Integer timeDelay;
    private Integer counter;
    private boolean threadAliveFlag;
    private Integer adder;

// ------------------Constructor----------------------

    public CustomThread(String threadName, Integer startingPoint, Integer timeDelay, boolean threadAliveFlag
    , Integer adder) {
        this.threadName = threadName;
        this.startingPoint = startingPoint;
        this.timeDelay = timeDelay;
        this.threadAliveFlag = threadAliveFlag;
        this.adder = adder;
    }

    @Override
    public void run() {
        counter = startingPoint;
        while (threadAliveFlag) {
            counter+=adder;
            try {
                sleep(timeDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void stopThread() {
         threadAliveFlag = false;
    }

    //------------------Getters and Setters-------------------------------

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public Integer getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(Integer startingPoint) {
        this.startingPoint = startingPoint;
    }

    public Integer getTimeDelay() {
        return timeDelay;
    }

    public void setTimeDelay(Integer timeDelay) {
        this.timeDelay = timeDelay;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public boolean isThreadAliveFlag() {
        return threadAliveFlag;
    }

    public void setThreadAliveFlag(boolean threadAliveFlag) {
        this.threadAliveFlag = threadAliveFlag;
    }

    public Integer getAdder() {
        return adder;
    }

    public void setAdder(Integer adder) {
        this.adder = adder;
    }
}
