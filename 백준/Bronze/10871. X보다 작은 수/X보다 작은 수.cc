#include <stdio.h>
#include <vector>
#include <algorithm>
#include <math.h>
#include <stack>
using namespace std;



int main()
{
	int n,k,a,i;
	scanf("%d %d",&n,&k);
	
	for(i=1;i<=n;i++){		
		scanf("%d ",&a);
		if(a<k) printf("%d ",a);
	}
	
	
	
	
	return 0;
	}
	


