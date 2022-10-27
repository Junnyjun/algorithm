#include <stdio.h>
int main() {
    int year;
    scanf("%d", &year);
//4의 배수고 100의 배수가 아니며 400의 배수일 때 윤년이다
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
    {
        printf("1");
        return 0;
    }
    printf("0");
}