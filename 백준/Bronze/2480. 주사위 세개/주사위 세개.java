import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        
        if(one == two && two == three && three == one){
            System.out.println(10000 + one * 1000);
        }else if(one == two || one == three){
            System.out.println(1000 + one * 100);
        }else if(two == three){
            System.out.println(1000 + two * 100);
        }else{
            System.out.println(Math.max(one, Math.max(two, three)) * 100);
        }
    }
}