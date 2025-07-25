import java.util.Scanner;

public class online {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;

        while (true) {
            System.out.print("Please enter your name (or type 'exit' to finish): ");
            String userName = input.nextLine();

            if (userName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Please enter your age: ");
            int userAge = Integer.parseInt(input.nextLine());

            if (userAge >= 18) {
                System.out.println("Please select a candidate to vote for:");
                System.out.println("1. Candidate 1");
                System.out.println("2. Candidate 2");

                int userSelection = Integer.parseInt(input.nextLine());

                if (userSelection == 1) {
                    candidate1Votes++;
                } else if (userSelection == 2) {
                    candidate2Votes++;
                } else {
                    System.out.println("Selected Candidate not present!");
                    continue;
                }

                System.out.println("Thank you for voting, " + userName + "!");
            } else {
                System.out.println("I'm sorry, you are not eligible to vote.");
            }

            System.out.println();
        }

        System.out.println("Final vote count:");
        System.out.println("Candidate 1: " + candidate1Votes + " votes");
        System.out.println("Candidate 2: " + candidate2Votes + " votes");

        input.close();
    }
}
