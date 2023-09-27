import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TrainStreamAPI {

    public static void DemoStream() {

        ArrayList<Integer> AL = new ArrayList<Integer>();
        int number;
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            number = rnd.nextInt() % 100;
            AL.add(number);
        }
        System.out.println("Array AL:");
        System.out.println(AL);
        Stream<Integer> st = AL.stream();

        Predicate<Integer> fn;
        fn = (n) -> (n % 2) == 0;
        Stream<Integer> resStream = st.filter(fn);
        System.out.println("n = " + resStream.count());

    }
}