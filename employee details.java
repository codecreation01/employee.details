class employee
{
  private string name,address;
  private int year,salary;
  public employee(String n,int y, int sal, String add)
  {
    name=n;
    year=y;
    salary= sal;
    address= add;
  }
  public String getName()
  {
    return name;
  }
  public int getyear()
  {
    return year;
  }
  public int getSalary()
  {
    return Salary;
  }
  public String getAddress()
  {
    return address
    }
}
}
class emp
{
  public static void main(String[] args)
  {
    Employee e1=new Employee("Robert",1994,500000,"64c-Wallastreet");
    Employee e2=new Employee("sam",2000,7400000,"68d-wallsstreet");
    System.ut.println("name\tyear of joining\tsalary\taddress");
    System.out.println(e1.getname()+"\t"+e1.getyear()+"\t\t\t"+e1.getSalary()+"\t"+e1.getAddress());
    System.out.println(e2.getname()+"\t\t"+e2.getYear()+"\t\t\t"+e2.getsalary()+"\t"+e2.getAddress());
    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t"+e3.getAddress());
  }
}

