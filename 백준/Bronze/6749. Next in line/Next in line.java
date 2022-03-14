import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int third = sc.nextInt();
        int second = sc.nextInt();
        
        int age = second - third;
        
        System.out.println(second + age);
    }
}