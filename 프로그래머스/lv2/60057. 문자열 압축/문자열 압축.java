class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        if(s.length() == 1)
            return 1;
        
        for(int i = 1; i <= s.length() / 2; i++){
            String str = "";
            String temp = "";
            int count = 1;
            
            for(int j = 0; j < s.length() / i; j++){
                // 이전에 자른 문자열과 방금 자른 문자열이 같을 경우
                if(temp.equals(s.substring(j*i, (j*i) + i))){
                    count++;
                    continue;
                }
               
                // count가 1보다 클 경우
                if(count > 1){
                    str += count + temp;
                    count = 1;
                }else{
                    str += temp;
                }
                
                // str 변경
                temp = s.substring(j*i, (j*i)+i);
            }
            
            // 마지막에 못 붙인 문자열 추가
            if(count > 1){
                str += count + temp;
                count = 1;
            }else{
                str += temp;
            }
            
            // s의 길이가 나눠떨어지지 않으면 그 뒤의 문자열 모두 붙이기
            if(s.length() % i != 0){
                str += s.substring(s.length() - s.length() % i, s.length());
            }
            
            // 최소 길이 찾기
             answer = answer > str.length() ? str.length() : answer;
        }
        
        return answer;
    }
}