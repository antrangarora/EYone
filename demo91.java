abstract class bank{
abstract void roi();
abstract void atm();

}


class sbi extends bank{
void roi(){

System.out.println("SBI @ 10%");
}

void atm(){}
}
class axis extends bank{
void roi(){

System.out.println("AXIS @ 10%");
}

void atm(){


}
}


class demo91{
public static void main(String args[])
{

sbi s=new sbi();
s.roi();
axis a =new axis();
a.roi();

}

}