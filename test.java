import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int[] month = new int[11];
        int[] day = new int[2];


        for (int i = 0; i < day.length; i++) {
            System.out.println("Ввести количество шагов за " + i + " день");
            int stepsPerDay = scanner.nextInt(); 
            day[i] = stepsPerDay;
        }

        for (int j = 0; j <= month.length; j++) {
            for (int k = 0; k < day.length; k++) {
                month[j] += day[k];
            }
        }

        for (int p = 0; p < month.length; p++) {
        System.out.println(month[p]);
        }
    }
}