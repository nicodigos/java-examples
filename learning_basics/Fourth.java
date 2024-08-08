import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Fourth {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        System.err.println(values);


        HashSet<String> names = new HashSet<>();
        names.add("Nicolas");
        names.add("Tatiana");
        names.add("Nicolas");
        System.err.println(names);

        HashMap<String, Integer> namesAge = new HashMap<>();
        namesAge.put("Nicolas", 30);
        namesAge.put("Tatiana", 28);
        System.err.println(namesAge);

        for (String name: names) {
            System.err.println(name);
        }

    }
}
