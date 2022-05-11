import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] grade = new int[4];
        for(int i = 0; i < 4; i++){
            grade[i] = sc.nextInt();
        }
        String mvp = sc.next();
        
        int sum = 0;
        int month = 0;
        
        for(int i = 0; i < N; i++){
        	char m = mvp.charAt(i);
        	
        	switch(m){
        		case 'B' : sum += grade[0] - 1 - month; 
        					month = grade[0] - 1 - month;
        					break;
        		case 'S' : sum += grade[1] - 1 - month;
        					month = grade[1] - 1 - month;
        					break;
        		case 'G' : sum += grade[2] - 1 - month;
        					month = grade[2] - 1 - month;
        					break;
        		case 'P' :sum += grade[3] - 1 - month;
        					month = grade[3] - 1 - month;
        					break;
        		case 'D' :sum += grade[3];
        					month = grade[3];
        					break;
        	}
        }
        System.out.println(sum);
    }
}