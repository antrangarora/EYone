class bank
{
public void loan()
{
System.out.println("8%");


}


}


class sbi extends bank
{
public void loan()
{
System.out.println("10%");


}

}
class axis extends bank
{
public void loan()
{
System.out.println("12%");


}

}




class ICI extends bank{}


class demo93{
public static void main(String args[])
{

axis a=new axis();
a.loan();
sbi s=new sbi();
s.loan();
 ICI i=new ICI();
i.loan();
}

}