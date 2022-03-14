import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[] chk_ch = {1, 1, 2, 2, 2, 8};
        int[] ans = new int[6];
        
        for(int i = 0; i < 6; i++){
            int ch = sc.nextInt();
            ans[i] = chk_ch[i] - ch;
        }
        
        for(int i = 0; i < 6; i++){
            System.out.println(ans[i]);
        }
    }
}