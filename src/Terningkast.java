import java.util.Random;
import java.util.Scanner;

public class Terningkast {
    public static void main(String[] args) {

        Random rand = new Random();
        int sum = 0;
                    int forsøg = 0;


        while (!(sum == 7)) {
            int terningKast = rand.nextInt(1,7);
            int terningKast1 = rand.nextInt(1,7);
            sum = terningKast1 + terningKast;
            System.out.println(terningKast + " + " + terningKast1 + " = " + sum);
            forsøg++;
            System.out.println( "Du ramte summen 7 efter " + forsøg +  " forsøg");
        }

        {

        }
    }}
