public class Exercise1 {

    public static void main(String[] args) {
        moltiplica(3, 5);
        concatena("Numero scelto: ", 7);

        String[] array = {"Uno", "Due", "Tre", "Quattro", "Cinque"};
        inserisceInArray(array, "Nuovo");
    }

    // Metodo 1: stampa il prodotto
    public static void moltiplica(int a, int b) {
        int risultato = a * b;
        System.out.println("Moltiplica: " + a + " * " + b + " = " + risultato);
    }

    // Metodo 2: stampa la stringa concatenata
    public static void concatena(String s, int n) {
        String risultato = s + n;
        System.out.println("Concatena: " + risultato);
    }

    // Metodo 3: stampa il nuovo array con l'inserimento
    public static void inserisceInArray(String[] array, String nuova) {
        if (array.length != 5) {
            System.out.println("Errore: l'array deve avere esattamente 5 elementi.");
            return;
        }

        String[] nuovoArray = new String[6];

        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = nuova;
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        System.out.println("Array modificato:");
        for (int i = 0; i < nuovoArray.length; i++) {
            System.out.println("Posizione " + i + ": " + nuovoArray[i]);
        }
    }
}
