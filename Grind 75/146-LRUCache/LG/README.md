## [LRU Cache](https://leetcode.com/problems/lru-cache/?envType=problem-list-v2&envId=rab78cw1)

### 문제
주어진 기능을 가진 LRU Cache를 만드는 문제

### 해결
더블 링크드리스트를 만들어서 해결하였다. <br/>
unordered_map를 이용한 해시를 사용해 빠르게 검색가능하도록해서 실행시간을 줄일려고 했다.

### 복기
잘 짰다고 생각했지만 시간이 만족스럽게 나오지않았다.<br/>
기본적인 접근방법은 맞았지만 코드의 세세한 부분에서 최적화가 되지않은 것이 문제였다.<br/>
해시를 사용할때 불필요한 접근을 없애 최적화하였다.
