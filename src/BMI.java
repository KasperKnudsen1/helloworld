import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Hej her kan du beregne din BMI");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast din højde i meter: ");
        double højde = scanner.nextDouble();
        System.out.print("Indtast din vægt i kilogram: ");
        double vægt = scanner.nextDouble();
        double bmi = vægt / (højde * højde) ;
        System.out.println("Din BMI er: " + bmi);




        if (bmi < 18.5) {
            System.out.println("Du er undervægtig.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Du er normalvægtig.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Du er overvægtig.");
        } else {
            System.out.println("Du er svært overvægtig.");
        }


    }
}
