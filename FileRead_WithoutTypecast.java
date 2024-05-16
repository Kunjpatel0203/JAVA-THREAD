import java.io.FileInputStream;
import java.io.IOException;

class FileRead_WithoutTypecast
{
 public static void main(String[] args) throws IOException
 {
   if(args.length!=1)
   {
	   System.out.println("Usage:Java File Read");
	   System.exit(0);
   }
   
   FileInputStream fis = new FileInputStream(args[0]);
   int size;
   size= fis.available();
   System.out.println("The File"+args[0]+"has"+size+"bytes");
   System.out.println("Content Of File");
   for(int i=0; i<size; i++)
   {
	   System.out.print(fis.read());
   }
 }

}