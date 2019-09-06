//Generate a random number between 1 and 250 and label each number from 1 to number as prime or not
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random r = new Random();

        int number = r.nextInt(250) ;
        System.out.println("Generated the random number: "+number);
        if(number >250){
            System.out.println("The number is over 250. Ending program.");
            System.exit(0);
        }
        for(int i=1; i<=number; i++) {
            if(i == 1 || i == 2 || i == 3 || i == 7){
                System.out.println("Number "+i+" is a prime number");
            }
            else if(i%2 == 0) {
                System.out.println("Number "+i+" is not a prime number");
            }
            else if(i%3 == 0){
                System.out.println("Number "+i+" is not a prime number");
            }
            else if(i%5 == 0){
                System.out.println("Number "+i+" is not a prime number");
            }
            else if(i%7 == 0){
                System.out.println("Number "+i+" is not a prime number");
            }
            else if(i%13 == 0){
                System.out.println("Number "+i+" is not a prime number");
            }
            else if(i%19 == 0){
                System.out.println("Number "+i+" is not a prime number");
            }
            else{
                System.out.println("Number "+i+" is a prime number");
            }
        }
    }
}
