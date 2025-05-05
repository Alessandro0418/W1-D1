import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedo tre stringhe all'utente
        System.out.print("Inserisci la prima stringa: ");
        String s1 = scanner.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String s2 = scanner.nextLine();

        System.out.print("Inserisci la terza stringa: ");
        String s3 = scanner.nextLine();

        // Concatenazione in ordine normale
        String normale = s1 + s2 + s3;
        System.out.println("Concatenazione in ordine: " + normale);

        // Concatenazione in ordine inverso
        String inverso = s3 + s2 + s1;
        System.out.println("Concatenazione in ordine inverso: " + inverso);

        scanner.close();
    }
}
