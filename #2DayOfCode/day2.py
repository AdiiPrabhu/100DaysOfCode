'''Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.'''
'''
n=int(input())
print('Enter choice sum or product')
a=input()
sum=1
if(a=='sum'):
    for i in range(1,n+1):
      sum=sum+i
    print(sum-1)
elif(a=='product'):
    for i in range(1,n+1):
      sum=sum*i
    print(sum)
else:
    print('error')
   '''

'''Write a program that prints a multiplication table for numbers up to 12.'''
'''
n=int(input())
for i in range(1,n+1):
    print("\ntable of ",i,'is \n')
    for j in range(1,13):
        print(i,'*',j,'=',(i*j))
'''

'''Write a program that prints all prime numbers. (Note: if your programming language does not support arbitrary size numbers, printing all primes up to the largest number you can easily represent is fine too.)'''
'''
from sympy import *

n=int(input())
for i in range (1,n+1):
    if isprime(i)== True:
        print(i)
''' 

'''Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether their number was too large or too small. At the end the number of tries needed should be printed. It counts only as one try if they input the same number multiple times consecutively.'''

print('enter a number')
a=int(input())
def numb(a):   
    j=0
    i=True
    while i is True:
        if(a==5):
            print('correct number')
            i=False
        elif(a<5):
            print('The difference is ',a-5)
            j=j+1
            return numb(a)    
        elif(a>5):
            print('The difference is ',5-a)
            j=j+1
        print(j)

numb(a)
    
