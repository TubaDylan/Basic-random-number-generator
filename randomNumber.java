import java.util.Scanner;
public class randomNumber {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a lower number: ");
        int min = 0;
        if (input.hasNextInt()) {
            min = input.nextInt();
        }

        System.out.print("Enter an upper number: ");
        int max = 0;
        if (input.hasNextInt()) {
            max = input.nextInt();
        }

        int num = (int)(Math.random()*(max-min+1)+min);  
        System.out.println("Your random number is: " + num);
    }
}

