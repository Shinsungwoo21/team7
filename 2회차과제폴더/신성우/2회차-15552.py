import sys

num = int(sys.stdin.readline())

for i in range(num):
    num1, num2 = map(int, sys.stdin.readline().rstrip().split())
    print(num1+num2)