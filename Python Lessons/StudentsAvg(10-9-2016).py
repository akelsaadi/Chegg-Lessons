#Declare constants
STUDENTS = "Students.txt"
STUDENT_AVG = "StudentAverages.txt"



#get number of quizzes per student
def read_file():
    qty = int(input("How many quizes: "))
    output = open("Output.txt", 'w+')
    file1 = open(STUDENTS)
    splitter = file1.read().split()
    grade =0
    count = 0
    counter = 0
    temp3 = 2
    temp2 =0
    print str.strip(file1)

    with open(STUDENTS) as openfileobject:
        for line in openfileobject:
            count +=1

    counter3 = count/(qty+2)

    for zy in range(counter3):
        first_name =(splitter[counter])
        last_name = (splitter[counter+1])
        output.write(first_name + "," + last_name + " ")
        counter += qty + 2
        temp2 += qty+2
        grade = 0
        for yk in range(temp3, temp2):
            y = splitter[yk]
            temp = int(y)
            grade += temp
        average = grade/qty
        output.write(str(average) + "\n")
        temp3 += qty+2

    output.close()





def trial():
    file2 = open(STUDENTS)
    names = []






def main():


    #read_file()
    trial()

main()



