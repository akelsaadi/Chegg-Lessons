def check_binString(BS):
    try:
        int(BS)
        for i in str(BS):
            if i == '0' or i =='1':

                pass
            else:
                raise ValueError
        return True

    except ValueError:
        print("Your binary string must be an integer an only contain 1s and 0s")


def main():
     binary_string = input("Enter your binary string: ")
     if check_binString(binary_string):
        print("True")
     else:
         print("False")



if __name__ == '__main__':
    main()