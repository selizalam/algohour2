import java.util.Scanner;
public class Solution{
    public static boolean isPrime(int number){
        boolean prime = true;

        if (number == 0 || number == 1){
            prime = false;
        }
        else {
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    prime = false;
                }

            }
        }
        return prime;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = console.nextInt();
        System.out.println(isPrime(number));
    console.close();
    }
    
}