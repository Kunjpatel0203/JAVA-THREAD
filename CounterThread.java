class CounterThread implements Runnable
{   Thread t;
	CounterThread()
	{
		t= new Thread(this, "Thread Example");
		System.out.println("Detail of child thread"+t);
		t.start();
	}
	public void run()
	{
		try{
			for(int i=1; i<=5; i++)
			{
				System.out.println("Child:"+i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println("Child thread interrupted");
		}
      System.out.println("Exit from Child thread");		
	}
	
	public static void main(String args[])
	{
		new CounterThread();
		try{
			for(int i=1; i<=5; i++)
			{
				System.out.println("Main:"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Main thread interrupted");
		}
      System.out.println("Exit from Main thread");	
	}
}