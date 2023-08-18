class Emp{
    int id = 100;
    String name ="Employee";
    final int salary=50000;
    final void display(){}
}
final class Clerk extends Emp{ //we can inherit
    //void display() // we can't override

 

}
final class Dev extends Emp{}
class demo87{
    public static void main(String args[]){
        Clerk c =  new Clerk();
        System.out.println(c.id);
        System.out.println(c.name);
        System.out.println(c.salary);
        //c.salary=50000000;
        System.out.println("==================================");
        Dev d =  new Dev();
        System.out.println(d.id);
        System.out.println(d.name);
        System.out.println(d.salary);
    }

 

}