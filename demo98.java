class Parent
{
int site=5;
String car="BMW";
int amount=50000;
void Pdisplay()
{
System.out.println(site);
System.out.println(car);
System.out.println(amount);

}


}


class child extends Parent
{
void Cdisplay()
{
int amount=200000;
System.out.println(site);
System.out.println(car);
System.out.println(amount);
System.out.println(super.amount);

}


}


class demo98
{
public static void main(String []args)
{
Parent p=new Parent();
p.Pdisplay();


child c=new child();
c.Cdisplay();

}



}
