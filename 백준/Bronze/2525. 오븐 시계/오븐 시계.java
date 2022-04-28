import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();
        
        // 모든 시간을 분으로 바꾸기
        int a = h * 60 + m + time;
        
        int hour = a / 60;
        int min = a % 60;
        
        if(hour >= 24)
            hour = hour - 24;
        
        System.out.println(hour + " " + min);
        
    }
}