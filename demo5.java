class demo5{
public static void main(String []args)
{
int num=111;
int temp=num;
int rev=0;
while(num!=0)
{
int rem=num%10;
rev=rev*10+rem;
num=num/10;
}
if(temp==rev)

System.out.println("PALLINDROME");
else
System.out.println(" NOT PALLINDROME");
}


}