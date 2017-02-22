__author__ = 'Jess Levine'

'''RandomNumberFileReader.py: Reads a user specified file, displaying all numbers stored in the file,
        maximum number, minimum number, and average of all numbers.'''



# define main() function
def main():
    fileName = getFileName()
    #fileContents = readRandomNumberFile(fileName)
    display(fileName)


# define function getFileName()
def getFileName():
    fileName = input("Enter file name: ")
    fileName += ".txt"
    return fileName


# define function createRandomNumberFile

def display(fileName):
    infile = open(fileName, 'r')
    numbers = [float(line.rstrip("\n")) for line in infile]
    print(str(numbers) + "\n")
    largest_num = max(numbers)
    smallest_num = min(numbers)
    total = sum(numbers)
    count = len(numbers)
    average = total/count
    infile.close()

    print("Minimum: " + str(smallest_num))
    print("Maximum: " + str(largest_num))
    print("Numbers listed in the file: ", str(count))
    print("Average of numbers stored in file: ", str(average))



main()

