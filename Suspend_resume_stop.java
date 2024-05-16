public class Suspend_resume_stop extends Thread {
    private boolean suspended = false;
    private boolean stopped = false;

    @Override
    public void run() {
        while (!stopped) {//stopped==false
            try {
                // System.out.println(!stopped);
                Thread.sleep(500);// Simulate some work
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                }
            } catch (Exception e) {}
            System.out.println("Thread is running...");
        }
    }

    void suspendThread() {
        suspended = true;
    }

    void resumeThread() {
        suspended = false;
        synchronized (this) {
            notify();
        }
    }

    void stopThread() {
        stopped = true;
        resumeThread(); // Resume the thread to allow it to exit gracefully
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        Suspend_resume_stop myThread = new Suspend_resume_stop();
        myThread.start();

        Thread.sleep(1000);//Thread t=Thred.currentThread();

        myThread.suspendThread();
        System.out.println("Thread suspended for 2 seconds...");
        Thread.sleep(2000);

        myThread.resumeThread();
        System.out.println("Thread resumed for 2 seconds...");
        Thread.sleep(2000);

        myThread.stopThread();
        System.out.println("Thread stopped.");
    }
}