import java.util.Scanner;
import java.util.function.LongToDoubleFunction;

public class BMIBeregner {
    public static void main(String[] args) {
        System.out.println("Hej her kan du få din BMI beregnet.");
        System.out.println("Du skal blot indtaste din vægt i kg, din højde i centimeter og din højde i meter:");
        Scanner input = new Scanner(System.in);

        double vægt = input.nextDouble();
        double højde = input.nextDouble();
        double højdeM = input.nextDouble();
        System.out.println(vægt / (højde * højdeM) * 100);
        double BMI = (vægt / (højde * højdeM) * 100);
        if (BMI <= 18.5) {
            System.out.println("Du er undervægtig");
        }
        else if (BMI >= 18.5 && BMI <= 24.9) {
        }
        System.out.println("Du er nomralvægtig");
        if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Du er overvægtig");
        } else if (BMI >= 30) {
        }System.out.println("Du er svært overvægtig");

    }}




