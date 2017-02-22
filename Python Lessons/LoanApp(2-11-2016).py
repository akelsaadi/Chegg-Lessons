import re

def getApproval(FICO):
    rate = 0
    approval = 'Y'

    if FICO >= 760:
        rate = 3.080
    elif FICO >= 700:
        rate = 3.302
    elif FICO >= 680:
         rate = 3.479
    elif FICO >= 660:
         rate = 3.693
    elif FICO >= 640:
         rate = 4.123
    elif FICO >= 620:
        rate = 4.669 
    else:
        approval = 'N'
    return rate, approval


f = open ('C:/Users/Admin/Documents/School/IS 410 Programing/Python/Program 5/Apps.dat', 'rt')
i=0
pattern = r'[0-9]+'
lineset = f.readlines()
print (f.readline())


for line in lineset: 
    i = i + 1  
    input('Next Loan Applicant: ') 
    print (line)
    foo = re.search(pattern, line)
    FICO = int(foo.group())
    if FICO < 300 or FICO > 800:
        print ('ERROR!!! FICO score does not compute! ' )
    else:
        approval = getApproval(FICO)
        if approval[1] == 'N':
           print('Loan is not approved')
        else:
            print('Loan is approved with a rate of ' + str(approval[0]))



f.close()