import java.io.*;
class ByteArrayReading
{
   public static void main(String[] args) throws IOException
   {
    String inputString="Information Technology";
	byte[] b = inputString.getBytes();
	ByteArrayInputStream bias = new ByteArrayInputStream(b);
	int c;
	while((c=bias.read())!=-1)
	{
		System.out.print((char)c);
	}
	bias.reset();
	System.out.println();
	while((c=bias.read())!=-1)
	{
		System.out.print(Character.toUpperCase((char)c));
	}
   }
}