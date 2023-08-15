import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Testing {

    private static Scanner scanner = new Scanner(System.in);

    private static String myIsNumeric(boolean isNumeric) {
        if(isNumeric) {
            return "is a number";
        }
        return "is not a number";
    }

    public static void main(String[] args) {

        System.out.println("Enter Something: ");
        String userResponse = scanner.nextLine();
        System.out.println("You entered: " + userResponse);
        System.out.println(userResponse + " " + myIsNumeric(StringUtils.isNumeric(userResponse)));
        System.out.println("Flipped Case: " + StringUtils.swapCase(userResponse));
        System.out.println("Reversed: " + StringUtils.reverse(userResponse));

    }
}
