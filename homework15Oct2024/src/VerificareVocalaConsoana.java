import java.util.Scanner;

public class VerificareVocalaConsoana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti o litera: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " este o vocală.");
                break;
            default:
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println(ch + " este o consoană.");
                } else {
                    System.out.println("Invalid input.");
                }
                break;
        }


    }
}