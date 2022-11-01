#include <stdio.h>

int main() {

	int A, B, V;
	int day, almost, answer,howmany;
	
	scanf("%d", &A);
	scanf("%d", &B);
	scanf("%d", &V);

	if (A == V) { // 만약 올라가야되는 거리가 낮에 달팽이 갈 수 있는 거리와 같다면
		printf("%d", 1); // 하루만에 갈 수 있다.
		return 0;
	}

	day = A - B; // 낮과 밤동안 갈 수 있는 거리
	almost = V - A;// 이 거리까지 오면 무조건 다음날 달팽이는 도착한다.
	if (almost % day) // almost의 거리까지 가는데 걸리는 시간을 구할때 정수값이 안나오면 하루 더 추가
		howmany = (almost / day )+ 1;
	else
		howmany = almost / day;
		
	answer = howmany + 1; // 정상에 도달하려면 하루가 더 걸린다

	printf("%d\n", answer);

	return 0;
}