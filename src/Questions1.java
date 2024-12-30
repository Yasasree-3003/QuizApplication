import java.util.Random;
import java.util.Scanner;
public class Questions1 {
    public void displayQuestions(Scanner scanner, ParticipateDetails pd) {
        String[][] questions = {
            {"Who is the first President of the India?", "1. Jawaharlal Nehru", "2. Dr.Rajendra Prasad", "3. Dr.Sarvepalli Radhakrishnan", "4. Dr.Zakir Husain", "2"},
            {"What is the capital city of Japan?", "1. Beijing", "2. Seoul", "3. Tokyo", "4. Kyoto", "3"},
            {"Which planet is known as the Red Planet?", "1. Earth", "2. Mars", "3. Jupiter", "4. Venus", "2"},
            {"Who became the first Indian cricketer to score a double century in a Test match in the West Indies?", "1. Sunil Gavaskar", "2. Virat Kohli", "3. Rahul Dravid", "4. Sachin Tendulkar", "2"},
            {"Which ocean is the largest in the world?", "1. Atlantic Ocean", "2. Indian Ocean", "3. Pacific Ocean", "4. Arctic Ocean", "3"},
            {"What is the chemical symbol for gold?", "1. Ag", "2. Au", "3. Fe", "4. Hg", "2"},
            {"Who holds the record for the most runs in a single ODI match?", "1. Brian Lara", "2. Sachin Tendulkar", "3. Rohit Sharma", "4. Virat Kohli", "3"},
            {"Who was awarded the ICC Player of the Year in 2017?", "1. Steve Smith", "2. Virat Kohli", "3. Joe Root", "4. Kane Williamson", "2"},
            {"What is the largest animal on Earth?", "1. Elephant", "2. Blue Whale", "3. Giraffe", "4. Shark", "2"},
            {"Which country is known as the Land of the Rising Sun?", "1. China", "2. Japan", "3. Thailand", "4. India", "2"}
        };

        boolean used50_50 = false;
        boolean usedPollAudience = false;
        boolean quizCompleted = true;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.println("5. Lifeline");
            System.out.println("6. Quit");

            if (used50_50 && !usedPollAudience) {
                System.out.println("You have used 50-50, only one lifeline available: 1. Poll the Audience");
            } else if (!used50_50 && usedPollAudience) {
                System.out.println("You have used Poll the Audience, only one lifeline available: 1. 50-50");
            }

            System.out.print("Enter your choice (1-6): ");
            String choice = scanner.nextLine();

            if (choice.equals("5") && !used50_50 && !usedPollAudience) {
                System.out.println("Lifeline options available:");
                System.out.println("1. 50-50");
                System.out.println("2. Poll the Audience");

                System.out.print("Which lifeline do you want to use? (1/2): ");
                String lifelineChoice = scanner.nextLine();

                if (lifelineChoice.equals("1")) {
                    System.out.println("50-50 Lifeline used!");
                    System.out.println("The remaining options are:");

                    String correctAnswer = questions[i][5];
                    Random rand = new Random();
                    int incorrectOption = rand.nextInt(3) + 1; 
                    while (incorrectOption == Integer.parseInt(correctAnswer)) {
                        incorrectOption = rand.nextInt(3) + 1;
                    }
                    System.out.println(questions[i][Integer.parseInt(correctAnswer)]);
                    System.out.println(questions[i][incorrectOption]);

                    used50_50 = true;
                    System.out.print("Enter your answer : ");
                    String playerAnswer = scanner.nextLine();

                    if (playerAnswer.equals(correctAnswer)) {
                        pd.score += 1000;
                        System.out.println("Correct! You earned 1000. Your current amount is: " + pd.score);
                    } else {
                        System.out.println("Wrong answer! You have won only: " + pd.score);
                        System.out.println("Thank you for participating in the quiz!");
                        return;
                    }
                } else if (lifelineChoice.equals("2")) {
                    System.out.println("Poll the Audience Lifeline used!");
                    pollTheAudience(questions[i][5]);
                    usedPollAudience = true;
                    System.out.print("Enter your answer (1/2/3/4): ");
                    String playerAnswer = scanner.nextLine();
                    if (playerAnswer.equals(questions[i][5])) {
                        pd.score += 1000;
                        System.out.println("Correct! You earned 1000. Your current amount is: " + pd.score);
                    } else {
                        System.out.println("Wrong answer! You have won only: " + pd.score);
                        System.out.println("Thank you for participating in the quiz!");
                  return;        
                  }
                }
            } else if (choice.equals("5") && used50_50 && !usedPollAudience) {
                System.out.println("You have used 50-50, only one lifeline available: 1. Poll the Audience");
                System.out.print("Select option 1 to use Poll the Audience: ");
                String lifelineChoice = scanner.nextLine();

                if (lifelineChoice.equals("1")) {
                    System.out.println("Poll the Audience Lifeline used!");
                    pollTheAudience(questions[i][5]);
                    usedPollAudience = true;
                    System.out.print("Enter your answer (1/2/3/4): ");
                    String playerAnswer = scanner.nextLine();
                    if (playerAnswer.equals(questions[i][5])) {
                        pd.score += 1000;
                        System.out.println("Correct! You earned 1000. Your current amount is: " + pd.score);
                    } else {
                        System.out.println("Wrong answer! You have won only: " + pd.score);
                        System.out.println("Thank you for participating in the quiz!");
                        return ;
                    }
                }
            } else if (choice.equals("5") && !used50_50 && usedPollAudience) {
                System.out.println("You have used Poll the Audience, only one lifeline available: 1. 50-50");
                System.out.print("Select option 1 to use 50-50: ");
                String lifelineChoice = scanner.nextLine();
                if (lifelineChoice.equals("1")) {
                    System.out.println("50-50 Lifeline used!");
                    System.out.println("The remaining options are:");

                    String correctAnswer = questions[i][5];
                    Random rand = new Random();
                    int incorrectOption = rand.nextInt(3) + 1;  
                    while (incorrectOption == Integer.parseInt(correctAnswer)) {
                        incorrectOption = rand.nextInt(3) + 1;
                    }
                    System.out.println(questions[i][Integer.parseInt(correctAnswer)]);
                    System.out.println(questions[i][incorrectOption]);

                    used50_50 = true;
                    System.out.print("Enter your answer : ");
                    String playerAnswer = scanner.nextLine();

                    if (playerAnswer.equals(correctAnswer)) {
                        pd.score += 1000;
                        System.out.println("Correct! You earned 1000. Your current amount is: " + pd.score);
                    } else {
                        System.out.println("Wrong answer! You have won only: " + pd.score);
                        System.out.println("Thank you for participating in the quiz!");
                        return;
                    }
                }
            } 
            else if (!choice.equals("6")&&(!choice.equals("1"))&&(!choice.equals("2"))&&(!choice.equals("3"))&&(!choice.equals("4"))) {  
                System.out.println("You have used all available lifelines");
                System.out.print("Select an option from 1, 2, 3, 4, or 6 to quit: ");
                String playerAnswer = scanner.nextLine();
                if (playerAnswer.equals(questions[i][5])) {
                    pd.score += 1000;
                    System.out.println("Correct! You earned 1000. Your current score is: " + pd.score);
                } else if (playerAnswer.equals("6")) {
                    System.out.println("You quit the game. Your total amount is: " + pd.score);
                    return;

                } else {
                    System.out.println("Wrong answer! You have won only: " + pd.score);
                    System.out.println("Thank you for participating in the quiz!");
                    return;
                }
            } else if (choice.equals("6")) {  
                System.out.println("You quit the game. Your total amount is: " + pd.score);
                System.out.println("Thank you for participating in the quiz!");
                return;
            } else if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {  
                if (choice.equals(questions[i][5])) {
                    pd.score += 1000;
                    System.out.println("Correct! You earned 1000. Your current amount is: " + pd.score);
                } else {
                    System.out.println("Wrong answer! You have won only: " + pd.score);
                    System.out.println("Thank you for participating in the quiz!");
                    return;
                }
            }
        }

