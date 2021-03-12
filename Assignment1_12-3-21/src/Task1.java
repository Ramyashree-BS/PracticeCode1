class Fruit
{ 
	String name;
	String taste; 
	
	public Fruit(String name, String taste) {
		super();
		this.name = name;
		this.taste = taste;
	}

	void eat() 
	{ 
		System.out.println(name+" "+taste); 
	} 
}

class Apple extends Fruit
{
	Apple(String name, String taste)
	{
		super(name,taste); 
	}
	
	@Override void eat() 
	{ 
		System.out.println(name+" "+taste); 
	}
}


class Orange extends Fruit
{ 
	Orange(String name, String taste) 
	{
		super(name,taste); 
	} 

	@Override void eat() 
	{ 
		System.out.println(name+" "+taste); 
	}
}


public class Task1
{
	public static void main(String args[]) 
	{  
		Apple apple= new Apple("Apple","Sweet");
		Orange orange=new Orange("Orange","Sour");
		apple.eat();
		orange.eat();
		
	}
 }

