## [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
다이얼 키패드로 만들어질 수 있는 문자열 조합을 찾는 문제이다.

### 해결
역시 조합은 백트래킹!<br/>
보다는 그냥 dfs에 가까운 방법으로 풀었다. depth를 전달해서 문자열 길이에 충족하면 result list에 업데이트 하는 방식으로 했다.

### 복기
다이얼 매칭을 위해 alphabet `Map`을 만들었는데, 생각해보니 `Map`으로 안해도 되고 그냥 list로 만들어서 0, 1 번째 칸만 비워주면 됐다.<br/>
또 ['a', 'b', 'c'] 같은 array로 매칭했는데, 그냥 String으로 해도 된다.<br/>
위와 같은 방법으로 시간-공간 복잡도를 모두 줄였다.
