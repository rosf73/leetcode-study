# 이분 탐색 / 이진 탐색 / Binary Search

## 개념
오름차순으로 정렬된 정수 배열을 두 부분배열로 쪼개고, 목표 값이 존재하는 가지만 선택하여 탐색을 최적화하는 알고리즘이다.  
부분 배열에서 탐색을 시작할 때 중간(mid) 값을 먼저 탐색하며, 목표 값과 일치하지 않는 경우 다시 두 부분배열로 쪼갠다. (반복)  
<br/>

## 용도
아래 조건들에 부합하는 문제인 경우, 이분 탐색으로 시도해볼만 하다.
- 결과 값의 최소-최대 범주를 계산할 수 있는 경우
- 범주 중 조건에 대한 **최솟값**을 찾아야하는 경우
- 조건 값 k가 증가할 수록 목표 값 n이 같거나 증가하는 성질, 즉 **단조 증가**의 성질을 띄는 경우
<br/>


## 간단하게 접근할 수 있는 연습문제
- [백준:10815 숫자 카드](https://www.acmicpc.net/problem/10815) (기초)
- [Codility:MinMaxDivision](https://app.codility.com/programmers/lessons/14-binary_search_algorithm/min_max_division/)
  <details>
  <summary>간단하게 접근하기</summary>
    1. 정답 요건이 뭔가? : 조건(k, M)에 부합하는 <b>최솟값</b>을 찾아야 함<br/>
    2. 정답 범주는 제한되어 있을까? : (A 요소 중 최댓값) ~ (A 의 sum) 사이의 값에 항상 정답이 존재<br/>
    3. 단조 증가를 만족할까? : 요소 최댓값인 M이 커질 수록 정답도 같거나 커짐
  </details>
- [백준:2512 예산](https://www.acmicpc.net/problem/2512)
  <details>
  <summary>간단하게 접근하기</summary>
    1. 정답 요건이 뭔가? : 조건(국가예산)에 부합하는 <b>최선의 상한선(즉, 최솟값)</b>을 찾아야 함
    2. 정답 범주는 제한되어 있을까? : (국가예산 / 요청예산배열크기) ~ (요청예산 중 최댓값) 사이의 값에 항상 정답이 존재<br/>
    3. 단조 증가를 만족할까? : 국가예산이 커질 수록 정답도 같거나 커짐
  </details>
<br/>


## 깊게 생각해야 하는 연습문제
- [프로그래머스:입국 심사](https://school.programmers.co.kr/learn/courses/30/lessons/43238)
  <details>
  <summary>간단하게 접근하기</summary>
    > todo
  </details>
- [프로그래머스:봉인된 주문](https://school.programmers.co.kr/learn/courses/30/lessons/389481)
  <details>
  <summary>간단하게 접근하기</summary>
    > todo
  </details>

<br/>
<br/>
<br/>
<br/>
<br/>
