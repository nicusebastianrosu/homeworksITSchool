import java.util.Scanner;

public class ZileleSaptamanii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intre 1 si 7: ");
        int zi = scanner.nextInt();

        String numeZi = switch (zi) {
            case 1 -> "Luni";
            case 2 -> "Marti";
            case 3 -> "Miercuri";
            case 4 -> "Joi";
            case 5 -> "Vineri";
            case 6 -> "Sambata";
            case 7 -> "Duminica";
            default -> "un numar gresit, trebuie sa dati un numar intre 1 si 7";
        };

        System.out.println("Ziua saptamanii este: " + numeZi);
    }
}
