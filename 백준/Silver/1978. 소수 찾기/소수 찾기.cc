#include <stdio.h>
#include <vector>
#include <algorithm>
#include <math.h>
#include <stack>
#include <string.h>

using namespace std;
int arr[1001];

main()
{
	int n,k,i,j,cnt=0;
	
	
	for(i=1;i<=1000;i++){
		for(j=1;i*j<=1000;j++){
			arr[j*i]++;
		}
	}
	
	scanf("%d",&n);
	

	for(i=0;i<n;i++){
		scanf(" %d",&k);
		if(arr[k] == 2 ) cnt++;
	}
	
	printf("%d",cnt);
	
	
	return 0;	
}