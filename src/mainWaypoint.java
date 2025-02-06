import java.util.Scanner;
import java.util.ArrayList;
public class mainWaypoint {

//    public double calculateDistance(){
//        double dx = distance.x - this.x;
//    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create an object of wayPoints to store in the arraylist
        ArrayList<wayPoints> coordinates = new ArrayList<>();

        while(true){
            System.out.println("Enter first your waypoint: ");
            double x = input.nextDouble();

            System.out.println("Enter your second waypoint: ");
            double y = input.nextDouble();

            System.out.println("Enter your timestamp: ");
            int timeStamp = input.nextInt();

            coordinates.add(new wayPoints(x,y,timeStamp));
            input.nextLine();//clear integer leftovers for string

            System.out.println("Do you want to add another waypoint?");
            String answer = input.nextLine();
            if(answer.equalsIgnoreCase("no"))
                break;
        }

        System.out.println("your coordinates are " + coordinates.toString());
    }
}
