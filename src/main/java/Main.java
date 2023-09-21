
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
        System.out.println(arrayList);
        System.out.println(set);

        HashMap< String, Integer> hm = new HashMap<>();
        for (String key : arrayList) {
            var value = hm.get(key);

            if (value != null) {
                hm.put(key, value + 1);
            } else {
                hm.put(key, 1);
            }
        }
        System.out.println(hm);

        Phonebook phonebook = new Phonebook();

        phonebook.add("Пудов", "89999999999");
        phonebook.add("Сидоров", "89999999998");
        phonebook.add("Пудов", "89999999997");
        phonebook.add("Петров", "89999999996");
        phonebook.add("Федоров", "89999999995");
        phonebook.add("Пупков", "89999999994");
        phonebook.add("Панкратов", "89999999993");
        phonebook.add("Пудов", "89999999992");
        phonebook.add("Сидоров", "89999999991");
        phonebook.add("Петров", "89999999990");

        System.out.println(phonebook);

        System.out.println(phonebook.get("Пудов"));

    }


}
