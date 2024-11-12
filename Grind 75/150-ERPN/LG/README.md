## [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
후위 표기법을 계산하는 알고리즘을 작성하는 문제

### 해결
후위표기법을 해결하는 가장 정석적인 방법인 스택으로 풀이하였다<br/>
답은 int로 내야하기 때문에 일부러 int로 스택을 만들었으며, 스택에 집어넣을때 stoi를 사용하여 변환하여 저장하였다.

### 복기
처음에는 string으로 스택을 저장하였으나, 결국 리턴해야하는 값은 int였기 때문에 변환을 두번하여 시간이 오히려 걸리는 일이 있어났다. <br/>
자료형을 잘 설정하는 것만으로도 시간이 줄어드는것을 배웠다.
