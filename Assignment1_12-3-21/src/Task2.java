class Shape 
{ 
	void draw() 
	{ 
		System.out.println("Drawing Shape"); 
	} 
	void erase() 
	{ 
		System.out.println("Erasing Shape"); 
	}
} 

class Circle extends Shape
{ 
	@Override void draw() 
	{ 
		super.draw();
		System.out.println("Drawing Circle\n"); 
	} 
	void erase() 
	{
		super.erase();
		System.out.println("Erasing Circle\n"); 
	}
}

class Triangle extends Shape
{ 
	@Override void draw()
	{
		super.draw();
		System.out.println("Drawing Triangle\n");
	} 
	void erase() 
	{
		super.erase();
		System.out.println("Erasing Triangle\n");
	}
}


class Square extends Shape
{ 
	@Override void draw() 
	{ 
		super.draw();
		System.out.println("Drawing Square\n");
	} 
	void erase() 
	{ 
		super.erase();
		System.out.println("Erasing Square\n"); 
	} 
} 

public class Task2
{ 
	public static void main(String args[]) 
	{ 
		Circle c=new Circle(); 
		Triangle t=new Triangle(); 
		Square s=new Square(); 
		c.draw(); 
		c.erase(); 
		t.draw(); 
		t.erase(); 
		s.draw(); 
		s.erase(); 
	}
}