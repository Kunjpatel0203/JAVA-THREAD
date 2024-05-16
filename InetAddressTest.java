import java.net.*;

class InetAddressTest {
  public static void main(String args[]) throws UnknownHostException {
    InetAddress Address = InetAddress.getLocalHost();
    System.out.println(Address);
    Address = InetAddress.getByName("www.ddu.ac.in");
    System.out.println(Address);
    InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
    for (int i = 0; i < SW.length; i++)
      System.out.println(SW[i]);
  }
}