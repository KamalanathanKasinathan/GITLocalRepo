class Dog 
{ 
	String name; 
	String color; 
	String gender; 
	int cost;
	String breed;  
void eat() 
{ 
	System.out.println("Dog "+ name +" is Eating..."); 
}  
void sleep() 
{ 
	System.out.println("Dog "+ name +" is Sleeping..."); 
}  
void bite() 
{ 
	System.out.println("Dog "+ name +" is biteing..."); 
}  
void bark() 
{ 
	System.out.println("Dog "+ name +" is barking..."); 
} 
}  
class DogApp 
{ 
public static void main(String []args) 
{ 
	Dog d1 = new Dog();  
	Dog d2 = new Dog(); 

	d1.name = "tom"; 
	d1.color = "black"; 
	d1.gender = "Male"; 
	d1.cost = 1000; 
 	d1.breed = "pug";

	d2.name = "tome"; 
	d2.color = "brown"; 
	d2.gender = "Female"; 
	d2.cost = 1000 ; 
 	d2.breed = "pug";
 
	d1.eat();
	d1.sleep();
	d1.bite(); 
	d1.bark();
System.out.println("name = " + d1.name); 
System.out.println("color = " + d1.color); 
System.out.println("gender = " + d1.gender);
System.out.println("cost = " + d1.cost); 
System.out.println("breed = " + d1.breed);

System.out.println("======================================" );
	d2.eat();
	d2.sleep();
	d2.bite(); 
	d2.bark();
System.out.println("name = " + d2.name); 
System.out.println("color = " + d2.color); 
System.out.println("gender = " + d2.gender);
System.out.println("cost = " + d2.cost); 
System.out.println("breed = " + d2.breed); 
} 
}