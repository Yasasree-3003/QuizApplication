import java.util.Scanner;
public class Questions
{
public void displayQuestions(Scanner scanner, ParticipateDetails pd) {

        
        System.out.println("Question 1: What is the default value of a boolean variable in Java?");
        System.out.println("1. true");
        System.out.println("2. false");
        System.out.println("3. 0");
        System.out.println("4. null");
        System.out.print("Enter your answer (1/2/3/4): ");
        boolean lifeline50_50Used = false;  
        boolean lifelinePollUsed = false;
        String answer1 = scanner.nextLine();

        if (!answer1.equals("2")) {  
            System.out.println("Wrong answer! You have won: " + pd.score);
            return;
        }
        pd.score += 1000; 
        System.out.println("Correct! You earned $1000. Your current score is: " + pd.score);

        System.out.println("\nQuestion 2: Which of the following is not a valid data type in Java?");
        System.out.println("1. integer");
        System.out.println("2. boolean");
        System.out.println("3. String");
        System.out.println("4. char");
        System.out.print("Enter your answer (1/2/3/4): ");
        String answer2 = scanner.nextLine();

        if (!answer2.equals("1")) {  
            System.out.println("Wrong answer! You have won: $" + pd.score);
            return;
        }
        pd.score += 1000; 
        System.out.println("Correct! You earned $1000. Your current score is: " + pd.score);

        System.out.println("\nQuestion 3: What is the size of an int in Java?");
        System.out.println("1. 16 bits");
        System.out.println("2. 32 bits");
        System.out.println("3. 64 bits");
        System.out.println("4. 128 bits");
        System.out.print("Enter your answer (1/2/3/4): ");
        String answer3 = scanner.nextLine();

        if (!answer3.equals("2")) {  
            System.out.println("Wrong answer! You have won: $" + pd.score);
            return;
        }
        pd.score += 1000; 
        System.out.println("Correct! You earned $1000. Your current score is: $" + pd.score);
        System.out.println("\nQuestion 4: Which method is used to start a thread in Java?");
        System.out.println("1. run()");
        System.out.println("2. start()");
        System.out.println("3. execute()");
        System.out.println("4. begin()");
        System.out.print("Enter your answer (1/2/3/4): ");
        String answer4 = scanner.nextLine();

        if (!answer4.equals("2")) {  
            System.out.println("Wrong answer! You have won: " + pd.score);
            return;
        }
        pd.score += 1000; 
        System.out.println("Correct! You earned $1000. Your current score is: $" + pd.score);
        System.out.println("\nQuestion 5: What does the 'static' keyword mean in Java?");
        System.out.println("1. The variable belongs to the class rather than instances");
        System.out.println("2. The variable belongs to an instance");
        System.out.println("3. The variable is private");
        System.out.println("4. The variable is public");
        System.out.print("Enter your answer (1/2/3/4): ");
        String answer5 = scanner.nextLine();

        if (!answer5.equals("1")) {  
            System.out.println("Wrong answer! You have won: " + pd.score);
            return;
        }
        pd.score += 1000; 
        System.out.println("Correct! You earned $1000. Your current score is: $" + pd.score);
        System.out.println("\nGame Over! Your total score is: " + pd.score);
    }
}
