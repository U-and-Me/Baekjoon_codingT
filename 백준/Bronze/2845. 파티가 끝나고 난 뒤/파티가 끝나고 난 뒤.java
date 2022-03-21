import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int P = sc.nextInt();
        int S = sc.nextInt();
        int[] news = new int[5];
        
        int people = P * S;
        
        for(int i = 0; i < 5; i++){
            int news_p = sc.nextInt();
            System.out.println(news_p - people);
        }
    }
}