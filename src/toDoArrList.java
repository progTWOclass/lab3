import java.util.ArrayList;
import java.util.Scanner;
public class toDoArrList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();

        System.out.println("enter a to do task in your list");

        while(true){
            String toDo = input.nextLine();
            toDoList.add(toDo);

            System.out.println("do you want to add more task? ");
            String answer = input.nextLine();
            if(answer.equalsIgnoreCase("no"))
                break;

            System.out.println("enter your next tasks: ");
        }
        System.out.println("your list has: ");
        System.out.println(toDoList);
    }
}
