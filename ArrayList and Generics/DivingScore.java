import java.util.ArrayList;
import java.util.Scanner;
public class DivingScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();
        
        System.out.println("Enter the difficulty level of the dive (1.2-3.8):");
        double difficulty = scanner.nextDouble();
        
        System.out.println("Enter 7 judges Scores:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            double score = scanner.nextDouble();
            scores.add(score);
        }
        double highest = scores.get(0);
        double lowest = scores.get(0);
        for (double score : scores) {
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }   
        sum -= highest - lowest; 
        double finalScore = sum * difficulty * 0.6;     
        System.out.println("The final diving score is: " + finalScore);
        scanner.close();
    }
}

