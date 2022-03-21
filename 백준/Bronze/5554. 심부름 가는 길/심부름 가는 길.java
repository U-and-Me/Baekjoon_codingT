import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int sum_sec = 0;
        
        for(int i = 0; i < 4; i++){
            int sec = sc.nextInt();
            sum_sec += sec;
        }
        
        System.out.println(sum_sec / 60);
        System.out.println(sum_sec % 60);
    }
}