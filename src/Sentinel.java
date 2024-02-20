import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int SENTINEL = -1;
        int sum = 0;
        System.out.println("Indtast tal eller indtast " + SENTINEL + " for at stoppe");
        int i = 0;
        while(i != SENTINEL){
            System.out.println("Skriv et tal");
            i = scanner.nextInt();
            if(i != SENTINEL){
                sum += i;


            }
System.out.println("Summen af dine indtastede tal" + sum);

        }


    }
}


