	.globl main
main:

	.text
################################
## Input and setups for program
	li		$v0, 4			# print string
	la		$a0, prmpt		# propmt for Roman numeral
	syscall
	
	li		$v0, 8			# read string
	la		$a0, inputStr	# location of input string
	li		$a1, 32			# max length of 30
	syscall

	move	$s1, $a0		# m = the location of input string
	addi	$s2, $0, 29		# i = 29, the index for the right most char
	move	$s0, $zero		# initiailize s = 0, the grand sum
	move	$s5, $zero		# max = 0, to track the current maximum number
	
	## parse from right to left
loop:
	add		$t0, $s1, $s2	# $t0 = m + i, location of current char
	lb		$a0, 0($t0)		# $a0 = inputString[m+i], the current char
	jal		lkup			# look up decimal value of the Roman numeral
	bge		$v0, $s5, updt	# if result >= max seen so far, skip to update max
	sub		$v0, $0, $v0	# since prefixed by smaller number, flip the sign
	b		agg				# skip to aggregation
updt:
	move	$s5, $v0		# update curr max. Even if same, max still okay.
agg:
	add		$s0, $s0, $v0	# s = s + (result from lookup)
	addi	$s2, $s2, -1	# i = i - 1
	bgez	$s2, loop		# repeat loop if i >= 0

exit:
	## Print result
	li		$v0, 4			# print string
	la		$a0, out		# The equivalent Arabic numerals is: 
	syscall
	
	li		$v0, 1			# print integer
	move	$a0, $s0		# the answer
	syscall
	
	li		$v0, 4			# print string
	la		$a0, endmsg		# execution complete
	syscall
	
	addi 	$v0, $zero, 10 	# finished .. return
	syscall					# to the Operating System

######### Lookup table for Roman Numerals ##############
# Given ASCII r in register $a0;
# stores the corresponding value in $v0

lkup:
	addi	$sp, $sp, -12	# adjust stack for 2 items
	sw		$t0, 8($sp)		# save $t0 in case it held value
	sw 		$ra, 4($sp) 	# save the return address
	sw 		$a0, 0($sp) 	# save the argument r
	
	### Switch for Roman Numeral characters in $a0
	addi	$t0, $0, 73		# 73 ASCII = "I"
	beq		$a0, $t0, I		# Branch to section for I
	addi	$t0, $0, 86		# 86 ASCII = "V"
	beq		$a0, $t0, V		# Branch to section for V
	addi	$t0, $0, 88		# 88 ASCII = "X"
	beq		$a0, $t0, X		# Branch to section for X
	addi	$t0, $0, 76		# 76 ASCII = "L"
	beq		$a0, $t0, L		# Branch to section for L
	addi	$t0, $0, 67		# 67 ASCII = "C"
	beq		$a0, $t0, C		# Branch to section for C
	addi	$t0, $0, 68		# 68 ASCII = "D"
	beq		$a0, $t0, D		# Branch to section for D
	addi	$t0, $0, 77		# 77 ASCII = "M"
	beq		$a0, $t0, M		# Branch to section for M
	addi	$v0, $0, 0		# return 0 for unrecognized character
	b		lkupEnd			# Exit the subroutine (the otherwise statement)
	
	### Sections for individual Roman Numerals
I:
	addi	$v0, $0, 1		# Set decimal value into $v0
	b		lkupEnd			# Exit the subroutine

V:
	addi	$v0, $0, 5		# Set decimal value into $v0
	b		lkupEnd			# Exit the subroutine

X:
	addi	$v0, $0, 10		# Set decimal value into $v0
	b		lkupEnd			# Exit the subroutine

L:
	addi	$v0, $0, 50		# Set decimal value into $v0
	b		lkupEnd			# Exit the subroutine

C:
	addi	$v0, $0, 100	# Set decimal value into $v0
	b		lkupEnd			# Exit the subroutine

D:
	addi	$v0, $0, 500	# Set decimal value into $v0
	b		lkupEnd			# Exit the subroutine

M:
	addi	$v0, $0, 1000	# Set decimal value into $v0
	b		lkupEnd			# Exit the subroutine

	### Clean up and return to caller
lkupEnd:
	lw		$a0, 0($sp)		# return from jal: restore argument r
	lw		$ra, 4($sp)		# restore the return address
	lw		$t0, 8($sp)		# restore $t0
	addi	$sp, $sp, 12	# adjust stack pointer to pop 2 items
	jr		$ra 			# return to the caller


	.data
inputStr:
    .space 32	# must include extra spaces for "\n\0"
prmpt:
	.asciiz "Enter Roman numerals (max length 30) in uppercase: "
out:
	.asciiz "The equivalent of the numeral is: "
endmsg:
	.asciiz "\nExecution complete.\n\n"
lnbrk:
	.asciiz "\n\n"