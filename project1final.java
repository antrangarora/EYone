import java.util.Scanner;
class Clerk
{
    int id,age;
    String name;
    int salary=20000;
    String desig="Clerk";
    Clerk()
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
        System.out.println("========================");
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
    Dev()
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
        System.out.println("========================");
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
    Tester()
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
        System.out.println("========================");
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
    Manager()
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
        System.out.println("========================");
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
        System.out.println("Desig :"+desig);
    }
}

 

 

class project1final
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        Clerk cl = null;
        Tester t1 = null;
        Manager m1 = null;
        Dev d1 = null;
        int ch = 0;
        do{
        System.out.println("1 - Create");
        System.out.println("2 - Display");
        System.out.println("3 - Exit");
        ch = scn.nextInt();
            if(ch==1){
                    int c = 0 ;
                do{

                    System.out.println("1 - Clerk");
                    System.out.println("2 - Dev");
                    System.out.println("3 - Tester");
                    System.out.println("4 - Manager");
                    System.out.println("5 - Exit");
                    c = scn.nextInt();
                    if(c==1){
                        cl = new Clerk();
                    }else if(c==2){
                        d1 = new Dev();
                    }else if(c==3){
                        t1 = new Tester();
                    }else if(c==4){
                        m1 = new Manager();
                    }
                    else{
                        System.out.println("Invalid Input");
                    }

 

                }while(c!=5);
            }else if(ch==2){
                    int c = 0;
                do{

                    System.out.println("1 - Clerk");
                    System.out.println("2 - Dev");
                    System.out.println("3 - Tester");
                    System.out.println("4 - Manager");
                    System.out.println("5 - Exit");
                    c = scn.nextInt();
                    if(c==1){
                        cl.display();
                    }else if(c==2){
                        d1.display();
                    }else if(c==3){
                        t1.display();
                    }else if(c==4){
                        m1.display();
                    }
                    else{
                        System.out.println("Invalid Input");
                    }
                }while(c!=5);
            }else{
                System.out.println("Thank You");
            }
        }while(ch!=3);

 

    }
}