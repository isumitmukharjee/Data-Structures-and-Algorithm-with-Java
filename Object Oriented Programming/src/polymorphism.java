class Students{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(String name, int age){
        System.out.println(this.name+" "+this.age);
    }
    public void printInfo(int age){
        System.out.println(this.age);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "john";
        s1.age = 23;

        s1.printInfo(s1.name, s1.age);
        s1.printInfo(s1.age);
    }
}
