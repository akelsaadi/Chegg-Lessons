.data
Welcome1:.asciiz "\n Hello! you are about to play the mastermind guessing and logic game, Bulls & Cows!\n The Computer will generate a secret number made of 4 unique integer number.You have to guess the number!\n Using the number of Bulls and Cows you get to find out what the secret number is!\n"
Welcome2: .asciiz "\nEvery digit you enter that is both correct and in the right location is a BULL. \nWhen you get 4 BULLS, YOU WIN!\n\nEvery digit you enter that is correct, but not in the right location is a COW!\n"
confirm: .asciiz "\n Select \nYES - if you are ready to guess \n NO - to see the rules again \n Cancel - to exit the Game\n"
.text
main:jal welcome
welcome:
la $a0,Welcome1
li $a1,1
li $v0, 55
syscall

la,$a0,Welcome2
li $v0,55
syscall

la $a0,confirm
li $v0,50
syscall
beq $a0,2, Exit
beq $a0,1, welcome

Exit:
li $v0,10
syscall
