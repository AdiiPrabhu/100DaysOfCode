'''Write a program that prints ‘Hello World’ to the screen.'''

print("Hello World")
print('\'Hello World\'')


''''''''''''''''''''''''''''''''''''''''''''

'''Write a program that asks the user for their name and greets them with their name.'''

print("Enter your name")
a=input()
print(a+" Welcome to coders hub")

''''''''''''''''''''''''''''''''''''''''''''
'''Modify the previous program such that only the users Alice and Bob are greeted with their names.'''

print('Enter your name')
a=input()
if(a.title()=='Alice'):
    print(a+" Welcome to coders hub")
elif(a.title()=='Bob'):
    print(a+" Welcome to coders hub")
else:
    print("Error")

''''''''''''''''''''''''''''''''''''''''''''
'''Write a program that asks the user for a number n and prints the sum of the numbers 1 to n'''

print('Enter a number')
n=int(input())
sums=0
for i in range(0,n+1):
    sums =sums+ i
    print(sums)
print(sums)

''''''''''''''''''''''''''''''''''''''''''''
'''Modify the previous program such that only multiples of three or five are considered in the sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17'''

print('Enter a number')
n=int(input())
sums=0
for i in range (1,n+1):
    if (i%3==0 or i%5==0):
        sums=sums+i
        print(sums)
print(sums)
    
