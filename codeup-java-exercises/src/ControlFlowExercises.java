import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//         string comparison:
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();

// Don't do this!
        boolean confirmation = userInput == "y";
        System.out.println(confirmation);

//  Do this instead:
        boolean rightConfirmation = userInput.equals("y");
        System.out.println(rightConfirmation);

    }



}
