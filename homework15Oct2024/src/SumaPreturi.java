public class SumaPreturi {
    public static void main(String[] args) {
        double[] preturi = {23.5, 45.0, 67.8, 101.2, 34.6, 78.9};
        double sum = 0.0;
        int i = 0;

        while (i < preturi.length) {
            if (preturi[i] > 100) {
                break;
            }
            sum += preturi[i];
            i++;
        }

        System.out.println("Suma prețurilor până un preț mai mare de 100 este: " + sum);
    }
}
