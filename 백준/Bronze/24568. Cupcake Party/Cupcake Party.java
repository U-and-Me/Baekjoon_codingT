import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int R = sc.nextInt();
        int S = sc.nextInt();
        
        int cupcake = (R * 8) + (S * 3);
        
        System.out.println(cupcake - 28);
        
    }
}