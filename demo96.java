class A{

void display(){
        System.out.println("Default Constructor");
    }
    void display(int id, String name){
        System.out.println(id);
        System.out.println(name);
    }

 

    void display(int age, int salary, String desig){
        System.out.println(age);
        System.out.println(salary);
        System.out.println(desig);
    }


 

}
class B{}
class demo96{
    public static void main(String args[]){
        A a = new A();
        a.display(100,"Max"); //method o
        a.display(25,50000,"Dev");
    }
}