# Week15

## 알고리듬이란 무엇인가?

- Algorithm은 문제를 해결하기 위해 필요한 계산절차나 처리과정의 순서, 문제를 해결하기 위한 확실한 방법
    - 최단 거리나 최단 시간내에 집에서 회사까지 가는 길을 찾는 것, 샌드위치를 만들기 위해 필요한 재료 준비와 조리를 순서대로 진행 하는 것, 마트에서 필요한 물건을 잡고 계산 하는 것 이러한 것들 모두 알고리즘이라 할 수 있다.
    - 확실한 문제 해결법
      - 문제가 특정되어 있어야하고, 방법이 모호해서는 안된다
      - 특정 문제에 적용해서 따라하기만하면 문제가 해결되는 방법
      - ex) 유클리드의 호제법(최대 공약수 구하기), 프로세스, 메뉴얼, 라면 끓이기, 키 순서대로 학생 세우기, 자동차 우회전하기 등

### 필요한 이유
- data structure, algorithm 으로 구성된 컴퓨터구조에서, algorithm의 기본 building block을 공부하는 것
- 기본 building block을 안다면 응용을 해서 복잡한 문제를 해결할 수 있다.

## SWAP
1. 배열로 하기
```java
Integer[] arr = {1,2,3,4,5};

swap(arr, 0, 4);

private static <T> void swap(T[] a, int f, int r) {
	T temp;
    temp = a[f];
    a[f] = a[r];
    a[r] = temp;
}
```
2. 객체 이용
3. 간편하게
```java
private static int swap3(int localA, int localB) {
	return localA;
		
}

int a = 10, b = 20;

b = swap3(a, a = b);

System.out.println(a + " " + b);
```


## 재귀

- 어떤 문제를 해결하기 위해 알고리즘을 설계할 때 동일한 문제의 조금 더 작은 경우를 해결함으로써 그 문제를 해결하는 것이다. 
- 문제가 간단해져서 바로 풀 수 있는 문제로 작아질 때까지
- 이런 테크닉을 재귀라고 한다.

## 분할 정복



## 정렬
- selelctionsort