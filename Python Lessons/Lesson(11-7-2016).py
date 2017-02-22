def fcopy (fileone,filetwo):
    '''Copies the content of the first file into the second.
    >>> fcopy( 'example.txt' , 'output.txt' )
    >>> open( 'output.txt' ).read()
    The 3 lines in this file end with the new line character.\n\n
    There is a blank line above this line.\n'''
    infile = open(fileone, 'r') #open file and this is the read hence 'r'
    outfile = open(filetwo, 'w') #open file and this is the write 'w'
    s=infile.read() #reading from infile and putting whatever we have into s.
    outfile.write(s) #using s to write it to the outfile which is our to be second file
    infile.close() #closing file
    outfile.close() #closing file

fcopy('test.txt', 'test1.txt')


# Problem 2: 4.29
'''
Write a function stats() that takes one input argument: the name of a text file. The
function should print, on the screen, the number of lines, words, and characters in the file;
your function should open the file only once.
'''
def stats(file):
    infile14 = open(file, 'r') #creating file and reading from it.
    content = infile14.read() #read from file and store in content
    linec = content.count('\n') + 1 #we are counting the lines '\n' is a new line so we count how many there is and we add 1 for everline
    wordlist = content.split() #we split the words of the text file by using the split() and we store them in wordlist
    wordc = len(wordlist) #now we find the length of the wordlist, aka how many words we have
    characterc = len(content) #now we find the length of the whole file
    infile14.close() #close the file.
    format_str = 'line count: {}\nwordcount: {}\ncharacter count: {}' #just some formating for printing on the screen.
    end = format_str.format(linec, wordc, characterc) #set end to what we want to print on the screen using the format above.
    print(end) #printing end.


stats('test.txt')

def duplicate(file):
    thisFile = open(file, 'r') #file and read from  file
    content = thisFile.readlines() #store everything in content.
    masterList = [] #create a list to add the seperate words in

    for line in content: # for loop and add from content to masterlist every word, we know we're adding every word since we're splitting them up by space
        masterList+=line.split(" ")

    thisFile.close() #close the file.

    for word in masterList: #another for loop to try to see if we have duplicates.
        if masterList.count(word) > 1 and word.isalpha(): #we check if we have a count of a certain word greater than 1 and we check if it's an actual word by using is alpha
            return True #if above case is met, we return true hence print true
    return False #otherwise return and print false


print(duplicate('test.txt'))
print(duplicate('test1.txt'))

