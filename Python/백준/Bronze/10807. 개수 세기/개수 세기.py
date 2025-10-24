# 1. N을 입력
N = int(input())

# 2. N개의 정수를 리스트로 입력
numbers = list(map(int, input().split()))

# 3. v를 입력
v = int(input())

# 4. 리스트(numbers)에서 v와 일치하는 요소의 개수를 셉니다.
count = numbers.count(v)

# 5. 결과를 출력합니다.
print(count)