#include<stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    for(int i  = 0; i < n; i++)
    {
        int num, sum = 0,count = 0;
        double avg;
        scanf("%d", &num);
        int arr[num];
        for(int j = 0; j < num; j ++)
        {
            scanf("%d", &arr[j]);
            sum+=arr[j];
        }
        avg = sum/num;        
        for(int k = 0; k < num; k ++)
            if(avg < arr[k])
                count++;
        printf("%.3f%%\n", (float)count/num*100);
    }
}