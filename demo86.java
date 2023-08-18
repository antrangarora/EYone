import java.util.*;
import java.io.*;
class demo86{
public static void main(String args[]) throws FileNotFoundException
{
m1();

}

static void m1() throws FileNotFoundException
{
m2();
System.out.println("HI M1");

}

static void m2() throws FileNotFoundException
{
m3();
System.out.println("HI M2");

}


static void m3() throws FileNotFoundException
{
File f=new File("abc.txt");
FileReader fr=new FileReader(f);
//System.out.println("HI M1");

}
}