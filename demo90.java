class Emp
{
private int id,age,salary;
private String name,desig;
void setId(int id)
{
this.id=id;


}
int getId()
{
return id;
}
void setAge(int age)
{
this.age=age;


}
int getAge()
{
return age;
}
void setSalary(int salary)
{
this.salary=salary;


}
int getSalary()
{
return salary;
}

void setdesig(String desig)
{
this.desig=desig;


}
String getDesig()
{
return desig;

}
void setName(String name)
{
this.name=name;


}
String getName()
{
return name;

}
}

class demo90
{
    public static void main(String args[])
    {
        Emp e = new Emp();
        e.setId(100);
        System.out.println(e.getId());
e.setName("ARORA");
e.setAge(23);
e.setSalary(5000);
System.out.println(e.getName());
System.out.println(e.getAge());
System.out.println(e.getSalary());



    }
}