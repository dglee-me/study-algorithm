# 알고리즘

## 알고리즘 문제 풀이

- [Profile](https://solved.ac/profile/dglee_dev)

## 정렬 알고리즘 Sorting Algorithm

| 정렬 알고리즘                | 평균 시간 복잡도  | 최악 시간 복잡도 |
|------------------------|------------|-----------|
| 퀵 정렬 (Quick Sort)      | O(n log n) | O(n²)     |
| 버블 정렬 (Bubble Sort)    | O(n²)      | O(n²)     |
| 선택 정렬 (Selection Sort) | O(n²)      | O(n²)     |
| 삽입 정렬 (Insertion Sort) | O(n²)      | O(n²)     |

### 퀵 정렬 Quick Sort

- 특징: **분할 정복 알고리즘**, 평균적으로 빠른 수행 속도, 불안정 정렬
- 동작 과정: 리스트에서 가운데 원소를 피벗으로 선택한다. <br/>
  피벗보다 작은 원소는 피벗의 앞에, 큰 원소는 피벗의 뒤에 위치하도록 정렬한다. <br/>
  피벗을 기준으로 리스트를 두 부분으로 나누어 각 부분을 재귀적으로 정렬한다.

### 버블 정렬 (Bubble Sort)

- 특징: **제자리 정렬 알고리즘**, 인접한 두 데이터의 크기를 비교/정렬, 간단하지만 시간 복잡도는 높음
- 동작 과정: 인접한 두 원소의 크기를 비교하여 순서가 맞지 않으면 교환한다. <br />
  리스트 끝까지 이동하면 가장 큰 원소가 마지막으로 정렬된다.<br />
  위 과정을 반복하여 정렬을 완료한다.

### 선택 정렬 (Selection Sort)

- 특징: **제자리 정렬 알고리즘**, 최솟값을 선택해 맨 앞으로 이동
- 동작 과정: 리스트에서 최솟값을 찾아 맨 앞의 값과 교체한다. <br/>
  맨 앞의 값을 제외한 나머지 부분에서 위 과정을 반복하여 정렬을 완료한다.

### 삽입 정렬 (Insertion Sort)

- 특징: **제자리 정렬 알고리즘**, 현재 위치의 값을 이전의 정렬된 부분과 비교/삽입
- 동작 과정: 두 번째 자료부터 시작하여 현재 자료를 이전의 정렬된 부분과 비교한다. <br/>
  자신의 위치를 찾아 삽입하고, 나머지 부분을 한 칸씩 민다. <br/>
  위 과정을 반복하여 정렬을 완료한다.
