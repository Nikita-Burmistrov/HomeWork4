import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Введите любых 2 слова или фразу: ");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        String a = sc.nextLine();
        System.out.println(b.toUpperCase() + " " + a.toUpperCase());
    }
}