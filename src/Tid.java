public class Tid {
    public static void main(String[] args) {
        String Timer = "timer 14";
        String Minutter = "minutter 45";
        String Sekunder = "sekunder 20";

        int timer = 14;
        int minutter = 45;
        int sekunder = 20;
        System.out.println(timer);
        System.out.println(Sekunder);
        System.out.print(Minutter);
        System.out.println(Timer);

        long sekunderSidenMidnat = timer * 3600 + minutter * 60 + sekunder;
        System.out.println(sekunderSidenMidnat);
        int sekundersidenMidant = 53120;
        long sekunderPåetdøgn = 24 * 3600;
        System.out.println(sekunderPåetdøgn);
        long sekunderTilbage = sekunderPåetdøgn - sekunderSidenMidnat;
        System.out.println("der er " + sekunderTilbage + " sekunder tilbage på døgnet");
        int timerNu = 15;
        int minutterNu= 26;
        int sekunderNu= 15;








    }
}
