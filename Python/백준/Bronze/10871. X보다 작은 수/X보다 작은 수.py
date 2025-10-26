# 1. N과 X를 입력받는다.
N, X = map(int, input().split())

# 2. N개의 정수를 리스트(A)로 입력받는다.
A = list(map(int, input().split()))

# 3. X보다 작으면 숫자를 출력하고, 줄바꿈 대신 빈칸 출력
for num in A:
    if num < X:
        print(num, end=" ")