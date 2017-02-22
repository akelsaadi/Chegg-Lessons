def palindrome():
    number = int(input("Enter a number : "))
    temp = number
    ans = 0
    while(number > 0):
        x = number%10
        number = int(number/10)
        ans = ans*10+x
    if(ans == temp):
        print("The number is Palindrome.")
    else:
        print("The number is not a Palindrome.")




if __name__ == '__main__':
    palindrome()

