import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class StreamAPI {

    public static void streamAPI() {
        String[] AS = {"f10", "f15", "f2", "f4", "f4"};

        ArrayList<String> AL = new ArrayList<String>(AS.length);

        for (int i=0; i<AS.length; i++)
            AL.add(i, AS[i]);

        Stream<String> stream = AL.stream();
        Stream<String> streamSorted = stream.sorted();


        Consumer<String> action = (str) -> {
            System.out.println(str);
        };

        streamSorted.forEach(action);

        Comparator<String> comparator;

        comparator = (str1, str2) -> {
            return str2.compareTo(str1);
        };

        stream = AL.stream();

        Stream<String> streamSortedDesc = stream.sorted(comparator);

        System.out.println("-----------------------");
        streamSortedDesc.forEach(action);
    }
}