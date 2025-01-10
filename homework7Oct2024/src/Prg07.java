public class Prg07 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Inainte de schimb: a= " + a + " , b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Dupa schimb schimb: a= " + a + " , b = " + b);

    }
}
