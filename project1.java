import java.util.Scanner;
class Clerk
{
    int id,age;
    String name;
    int salary=20000;
    String desig="Clerk";
    Clerk()
    {

    }

    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");
        id=sc.nextInt();

 

        System.out.println("Enter Name:");
        name=sc.next();

 

        System.out.println("Enter Age:");
        age=sc.nextInt();
    }
    void display()
    {
        System.out.println("===========");
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
        System.out.println("Desig :"+desig);
    }
}
class Dev
{
    int id,age;
    String name;
    int salary=30000;
    String desig="Dev";
    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");
        id=sc.nextInt();

 

        System.out.println("Enter Name:");
        name=sc.next();

 

        System.out.println("Enter Age:");
        age=sc.nextInt();
    }
    void display()
    {
        System.out.println("===========");
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
        System.out.println("Desig :"+desig);
    }
}
class Tester
{
    int id,age;
    String name;
    int salary=25000;
    String desig="Tester";
    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID  :");
        id=sc.nextInt();

 

        System.out.println("Enter Name :");
        name=sc.next();

 

        System.out.println("Enter Age  :");
        age=sc.nextInt();
    }
    void display()
    {
        System.out.println("============");
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
        System.out.println("Desig :"+desig);
    }
}


 

class Manager
{
    int id,age;
    String name;
    int salary=50000;
    String desig="Manager";
    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID  :");
        id=sc.nextInt();

 

        System.out.println("Enter Name :");
        name=sc.next();

 

        System.out.println("Enter Age  :");
        age=sc.nextInt();
    }
    void display()
    {
        System.out.println("==========");
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
        System.out.println("Desig :"+desig);
    }
}

 

public class project1{

 

    static void call(){
        Clerk c = new Clerk();
        Dev d = new Dev();
        Tester t = new Tester();
        Manager m = new Manager();    

 

        System.out.println("Choose any Option:" + '\n' + "1.Create"+'\n'+"2.Display"+'\n'+"3.Exit");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input){
            case 1: 
                System.out.println("Choose any Option:" + '\n' + "1.Clerk"+'\n'+"2.Dev"+'\n'+"3.Tester"+'\n'+"4.Manager"+'\n'+"5.Exit");


            int in = sc.nextInt();
            switch(in){
                case 1:
                System.out.println("Clerk ");
                c.input();
                call();
                break;    
                case 2:
                System.out.println("Dev");
                d.input();
                break;
                case 3:
                System.out.println("Tester ");
                t.input();    
                break;
                case 4:
                System.out.println("Manager");
                m.input();    
                break;
                case 5:
                call();
                   }    
                break;

 

            case 2:
                System.out.println("Choose any Option:" + '\n' + "1.Clerk"+'\n'+"2.Dev"+'\n'+"3.Tester"+'\n'+"4.Manager"+'\n'+"5.Exit");

            int di = sc.nextInt();
            switch(di){
                case 1:
                System.out.println("Clerk ");
                c.display();
                call();
                break;    
                case 2:
                System.out.println("Dev");
                d.display();
                break;
                case 3:
                System.out.println("Tester");
                t.display();    
                break;
                case 4:
                System.out.println("Manager");
                m.display();    
                break;
                case 5:
                call();
                   }
            break;

 

            case 3:
                System.out.println("Thankyou!");
                    break;


        }
}

 
    public static void main(String args[]) {




        call();
    }
}