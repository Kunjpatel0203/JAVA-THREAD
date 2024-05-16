class ThreadClassDemo extends Thread
{
  public void run()
  {  try{
	  for(int i=1; i<=10; i++)
	  {   //System.out.print(getId() +"");
		  System.out.println("Thread Run:" +i);
		  Thread.sleep(000);
  }}
    catch(Exception e){}
  }
  
  public static void main(String args[])
  {
    ThreadClassDemo d3 = new ThreadClassDemo();
   
	ThreadClassDemo d4 = new ThreadClassDemo();
	d3.start();
	//d4.start();
	
  }


}