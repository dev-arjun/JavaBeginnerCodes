import java.util.Scanner;

public class secondstoday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();   
        float convertMin = seconds / 60;        
        float convertHour = (seconds / 60) / 60;
        float convertDay = ((seconds / 60) / 60) / 24;
        System.out.println(convertMin + "Minutes");
        System.out.println(convertHour + "Hours");
        System.out.println(convertDay + "Day");
       }
    }
