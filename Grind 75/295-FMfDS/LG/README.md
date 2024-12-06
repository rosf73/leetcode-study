## [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/?envType=problem-list-v2&envId=rab78cw1)

### 문제
주어진 조건에 맞는 함수 만들기<br/>
데이터삽입, 중간값 찾기

### 해결
우선순위 큐를 2개 만들어서 큰쪽부분과 작은쪽 부분 두개로 나누어 저장하였다 <br/>
2 부분으로 나누었기 때문에 중간값 찾기에 용이하고 짝수인 경우에도 만나는 부분을 쉽게 찾게 설계하였다.

### 복기
코드를 효율적으로 짰다고 생각했는데 생각보다 속도가 나오지않았다.<br/>
기본적인 접근은 맞았으나 세세한 부분에서 최적화가 부족하였다.
