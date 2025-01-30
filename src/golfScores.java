import java.util.Scanner;
import java.util.ArrayList;
public class golfScores {

    public static double calculateAverage(int average){
        return average;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> score = new ArrayList<>();

        System.out.println("""
                This program reads golf scores and shows
                how much each differs from the average.
                """);

        System.out.println("enter golf scores: ");
        while(true) {
            int golfScores = input.nextInt();
            score.add(golfScores);

            if(golfScores == -1) {
                score.removeLast();
                break;
            }
        }
        int sum = 0;
        for(int num : score){
            sum += num;
        }

        double average = (double)sum / score.size();
        System.out.println("your average is: " + average);
    }
}
