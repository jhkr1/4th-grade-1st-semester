

#include <stdio.h>
int fact(int num){
    int value;
    if(num == 1){
        printf("fact(%d) 함수 호출!\n", num);
        printf("fact(%d) 값 %d 반환!\n", num, value);
        return 1;
        
    }
    else{
        printf("fact(%d) 함수 호출!\n", num);
        value = num * fact(num - 1);
        printf("fact(%d) 값 %d 반환!\n", num, value);
        return value;
        
    }
}

int main(void) {

    int num, result;
    printf("정수를 입력해주세요: ");
    scanf("%d", &num);
    printf("\n");
    result = fact(num);
    
    printf("\n%d의 팩토리얼 값은 %d입니다.\n", num, result);


    return 0;
}
