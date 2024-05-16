import java.io.*;
class FileCopy
{
  public static void main(String[] args) throws IOException
   {
	   FileInputStream fis = null;
	   FileOutputStream fos = null;
	   
	   byte readByte;
	   if(args.length!=2)
	   {
		   System.exit(0);
	   }
	   fis = new FileInputStream(args[0]);
	   File outFile = new File(args[1]);
	   
	   if(outFile.exists())
	   {
		   System.out.println("File exists");
		   return;
	   }
	   else
	   {
		   fos = new FileOutputStream(args[1]);
		   do
		   {
			   readByte = (byte)fis.read();
			   fos.write(readByte);
		   }
		   while(readByte!=-1);
	   }
	   fis.close();
	   fos.close();
	   
   }
}