class Thread_Priority
{
  public static void main(String args[])
  {
    Thread t = new Thread();
	System.out.println(t.getPriority());
	t.setPriority(Thread.MIN_PRIORITY);
	System.out.println(t.getPriority());
  }

}