import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int album_cnt = sc.nextInt();
        int avg = sc.nextInt();
        
        System.out.println(album_cnt * (avg - 1) + 1);
    }
}