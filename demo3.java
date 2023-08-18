import java.util.Scanner;

 

class Clerk {
    int id, age;
    String name;
    int salary = 20000;
    String desig = "Clerk";

 

    void clerk_create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID  :");
        id = sc.nextInt();
        System.out.println("Enter Name :");
        name = sc.next();
        System.out.println("Enter Age  :");
        age = sc.nextInt();
    }

 

    void clerk_display() {
        System.out.println("========================");
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Age :" + age);
        System.out.println("Salary :" + salary);
        System.out.println("Desig :" + desig);
    }
}

 

class Dev {
    int id, age;
    String name;
    int salary = 30000;
    String desig = "Dev";

 

    void dev_create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID  :");
        id = sc.nextInt();
        System.out.println("Enter Name :");
        name = sc.next();
        System.out.println("Enter Age  :");
        age = sc.nextInt();
    }

 

    void dev_display() {
        System.out.println("========================");
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Age :" + age);
        System.out.println("Salary :" + salary);
        System.out.println("Desig :" + desig);
    }
}

 

class Tester {
    int id, age;
    String name;
    int salary = 25000;
    String desig = "Tester";

 

    void tester_create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID  :");
        id = sc.nextInt();
        System.out.println("Enter Name :");
        name = sc.next();
        System.out.println("Enter Age  :");
        age = sc.nextInt();
    }

 

    void tester_display() {
        System.out.println("========================");
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Age :" + age);
        System.out.println("Salary :" + salary);
        System.out.println("Desig :" + desig);
    }
}

 

class Manager {
    int id, age;
    String name;
    int salary = 50000;
    String desig = "Manager";

 

    void manager_create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID  :");
        id = sc.nextInt();
        System.out.println("Enter Name :");
        name = sc.next();
        System.out.println("Enter Age  :");
        age = sc.nextInt();
    }

 

    void manager_display() {
        System.out.println("========================");
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Age :" + age);
        System.out.println("Salary :" + salary);
        System.out.println("Desig :" + desig);
    }
}

 

public class demo3 {
    public static void main(String args[]) {
        System.out.println("Choose any one from the following ");
        System.out.println("1) Create");
        System.out.println("2) Display");
        System.out.println("3) Exit");

 

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

 

        switch (choice) {
            case 1:
                System.out.println("1) Clerk");
                System.out.println("2) Developer");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("5) Exit");

 

                int sub_choice1 = sc.nextInt();
                switch (sub_choice1) {
                    case 1:
                        Clerk c = new Clerk();
                        c.clerk_create();
                        break;
                    case 2:
                        Dev d = new Dev();
                        d.dev_create();
                        break;
                    case 3:
                        Tester t = new Tester();
                        t.tester_create();
                        break;
                    case 4:
                        Manager m = new Manager();
                        m.manager_create();
                        break;
                    case 5:
                        System.out.println("Thank you");
                        break;
                }
                break;

 

            case 2:
                System.out.println("1) Clerk");
                System.out.println("2) Developer");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("5) Exit");

 

                int sub_choice2 = sc.nextInt();
                switch (sub_choice2) {
                    case 1:
                        Clerk c = new Clerk();
                        c.clerk_display();
                        break;
                    case 2:
                        Dev d = new Dev();
                        d.dev_display();
                        break;
                    case 3:
                        Tester t = new Tester();
                        t.tester_display();
                        break;
                    case 4:
                        Manager m = new Manager();
                        m.manager_display();
                        break;
                    case 5:
                        System.out.println("Thank you");
                        break;
                }
                break;

 

            case 3:
                System.out.println("Thank you");
                break;

 

            default:
                System.out.println("Invalid choice");
        }

 

        sc.close();
    }
}