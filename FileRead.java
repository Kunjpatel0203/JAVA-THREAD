import java.io.*;

class FileRead
{
 public static void main(String[] args) throws IOException
 {
   if(args.length!=1)
   {
	   System.out.println("Java File Read");
	   System.exit(0);
   }
   
   FileInputStream fis = new FileInputStream(args[0]);
   int size;
   size= fis.available();  //return the size of file
   System.out.println("The File"+args[0]+"has"+size+"bytes");
   System.out.println("Content Of File");
   
   for(int i=0; i<size; i++)
   {
	   System.out.print((char)fis.read());
     
   }

    


 }

}