public class Clock {

    public void ticking() throws InterruptedException {
        Thread.sleep(1);
    }

    public void alarming() throws InterruptedException {
        Thread.sleep(10);
    }

    public void broken() throws InterruptedException {
        Thread.sleep(1000);
    }

}
