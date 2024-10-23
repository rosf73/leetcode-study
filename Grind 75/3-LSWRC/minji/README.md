## [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
반복이 없는 가장 긴 부분문자열 길이 찾기

### 해결
최대한 *O(n)* 으로 해결하려고 애썼다.<br/>
알파벳 `HashMap`을 또 이용했고, 투 포인터 알고리즘을 응용했음.

### 복기
`HashMap`도 이용할 필요 없이 `HashSet`으로 최대 길이 계산을 더 쉽게 할 수 있다.<br/>
코드는 더 복잡하지 않으면서 시간복잡도도 안정적으로 유지된다.<br/>
그리고 lastPoint는 left로, i는 right로 표현했으면 '투 포인터' 알고리즘을 썼다는 것을 더 명확히 할 수 있을 듯.
