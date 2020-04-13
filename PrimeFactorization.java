public class PrimeFactorization {

    public static void main(String[] args) {
	    long number = 600851475143L;
	    int divisor = 2;

	    while (divisor < number)
        {
            // if the number is divisible by the divisor it is a factor.
            // print the divisor, perform the function
            // attempt to divide it further by the same factor
            if (number % divisor == 0) {
                number = number / divisor;
                System.out.println(divisor);
            } else {
                // if there is a remainder, the divisor is not a factor, increment the divisor by 1
                divisor++;
            }
        }
        System.out.println(divisor);
    }
}
