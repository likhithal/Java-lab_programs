package bonus;
class Employee
{
    String empName;
    int empNo:
    byte expYrs;
    String gender;
    double basicSalary;
    double bonus; double netSalary:
     void setEmployee (String Name, int no, String sex, byte ex, double basicsalary)
     {
          empName=Name; empNo=no;
          gender-sex;
          expYrs=ex;
          basicSalary-basicsalary;
      }
           void getEmployeeDetails()
          {
            if(gender=="female")
             {
                bonus-basicSalary 10/100;
                net Salary-basicSalary+bonus;
             }
             else
               netsalary=basicsalary;
               System.out.println(empName+"\t"+empNo+"\t"+gender+"\t"+exp Yrs+"\t" +basicSalary+"\t"+bonus+"\t"+net Salary+"\n");
             }
           }
class EmployeeDetails
{
      public static void main(String args[])
      {
Employee Rahul new Employee();
Rahul.setEmployee("Rashmi", 128966, "female", (byte)20,100000.0d)

System.out.println("empName\tempNo\tgender\texpYrs\tbasicSalary\tbonus\tnet Salary\n");
Rahul.getEmployeeDetails();
Employee Rakesh=new Employee(); Rakesh.setEmployee("Rakesh", 7851161, "male", (byte)25, 200000.00);
Rakesh.getEmployeeDetails();
Employee madhu=new Employee();
madhu.setEmployee("Madhu", 7851161, "female", (byte)25, 150000.0d);
sadhu.getEmployeeDetails();
     }
}
