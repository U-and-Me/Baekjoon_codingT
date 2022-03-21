import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int min = (n + 1) * 2;
        int max = (n + 1) * 3;
        
        System.out.println(min + " " + max);
    }
}