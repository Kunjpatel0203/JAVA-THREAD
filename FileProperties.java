import java.io.File;
import java.util.Date;

class FileProperties
{
  public static void main(String args[])
  {
	  File f1 = new File("FileProperties.java");
	  File f2 = new File("D:\\JavaPrograms\\FileProperties.java");
	  System.out.println("Filename::"+f1.getName());
	  System.out.println("Filename::"+f2.getName());

	  System.out.println("Path::"+f1.getPath());
	  System.out.println("Absolute Path::"+f1.getAbsolutePath());
	  System.out.println("Parent"+f1.getParent());
	  System.out.println(f1.exists()?"exists":"does not exist");
	  System.out.println(f1.canWrite()?"is writable":"does not writable");
	  System.out.println(f1.canRead()?"is readable":"does not readable");
	  System.out.println(f1.isDirectory()?"yes":"no");
	  System.out.println(f1.isFile()?"yes":"no");
	  System.out.println(f2.isAbsolute()?"yes":"no");
	  System.out.println("File Last Modified:"+ new Date(f1.lastModified()));
      System.out.println("File size:"+ f1.length()+"bytes");
	  System.out.println(f1.isAbsolute()?"yes":"no");
	  System.out.println("f2 Parent"+f2.getParent());
	  
  }
}