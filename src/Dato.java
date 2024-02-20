public class Dato {
    public static void main(String[] args) {
        int year = 2024;
        String month = "febuar";
        int date = 5;
        String day = "Mandag";
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        System.out.println(day);
        String amerikanskDato = (day + ", " + month + " " + date + ", " + year);
        System.out.println(amerikanskDato);
        String europæiskFormat = (day + " " + date + " " + month + " " + year);
        System.out.println(europæiskFormat);


    }
}
