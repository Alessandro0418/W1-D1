import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Perimetro del rettangolo ---
        System.out.print("Inserisci il lato A del rettangolo: ");
        double latoA = scanner.nextDouble();

        System.out.print("Inserisci il lato B del rettangolo: ");
        double latoB = scanner.nextDouble();

        double perimetroRett = perimetroRettangolo(latoA, latoB);
        System.out.println("Perimetro rettangolo: " + perimetroRett);

        // --- Pari o dispari ---
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        int risultato = pariDispari(numero);
        if (risultato == 0) {
            System.out.println("Il numero è pari.");
        } else {
            System.out.println("Il numero è dispari.");
        }

        // --- Area del triangolo (Erone) ---
        System.out.print("Inserisci il lato 1 del triangolo: ");
        double lato1 = scanner.nextDouble();
        System.out.print("Inserisci il lato 2 del triangolo: ");
        double lato2 = scanner.nextDouble();
        System.out.print("Inserisci il lato 3 del triangolo: ");
        double lato3 = scanner.nextDouble();

        double area = perimetroTriangolo(lato1, lato2, lato3);
        System.out.println("Area del triangolo: " + area);

        scanner.close();
    }

    // Calcola il perimetro di un rettangolo
    public static double perimetroRettangolo(double a, double b) {
        return 2 * (a + b);
    }

    // Ritorna 0 se pari, 1 se dispari
    public static int pariDispari(int numero) {while ()
        return numero % 2;
    }

    // Calcola l'area di un triangolo con la formula di Erone
    public static double perimetroTriangolo(double a, double b, double c) {
        double s = (a + b + c) / 2; // semiperimetro
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
