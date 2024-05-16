public class ThreadGroupDemo implements Runnable{    
    public void run() {    
          System.out.println(Thread.currentThread().getName());    
    }    
   public static void main(String[] args) {    
      ThreadGroupDemo runnable1 = new ThreadGroupDemo();    
          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");    
              
          Thread t1 = new Thread(tg1, runnable1,"one");    
          t1.start();    
          Thread t2 = new Thread(tg1, runnable1,"two");    
          t2.start();    
          Thread t3 = new Thread(tg1, runnable1,"three");    
          t3.start();    
          
		  System.out.println("Thread Group Name: "+tg1.getName());    
          try{tg1.wait();} catch(Exception e){}
		  
		  System.out.println("All threads in waiting mode");  
		  
    
    }    
   } 