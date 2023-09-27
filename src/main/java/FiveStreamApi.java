import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class FiveStreamApi {

    public static void DemoStreamfive() {

        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> AL = new ArrayList<String>();

        System.out.println("Enter login: ");
        while (true) {
            System.out.print("login = ");
            s = scanner.nextLine();
            if (s.equals("")==true)
                break;
            AL.add(s);
        }
        System.out.println();

        System.out.println("AL = " + AL);

        Predicate<String> fn;


        fn = (str) -> {
            if (str.charAt(0)=='f')
                return true;
            return false;
        };

        Stream<String> stream = AL.stream();


        Stream<String> resStream = stream.filter(fn);

        System.out.println("count = " + resStream.count());
    }

}