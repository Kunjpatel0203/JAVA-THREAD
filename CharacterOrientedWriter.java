import java.io.IOException;
import java.io.*;

class CharacterOrientedWriter
{
  public static void main(String[] args) throws IOException
 {
	 FileWriter fw = null;
	  if(args.length!=1)
      {
	   System.out.println("Usage:Java File Read");
	   System.exit(0);
      }
	  //File file = new File(args[0]);
	  //if(file.exists())
	 // {
	 // System.out.println("The file"+args[0]+"already exists"+"deletee it, and re rurn");
	 // System.exit(0);
	 // }
	 fw = new FileWriter(args[0]);
	 fw.write("Hello to java programming");
	 System.out.println("writing complete");
	 if(fw!=null)
	 {
		 fw.close();
	 }
 }
}