import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int k1 = sc.nextInt();
        int n1 = sc.nextInt();
        int k2 = sc.nextInt();
        int n2 = sc.nextInt();
        
        System.out.println((k1 * n1) + (k2 * n2));
    }
}