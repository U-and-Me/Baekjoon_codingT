import java.util.Scanner;
import java.math.BigInteger;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        BigInteger apple = sc.nextBigInteger();
        BigInteger more = sc.nextBigInteger();
        BigInteger two = new BigInteger("2");
        
        System.out.println(apple.add(more).divide(two));
        System.out.println(apple.subtract(more).divide(two));
    }
}