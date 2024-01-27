# 알고리즘

## 알고리즘 문제 풀이

- [Profile](https://solved.ac/profile/dglee_dev)

## 정렬 알고리즘 Sorting Algorithm

| 정렬 알고리즘                | 평균 시간 복잡도        | 최악 시간 복잡도        | 사용을 고려할 때                          |
|------------------------|------------------|------------------|------------------------------------|
| * 병합 정렬 (Merge Sort)   | ```O(n log n)``` | ```O(n log n)``` | 메모리 사용이 가능한 경우 <br/>(배열의 크기만큼 더)   |
| 퀵 정렬 (Quick Sort)      | ```O(n log n)``` | ```O(n²)```      | 평균적으로 빠르고 (and)<br/>제자리 정렬이 필요한 경우 |
| 버블 정렬 (Bubble Sort)    | ```O(n²)```      | ```O(n²)```      | 데이터셋이 작고 (and)<br/>정렬이 거의 되어 있는 경우 |
| 선택 정렬 (Selection Sort) | ```O(n²)```      | ```O(n²)```      | 데이터셋이 작고 (and)<br/>간단한 구현이 필요한 경우  |
| 삽입 정렬 (Insertion Sort) | ```O(n²)```      | ```O(n²)```      | 데이터셋이 작거나 (or)<br/>이미 대부분 정렬된 경우   |

### 병합 정렬 (Merge Sort)

- **분할 정복 알고리즘**
- **특징:** 안정적인 정렬, 메모리 소모가 큼
- **동작 과정:**
    1. 주어진 배열을 반으로 나눈다.
    2. 나뉜 부분 배열을 재귀적으로 병합 정렬한다.
    3. 정렬된 부분 배열을 합병하여 최종적으로 정렬된 배열을 얻는다.
- **장점:**
    - 평균 및 최악의 경우 시간 복잡도가 ```O(n log n)```이다.
    - 안정적인 정렬이다. (즉, 같은 값에 대해 순서가 바뀌지 않는다.)
    - 큰 데이터셋에서 다른 정렬 알고리즘에 비해 효율적이다.
- **단점:**
    - 추가적인 메모리가 필요하다. (정렬할 배열의 크기만큼의 메모리가 필요하다.)
    - 정렬된 데이터셋에 대해서도 항상 두 부분으로 나누어 정렬한다.
    - 작은 데이터셋에서는 다른 정렬 알고리즘에 비해 효율적이지 않을 수 있다.

### 퀵 정렬 Quick Sort

- **분할 정복 알고리즘**
- **특징:** 평균적으로 빠른 수행 속도, 불안정 정렬
- **동작 과정:**
    1. 리스트에서 가운데 원소를 피벗으로 선택한다.
    2. 피벗보다 작은 원소는 피벗의 앞에, 큰 원소는 피벗의 뒤에 위치하도록 정렬한다.
    3. 피벗을 기준으로 리스트를 두 부분으로 나누어 각 부분을 재귀적으로 정렬한다.
- **장점:**
    - 평균적으로 빠른 수행 속도를 가진다. (평균 시간 복잡도: ```O(n log n)```)
    - 제자리 정렬(in-place sorting)이기 때문에 추가적인 메모리가 필요하지 않다.
- **단점:**
    - 최악의 경우 시간 복잡도가 ```O(n²)```이다.
    - 피벗을 선택하는 방법에 따라 수행 속도가 크게 달라진다.
    - 정렬된 데이터셋에 대해서는 효율적이지 않다.
    - 안정적이지 않다.

### 버블 정렬 (Bubble Sort)

- **제자리 정렬 알고리즘**
- **특징:** 인접한 두 데이터의 크기를 비교/정렬, 간단하지만 시간 복잡도는 높음
- **동작 과정:**
    1. 인접한 두 원소의 크기를 비교하여 순서가 맞지 않으면 교환한다.
    2. 리스트 끝까지 이동하면 가장 큰 원소가 마지막으로 정렬된다.
    3. 위 과정을 반복하여 정렬을 완료한다.
- **장점:**
    - 구현이 간단하다.
    - 제자리 정렬(in-place sorting)이기 때문에 추가적인 메모리가 필요하지 않다.
- **단점:**
    - 이미 정렬된 리스트의 경우에도 비교/교환 과정이 모두 이루어진다.
    - 대부분의 경우 다른 정렬 알고리즘이 더 효율적이다.

### 선택 정렬 (Selection Sort)

- **제자리 정렬 알고리즘**
- **특징:** 최솟값을 선택해 맨 앞으로 이동
- **동작 과정:**
    1. 리스트에서 최솟값을 찾아 맨 앞의 값과 교체한다.
    2. 맨 앞의 값을 제외한 나머지 부분에서 위 과정을 반복하여 정렬을 완료한다.
- **장점:**
    - 구현이 간단하다.
    - 제자리 정렬(in-place sorting)이기 때문에 추가적인 메모리가 필요하지 않다.
- **단점:**
    - 안정적이지 않다.
    - 대부분의 경우 다른 정렬 알고리즘이 더 효율적이다.

### 삽입 정렬 (Insertion Sort)

- **제자리 정렬 알고리즘**
- **특징:** 현재 위치의 값을 이전의 정렬된 부분과 비교/삽입
- **동작 과정:**
    1. 두 번째 자료부터 시작하여 현재 자료를 이전의 정렬된 부분과 비교한다.
    2. 자신의 위치를 찾아 삽입하고, 나머지 부분을 한 칸씩 민다.
    3. 위 과정을 반복하여 정렬을 완료한다.
- **장점:**
    - 구현이 간단하다.
    - 제자리 정렬(in-place sorting)이기 때문에 추가적인 메모리가 필요하지 않다.
    - 작은 데이터셋에서는 다른 정렬 알고리즘에 비해 효율적이다.
- **단점:**
    - 큰 데이터셋에서는 비효율적이다.
    - 대부분의 경우 다른 정렬 알고리즘이 더 효율적이다.