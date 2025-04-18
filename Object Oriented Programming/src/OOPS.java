class Pen {
    //bluePrint
    String color;
    String type; //ball or gel

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }

}

class Student{
    String name;
    int age;



    void printNameandAge(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

//    Student(){
//        //Non Parameterised
//        System.out.println("Constructor Called");
//    }

    //Parameterised
//    Student(String name, int age){
//        //Parameterised
//        this.name = name;
//        this.age = age;
//        System.out.println("Constructor Called");
//    }\
    public Student() {

    }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class OOPS {
    public static void main(String[] args) {
//        Pen p = new Pen();
//
//        p.color = "red";
//        p.type = "gel";
//
//        p.write();
//
//        Pen p2 = new Pen();
//        p2.color = "black";
//        p2.type = "dot";
//
//        p.printColor();
//        p.printType();
//        p2.printColor();
//        p2.printType();

        Student s1 = new Student();
        s1.name = "Brock";
        s1.age = 33;
        s1.printNameandAge();
//        s1.name = "Aman";
//        s1.age = 23;

//        Student s2 = new Student("Shradha",33);
//        s2.printNameandAge();

        Student s2 = new Student(s1);
        s2.printNameandAge();
//        s2.name = "Shradha";
//        s2.age = 22;
//
//        s1.printNameandAge();
//        s2.printNameandAge();
    }
}
