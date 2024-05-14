package company;

import java.util.stream.IntStream;

public class ShipGit {

	public static void main(String[] args) 
	  {
        // Check prime numbers from 1 to 100
        IntStream.rangeClosed(1, 100)
                 .forEach(num -> {
                     if (isPrime(num)) {
                         System.out.println(num + " is a prime number.");
                     }
                 });
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int number) 
        {
        if (number <= 1) {
            return false;
        }
        
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .noneMatch(i -> number % i == 0);
    }
}
