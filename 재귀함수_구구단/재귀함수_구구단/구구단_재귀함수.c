#include <stdio.h>

int multiply(int start,int final){
    int value;
    if(final > 9){
        return 0;
    }
    else{
        value = start * final;
        printf("%d x %d = %d 입니다.\n",start, final, value);
        return multiply(start, final+1);
    }
    
}


int main(void){
    int num;
  
    printf("몇 단을 만드시겠습니까? :");
    scanf("%d", &num);
    
    multiply(num, 1);
    
    return 0;
}
