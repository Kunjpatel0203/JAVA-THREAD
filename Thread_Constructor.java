class Thread_Constructor implements Runnable
{  Thread t;
	Thread_Constructor()
	{
		t= new Thread(this);
		t.start();
		
	}
	
  public void run()
  {
	  for(int i=1; i<=10; i++)
	  {   
		  System.out.println("Thread Run:" +i);
	  }
  }
  
  public static void main(String args[])
  { 
    Thread_Constructor d1 = new Thread_Constructor();
  }


}