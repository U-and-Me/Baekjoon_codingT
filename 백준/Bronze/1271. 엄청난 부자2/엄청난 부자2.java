import java.util.Scanner;
import java.math.BigInteger;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        
        BigInteger result1 = n.divide(m);
        BigInteger result2 = n.mod(m);
        
        System.out.println(result1);
        System.out.println(result2);
    }
}