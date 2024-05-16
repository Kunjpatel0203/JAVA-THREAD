import java.io.*;
class TextWrite
{
  public static void main(String[] args) throws IOException
   {
	   if(args.length!=1)
	   {
		   System.out.println("Usage:Java File Read");
		   System.exit(0);
		}
		File f = new File(args[0]);
		if(f.exists())
		{
			System.out.println("The file"+args[0]+"already exists"+"deletee it, and re rurn");
			System.exit(0);
		}
		
		//Writing data as text
		
	PrintWriter pw = new PrintWriter(new FileOutputStream(f));
	 for(int i=0;i<10;i++)
	 {
		 pw.println((int)(Math.random()*1000)+"");
	 }
	 if(pw!=null)
	 {
		 pw.close();
	 }
   }
}