import java.util.Scanner;
import java.util.ArrayList;
public class GpsWaypoints {

//    public static double calculateDistance(ArrayList<coordinates> wayPointCoordinates){
//
//    }
//
//    public static double calculateAverage(){
//
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> coordinates = new ArrayList<>();
        ArrayList<Integer> time = new ArrayList<>();

        while(true){
            System.out.println("Enter your waypoints: ");
            double wayPoints = input.nextDouble();
            coordinates.add(wayPoints);

            System.out.println("Enter your timestamp: ");
            int timeStamp = input.nextInt();
            time.add(timeStamp);
            input.nextLine();//clear integer leftovers for string

            System.out.println("Do you want to add another waypoint?");
            String answer = input.nextLine();
            if(answer.equalsIgnoreCase("no"))
                break;
        }

        System.out.println("your coordinates " + coordinates);
        System.out.println("your timestamp " + time);
    }
}
