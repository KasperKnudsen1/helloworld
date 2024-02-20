import java.util.Scanner;

public class k {

    public class TommerTilCentimeter {

        public static void main(String[] args) {
            // Programpræsentation
            System.out.println("Velkommen til Tommer til Centimeter konvertering!");

            // Opret en Scanner til at læse brugerinput
            Scanner scanner = new Scanner(System.in);

            // Bed brugeren om at indtaste længden i tommer
            System.out.print("Indtast længde i tommer (brug punktum for kommatal): ");

            // Læs brugerens input som en kommatal-værdi
            double tommer = scanner.nextDouble();

            // Luk scanneren for at undgå læk af ressourcer
            scanner.close();

            // Konverter tommer til centimeter (1 tomme = 2.54 centimeter)
            double centimeter = tommer * 2.54;

            // Udskriv resultatet
            System.out.println(tommer + " tommer svarer til " + centimeter + " centimeter.");
        }
    }

}
