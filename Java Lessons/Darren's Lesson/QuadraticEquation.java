
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
public class QuadraticEquation {
	private double a, b, c; // declaring our private variables: a, b, c
	
        // our constructor for QuadraticEquation
	public QuadraticEquation(double a, double b, double c) {
		this.a=a; 
		this.b=b;
		this.c=c;
	}
	
	public double getA() { //a's getter
		return a;
	}
	
	public double getB() { //b's getter
		return b;
	}
	
	public double getC() { //c's getter
		return c;
	}
	
	public double getDiscriminant() { 
		return Math.pow(b, 2)-4*a*c; // based on the formulas given on the worksheet
                // we get the Discriminant using b^2, which is done by Math.pow(b,2)<- the 2 is the power
                // we then subtract that by (4ac)
	}
	
        //Based on the calculations from the sheet as well.
	public double getRoot1() {
		if (this.getDiscriminant()>=0) // we only use the getRoots if the discriminant is >=0
			return (-b+Math.sqrt(this.getDiscriminant()))/(2*a); 
		else return 0; //otherwise we don't have roots ( 0 ) 
	}
	
	public double getRoot2() {
		if (this.getDiscriminant()>=0)
			return (-b-Math.sqrt(this.getDiscriminant()))/(2*a);
		else return 0;
	}
	
}
