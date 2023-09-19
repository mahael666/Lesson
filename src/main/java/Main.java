
import java.util.*;

public class Main {
    public static void main(String[] arg) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("E");
        arrayList.add("E");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("F");
        arrayList.add("G");
        Set<String> set = new LinkedHashSet<>(arrayList);
        HashMap< String, Integer> hm = new HashMap<>();
        for (Map.Entry<String, Integer> o : hm.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        System.out.println(arrayList);
        System.out.println(set);
    }


}
