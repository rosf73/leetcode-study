## [3Sum](https://leetcode.com/problems/3sum/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
주어진 수중 3개를 뽑아 합이 0이되는 조합을 찾는 문제

### 해결
해시를 사용해 순회하면서 0이되는 조합을 찾았다.
하나를 고정하면서 나머지 두개의 숫자를 바꿔가며 0이되는 숫자를 찾게 코드를 구성하였다.

### 복기
엄청 느리다.<br/>
1번문제에서는 해시를 사용하는게 빨라 비슷한 결인 이 문제도 똑같은 방식으로 접근했으나, 결과는 완전 다른결과가 나왔다.<br/>
나름 반복되는 for의 개수를 줄였으나, 아직 이보다 효율적인 방법이 남아있는것 같다.<br/>

