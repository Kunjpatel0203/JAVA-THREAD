import java.io.*;
class TokenizeFile
{
  public static void main(String[] args) throws IOException
   {
	   if(args.length!=1)
      {
	   System.out.println("Usage:Java File Read");
	   System.exit(0);
      }
	  FileReader fs = new FileReader(args[0]);
	  StreamTokenizer st = new StreamTokenizer(fs);
	  int t;
	  double sum=0.0;
	  while((t=st.nextToken())!=st.TT_EOF)
	  {
		  if(t==st.TT_NUMBER)
		  {
			 System.out.println(st.nval+" ");
			 sum+=st.nval;
		  }
		 else if(t==st.TT_WORD)
		  {
			  System.out.println(st.sval+" "+"is not a number");
		  }
		  
	  }
	  System.out.println("sum of above number is"+sum);
   }
}