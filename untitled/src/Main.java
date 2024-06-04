import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) {
        Dockt dockt = new Dockt("Hello", "World");

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        HashMap<Integer, Dockt> map = new HashMap<>();
        map.put(1, new Dockt("Hello", "World"));


        for (int i = 0; i < 10; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("Hello World\n");
            sb.append(map.get(i));

            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            list.add(name);
            System.out.println("Hello " + name + "!");
            System.out.println(list);

        }
    }
}