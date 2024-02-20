import java.util.Scanner;

public class tommer {
    public static void main(String[] args) {
        System.out.println("Hej her kan du omregne tommer til centimeter");
        System.out.println("Skriv blot hvor mange tommer og programmet udregner selv hvor mange centimeter det er.");
        Scanner input = new Scanner(System.in);



        double tommer = input.nextDouble();

        double centimeter = tommer * 2.54;




        System.out.println(tommer + " tommer " + "er det samme som " + centimeter + " centimeter");





    }
}
