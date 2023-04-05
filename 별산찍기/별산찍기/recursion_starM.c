

#include <stdio.h>
// 역방향으로 별산 찍기.
//void star(int start, int final){
//    int i;
//    if(start == final){
//        printf("*\n");
//        return;
//    }
//    else{
//        for(i = start;i <= final;i++){
//            printf("*");
//        }
//        printf("\n");
//        start++;
//        star(start, final);
//    }
//}

//정방향 별산 찍기.
void star(int start, int final){
    int i;
    if(start == final){
        for(i=0;i<final;i++)
            printf("*");
        printf("\n");
        return;
    }
    else{
        for(i=0;i<start;i++)
            printf("*");
    }
    printf("\n");
    start++;
    star(start, final);
}

int main(void) {
    int num;
    printf("별산의 높이를 입력해주세요: ");
    scanf("%d", &num);
    
    star(1, num);
    
}
