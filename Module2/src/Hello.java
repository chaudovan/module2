import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên : ");
        name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
