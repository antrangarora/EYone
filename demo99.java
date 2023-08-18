class A
{
int a=100;
int b=200;
void display()
{
System.out.println("Hi"+(a+b));

}


}


class B extends A
{
int c=300;
int d=400;
void abc()
{
System.out.println("Hi"+(a+b));
System.out.println("Hi"+(c+d));


}





}


class demo99
{
public static void main(String []args)
{
B b=new B();
b.abc();
}

}