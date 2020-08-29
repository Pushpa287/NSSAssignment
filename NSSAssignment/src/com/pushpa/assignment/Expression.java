package com.pushpa.assignment;

public class Expression {

	public static void main(String[] args) {
      First a= new First();
      Third c=new Third();
      a.b.c=c.b.a;
            
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

