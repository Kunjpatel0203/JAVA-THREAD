import java.io.*;  
import java.io.IOException;  
public class CreateFileExample1   
{  
  public static void main(String[] args)   
   {     
     File file = new File("C:\\Users\\Krishna\\Desktop\\java\\FileProperties.java"); //initialize File object and passing path as argument  
     boolean result;  
      try   
      {  
        result = file.createNewFile();  //creates a new file  
        if(result)      // test if successfully created a new file  
         {  
            System.out.println("file created "+file.getAbsolutePath()); //returns the path string  
         }  
        else  
         {  
           System.out.println("File already exist at location: "+file.getAbsolutePath());  
         }  
      }   
     catch (IOException e)   
     {  
         e.printStackTrace();    //prints exception if any  
     }         
   }  
} 