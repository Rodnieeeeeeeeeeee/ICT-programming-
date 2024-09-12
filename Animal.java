public class Animal{
   public static void main (String[] args){
   
   private String name;
   private int id;
   private int age;
   
   //setters
   
   public void setName(String name){
    this.name = name;
   }
   public void setId(int id){
   this.id = id;
   }
   public void setName(int age){
    this.age = age;
	
	//getters
	
	public String getName(){
	return name;
	}
	public int getId(){
	return id;
	}
	public int getAge(){
	return age; 
	}
	
	//method overloading () -no parameters
	
	public void eat (){
		System.out.println("The animal is eating");
	}
	//method overloading   no parameters list
	public void eat(String food){
		System.out.println("The animal named" + name + " is eating " + food);
	}
	
  
   }
}