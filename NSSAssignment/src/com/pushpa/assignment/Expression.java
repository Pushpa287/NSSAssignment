/*1) Write any Java program that will have the following statement as one of the lines in the code. 
 * It should not be part of a comment or String. It should be a valid Java Expression. 
 * Program does not have to read or print anything. And it should compile and run without errors.

a.b.c = c.b.a;*/

package com.pushpa.assignment;

public class Expression {

	public static void main(String[] args) {
      First a= new First();
      Third c=new Third();
      a.b.c=c.b.a;
      System.out.println("hi hello");
            
	}
	
}
class First{
	Second b=new Second();
}
class Second{
	int a;
	int c;
	
}
class Third{
	Second b=new Second();
	
}

