import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("Hello World\n");
        }
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("Hello Java world! "+sb);
    }
}