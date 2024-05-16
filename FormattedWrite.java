import java.io.*;
class FormattedWrite
{
  public static void main(String[] args) throws IOException
   {
	//formatting integer data
    System.out.printf("%d %d %05d %5d %5d\n",9,-9,9,9,9);
	System.out.printf("%d\n",100);
	System.out.printf("%d\n",-100);
	//formatting floating data
	System.out.printf("%.2f\n",9999.996);
	System.out.printf("%.2f\n",9999.99);
	System.out.printf("%.2f\n",-9999.99);
    System.out.printf("%,.2f\n",-9999.99);
	
   }
   
}