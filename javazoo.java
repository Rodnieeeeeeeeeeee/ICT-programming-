public class JavaZoo {

    private static String zooName = "Java Park n Zoo";

    
    public JavaZoo() {
    }

    public static void main(String[] args) {

        

        ZooAnimal animal = new ZooAnimal();
        ZooAnimal animal2 = new ZooAnimal();
        ZooAnimal animal3 = new ZooAnimal("Yuri", "mangingisda", 16, true);

        
        animal.setName("mik");
        animal.setType("baby koo");
        animal.setAge(16);
        animal.setHungry(true);
        

        System.out.println("The name of the animal " + animal.getName());
        System.out.println("The type of the animal " + animal.getType());
        System.out.println("The age of the animal " + animal.getAge());
        System.out.println("The animal is hungry: " + animal.isHungry());

        System.out.println("");
        System.out.println("Name: " + animal2.getName());
        System.out.println("Type: " + animal2.getType());
        System.out.println("Age: " + animal2.getAge());

        System.out.println("");
        System.out.println("Name: " + animal3.getName());
        System.out.println("Type: " + animal3.getType());
        System.out.println("Age: " + animal3.getAge());
        System.out.println("Hungry: " + animal3.isHungry());

    } 
} 

class ZooAnimal {
    private String name;
    private String type;
    private int age;
    private boolean hungry;

    public ZooAnimal() {
        this.name = "yuriii";
        this.type = "taga hugas ng plato";
        this.age = 16666;
        this.hungry = false;
    }

    public ZooAnimal(String name, String type, int age, boolean hungry) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hungry = hungry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isHungry() {
        return this.hungry;
    }
    
    @Override
    public String toString() {
        return "ZooAnimal{" + "name='" + name + '\'' + ", type='" + type + '\'' + ", age=" + age + ", hungry=" + hungry + '}';
    }
}