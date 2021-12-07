import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
           MyInterface service = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            Scanner scanner =new Scanner(System.in);
            String ch= scanner.nextLine();
            System.out.println(service.Reverse(ch));
            System.out.println(service.MinChar(ch));
            System.out.println(service.CaseChanger(ch));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
