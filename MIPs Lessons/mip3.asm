.data #data portion of the program
	# ASCIIz
	prompt: .asciiz "Enter an integer: " 
	result: .asciiz "Total of the largest two integers: " 
	
	# Array
	array: .word 3   #basically creating a variable array and setting it = 3, since we can only input 3 numbers. 
	

.text
	main:
		la $t1, array	# here we are loading address or in other words, the array we set in the data section above to temperary address t1, $t1 = array[]
		li $t2, -1	# # we are loading a value of -1 into t2, $t2 is the counter. Initialized at -1 because index starts at 0
		b PromptInput	# after we do that, we branch using the keyword "b" to the label PromptInput which is on line 16
	
	PromptInput:
		addi $t2, $t2, 1 #so now we add 1 to $t2 which makes $t2 = 0, or in other words we are basically at index 0 
		la $a0, prompt #this should be simple to you, we use that to load the prompt label from the data above (line 3)
		li $v0, 4 
		syscall 
		
		li $v0, 5 #v0, 5 is to ask user for input
		syscall
		
		sw $v0, ($t1)		#revarray[index] getting whatever we got from the user input (v0) and putting in t1 and storing that using sw(Store word) 
		add $t1, $t1, 4		# index++ #when we use store words to traverse forward, we have to add 4.  or in other words, remember the array we loaded up top into t1? we are adding 4 to that.	# Traverse forward
		
		bge $t2, 2, ProcessInt #remember how we set the index of our so called array earlier to t2?, now we're comparing that t2 to 2, which means if the index is greater than or equal to 2, we go to processInt, otherwise,
		# we go back again to the label branchInput, we add the index by 1, we ask the user for input, store it using storeword, traverseforward by adding 4,
		# we go again now our so called index is at 2 ( last time to ask for user input), get user input, store it using store word and traverse forward. now that our index is at 2, we actually branch to start processing
		
		b PromptInput
	
	ProcessInt:
		la $t1, array #now that we have everything stored, we set t1 to the begining of the array. so we can start popping everything out
		lw $t3, ($t1) #now we're popping out everything we stored, using load word, t3 will have the first number enetered
		add $t1, $t1, 4 #add 4 so we can move up
		lw $t4, ($t1) #now we load the second number enetered into t4 
		add $t1, $t1, 4 #add 4 so we can move up
		lw $t5, ($t1) #now we load the third number enetered to t5
		
		blt $t3, $t4, B		# if $t3 < $t4 then we go to branch B 
		b A					#if $t3 > $t4 then we branch to A
		
	A:
		blt $t4, $t5, C		# if t4 < t5 then our two greatest numbers are t3 and t5 # we branch to C where we branch to SUM AC from there which adds t3 and t5
		b B					# if $t4 > $t5 # then our two greatest numbers are t3 and t4, so we branch to B where we branch to SumAb which adds t3 and t4
	B: 
		bgt $t3, $t5, SumAB		# $t3 + $t4  #if t3 < t4 and t3 > t5 then our two biggest numbers are t3 and t4 so we branch to summing them
		b SumBC				# $t4 + $t5 # if t3 < t4 and t5 > t3 then our two biggest numbers are t4 and t5 so we branch to summing them
	C:
		b SumAC				# $t3 + $t5 #
	
	SumAB:
		add $s0, $t3, $t4	# $s0 = $t3 + $t4 # adding t3 and t4 and storing them in s0, s0 is a saved register. we put in s0 that way we don't lose it.
		b Exit #Branch to exit when summation is done.
	
	SumBC:
		add $s0, $t4, $t5	# $s0 = $t4 + $t5
		b Exit
	
	SumAC:
		add $s0, $t3, $t5	# $s0 = $t3 + $t5
		b Exit
	
	Exit:
		la $a0, result #loading address result from the .data we created above
		li $v0, 4 #showing it to the user.
		syscall # doing a syscall on it
		
		# Print the summation
		move $a0, $s0		# $a0 = $s0 that way we can print out the number we got from either sum AB, sum BC, or sum AC
		li $v0, 1 #show the number by calling v0, 1
		syscall
		
		li $v0, 10 #exiting the program.
		syscall