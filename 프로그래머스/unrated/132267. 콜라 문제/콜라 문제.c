#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int a, int b, int n) {
    int answer = 0;
    
    while(a <= n){
        int add = (n / a) * b;
        n = (n % a) + add;
        
        answer += add;
    }
    
    return answer;
}