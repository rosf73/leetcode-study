## [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
이진트리를 문자열로 변환하거나 문자열을 이진트리로 변환하는 코드를 구현하는 문제.

### 해결
트리를 입력받으면 트리를 순회하면서 문자열로 변환시켰다. <br/>
문자열을 변환시킬때 노드가 더이상 이어져 있지 않으면 M으로 표기하여 표현하였다.<br/>
문자열을 트리로 변환시킬때는 거꾸로 진행하였다.

### 복기
많이 복잡했던 문제. <br/>
양방향 변환이 가능해야했기에 생각해야 하는 부분이 많았음 <br/>
한쪽을 변환하면 다른쪽은 쉽게 코드를 구성 가능했음.
