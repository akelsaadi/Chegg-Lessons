import math

def binary_to_decimal():
    number = input ("Enter your binary string: ")
    decimal=0
    for digit in number:
        decimal= decimal * 2 + int(digit)
    print(decimal)

binary_to_decimal()