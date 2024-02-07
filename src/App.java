import java.util.LinkedHashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> list = new LinkedHashSet<String>();

        while(sc.hasNext()){
            String a = sc.nextLine();
            list.add(a);
        }

        System.out.println(list.size());
        sc.close();
    }
}