        System.out.println("\nQuiz Over! Your total amount is: " + pd.score);
        System.out.println("You have successfully completed the quiz!");
        if (quizCompleted) {
            System.out.println("\n----- CONGRATULATIONS -----");
            System.out.println("----- Quiz Completion Certificate ----- ");
            System.out.println("This certificate is presented to "+ pd.getFirstName() + " " + pd.getLastName()+"\n for the completion of Quiz");
        } 

            System.out.println("Thank you for participating in the quiz!");
        }

    private void pollTheAudience(String correctAnswer) {
        Random r = new Random();
        int correctAnswerPercentage = r.nextInt(30) + 40;
        int remainingPercentage = 100 - correctAnswerPercentage;
        int firstWrongOptionPercentage = r.nextInt(remainingPercentage);
        int secondWrongOptionPercentage = remainingPercentage - firstWrongOptionPercentage;
        System.out.println("Audience Poll results:");
        System.out.println("Option 1: " + (correctAnswer.equals("1") ? correctAnswerPercentage : firstWrongOptionPercentage) + "%");
        System.out.println("Option 2: " + (correctAnswer.equals("2") ? correctAnswerPercentage : secondWrongOptionPercentage) + "%");
        System.out.println("Option 3: " + (correctAnswer.equals("3") ? correctAnswerPercentage : firstWrongOptionPercentage) + "%");
        System.out.println("Option 4: " + (correctAnswer.equals("4") ? correctAnswerPercentage : secondWrongOptionPercentage) + "%");
    }
}
