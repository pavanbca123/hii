import java.net.UnknownHostException;
import java.util.Date;
import java.util.Scanner;

public class Ex{

    public static void main(String[] args) throws UnknownHostException {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter name: ");
            String name = sc.nextLine();
        }

        Date cur = new Date();
        System.out.println(cur.toString());

        java.net.InetAddress ip = java.net.InetAddress.getLocalHost();
        System.out.println(ip.getHostAddress());
    }
}