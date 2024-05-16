import java.io.*;
class BinaryReadWrite
{
  public static void main(String[] args) throws IOException
   {
	   DataInputStream dis = null;
	   DataOutputStream dos= null;
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
	 //Writing data
	 
		 dos = new DataOutputStream(new FileOutputStream(f));
		 for(int i=0; i<10; i++)
			 dos.writeInt((int)(Math.random()*1000));
	 
	 //Reading data
		 dis = new DataInputStream(new FileInputStream(f));
		 for(int i=0; i<10; i++)
			 System.out.println(dis.readInt()+"");

   }
}