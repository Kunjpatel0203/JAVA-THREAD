class adminThread extends Thread {
   adminThread() {
      setDaemon(false);
   }
   public void run() {
      boolean d = isDaemon();
      System.out.println("daemon = " + d);
   }
}

public class DaemonThreadDemo {
   public static void main(String[] args) throws Exception {
      Thread thread = new adminThread();
      System.out.println("thread = " + thread.currentThread());
      thread.setDaemon(false);
      thread.start();
   }
}