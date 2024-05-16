class MainThreadDemo
{
  public static void main(String args[])
  {
     Thread t = new Thread().currentThread();
	   System.out.println("Current Thread:" + t);
	   t.setName("My first thread");
     System.out.println("After name change:" + t);
  }

}