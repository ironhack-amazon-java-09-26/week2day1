import java.util.ArrayList;
import java.util.List;

public class HelloArrays {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println(numbers);

        List<String> names2 = new ArrayList<>(List.of("Salva", "Juan", "Pedro", "Maria"));

        System.out.println(names);

        names.add("Salva");
        names.add("Juan");
        names.add("Pedro");
        names.add("Maria");

        System.out.println(names);

        names.remove(0);
        System.out.println(names);

        System.out.println(names.contains("Pedro"));

        System.out.println(names.get(2)); // names[2] in classic arrays

        System.out.println(names.size());

        System.out.println(names.remove("Juan"));
        System.out.println(names);

        System.out.println(names.indexOf("Maria"));
        names.removeLast();
        System.out.println(names);

        names.add("Leo");
        System.out.println(names);



    }
}
