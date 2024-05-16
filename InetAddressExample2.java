import java.net.*;

public class InetAddressExample2 {

public static void main(String[] args) throws UnknownHostException{

		// To get and print InetAddress of Named Hosts
	InetAddress address1 = InetAddress.getByName("test");
InetAddress address2 = InetAddress.getByName("test1");
boolean x=address1.equals(address2);
System.out.println(x);
	/*System.out.println("Inet Address of named hosts : "+ address1);
		// To get and print ALL InetAddress of Named Host
	InetAddress arr[] = InetAddress.getAllByName("www.gmail.com");

	System.out.println("\nInet Address of ALL named hosts :");

	for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}*/
	}
}