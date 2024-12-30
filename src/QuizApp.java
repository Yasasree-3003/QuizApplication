import java.util.InputMismatchException;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParticipateDetails pd = new ParticipateDetails();
        System.out.println("-------------WELCOME TO QUIZ------------");
        
        try {
            System.out.println("Enter your First Name:");
            pd.setFirstName(sc.nextLine());

            System.out.println("Enter your Last Name:");
            pd.setLastName(sc.nextLine());

            System.out.println("Enter your Email:");
            pd.setEmail(sc.nextLine());

            boolean validMobile = false;
            while (!validMobile) {
                try {
                    System.out.println("Enter your Mobile number:");
                    long mobileNo = sc.nextLong();
                    pd.setMobileNo(mobileNo);  
                    validMobile = true;  
                } catch (InputMismatchException e) {
                    System.out.println("Enter a valid Mobile number");
                    sc.nextLine(); 
                }
            }

            System.out.println("Enter your Place:");
            pd.setPlace(sc.next());

            sc.nextLine();  
            System.out.println("Enter your Gender (Male/Female/Other):");
            pd.setGender(sc.nextLine());

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        }
        System.out.print("Are you ready to take the quiz? (yes/no): ");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("\nRules of the Quiz:");
            System.out.println("1. It contains 10 questions.");
            System.out.println("2. Every question contains 6 options, and you can select one.");
            System.out.println("3. For every correct answer, you will get 1000 rupees.");
            System.out.println("4. You have 2 lifelines, each can be used once.");
            System.out.println("5. If you give a wrong answer, the quiz ends, and you win the amount you earned.");
            System.out.println("-----------------Good luck!------------------");

            System.out.println("Do you want to begin the quiz now? (yes/no): ");
            String confirmation = sc.nextLine();
            if (confirmation.equalsIgnoreCase("yes")) {
                System.out.println("Proceeding with the quiz....");
                Questions1 questions = new Questions1();
                questions.displayQuestions(sc, pd);
                
            } else {
                System.out.println("Thank you for visiting the quiz. Hope to see you again!");
            }
        } else {
            System.out.println("Thank you for visiting the quiz. Hope to see you again!");
        }
    }
}
