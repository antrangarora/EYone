class car
{
final int speed=200;
int model=2020;
void gear()
{
System.out.println("5 gears");
}
}
class BMW extends car{
void gear(){

System.out.println("5 gears");

}


}

class demo88
{
public static void main(String args[])
{
car c=new car();
System.out.println(c.speed);
BMW b=new BMW();
b.gear();



}

}

