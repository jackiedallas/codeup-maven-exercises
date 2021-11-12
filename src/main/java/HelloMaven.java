import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloMaven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter something:");
        String userInput = input.nextLine();

        System.out.printf("You entry reverse is: %s", StringUtils.reverse(userInput));

        System.out.println();

        System.out.printf("Your entry with flipped case: %s", StringUtils.swapCase(userInput));

        System.out.println();

        System.out.println("StringUtils.isNumeric(userInput) = " + StringUtils.isNumeric(userInput));
    }
}
