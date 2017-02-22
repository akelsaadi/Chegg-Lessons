# EEE230 Fall 2016
.data
val1: .word 1
val2: .word 2
val3: .word 3
name:  .asciiz "Tim Walker \n"
.globl main
.text
main:

# to print name
addi $v0, $zero, 4
lui, $a0, 0x1001
addi $a0, $a0, 12
syscall 

# adding numbers in $s registers
addi $s0, $0, 7
addi $s1, $0, 8
addi $s2, $0, -3

#store $s1 in val1
lui $t0, 0x1001
sw $s1, 0($t0)
sw $s2, 4($t0) #store $s2 in val2

sub $t1, $s0, $s1 #subtract $s1 from $s0 ---> store in $t1
addi $t2, $s2, -5 #add $s2 - 4 ---> store in $t2
add $t3, $t2, $t1 #add $t2 + $t1 ---> store in $t3
sw $t3, 8($t0) #store $t3 in val3

addi $s1, $0, 10 #change val of s1 to 10
addi $s2, $0, 5 #change val of s2 to 5

#swapping values of val1 and val2
lw $t2, 0($t0)
sw $t1, 0($t0)
sw $t2, 4($t0)

sub $s0, $zero, $s0 #Set the value in $s0 to –$s0 


#next line
addi $v0, $zero, 4 #getting ready to print
lui $a0, 0x1001 #unassign $a0
addi $a0, $a0, 32 #get in the list
syscall #syscall
addi $v0, $zero, 1 
addi $a0, $s0, 0 #s0 (-7) is now in a0
add $a1, $a0, $s1 #s1 (10) is added to -7 = 3
add $a0, $a1, $s2 #s2(5) is added to 3 = 8
syscall #print

#end program
addi $v0, $zero, 10
syscall #end program


