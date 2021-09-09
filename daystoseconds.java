import java.util.Scanner;

public class daystoseconds {
    public static void main(String[] args) {
        //hours to minutes
        Scanner scan = new Scanner(System.in);
        long day = scan.nextInt();

        long convertedSec = day * 24 * 60 * 60;
        int convertedHour = (int) (day * 24);
        int convertedMin = (int) (day * 24 * 60);
        System.out.println(convertedHour+" hours");
        System.out.println(convertedMin +" minutes");
        System.out.println(convertedSec+" seconds");    
    }
}