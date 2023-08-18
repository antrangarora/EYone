class A
{
void print_evennumber()
{
for(int i=1;i<=50;i++)
{
if(i%2==0)
System.out.println(i);
}



}

}

class B
{
int print_reverse(int num)
{
int rev=0;
while(num!=0)
{
int rem=num%10;
rev=rev*10+rem;
num=num/10;


}
return rev;


}

}


class demo2
{
public static void main(String args[])
{
A a=new A();
a.print_evennumber();
B b=new B();
System.out.println(b.print_reverse(123));

}



}