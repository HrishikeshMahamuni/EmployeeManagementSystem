import java.util.HashSet;
import java.util.Scanner;

public class EmplyeeService
{
    HashSet<Employee> empset = new HashSet<Employee>();

    Employee emp1 = new Employee(101,"Shawn","IT","Backend Developer",25000.00);
    Employee emp2 = new Employee(102,"John","IT","Frontend Developer",22000.00);
    Employee emp3 = new Employee(103,"Smith","IT","Support Engineer",18000.00);
    Employee emp4 = new Employee(104,"Ryan","IT","System Engineer",27000.00);
    Employee emp5 = new Employee(105,"Ken","IT","UI/UX Developer ",30000.00);

    Scanner sc = new Scanner(System.in);

    int id;
    boolean found=false;
    String name;
    String Designation;
    String role;
    double sal;

    public EmplyeeService()
    {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
        empset.add(emp5);

    }
    public void viewAll()
    {
        for(Employee emp : empset)
        {
            System.out.println(emp);
        }
    }
    public void view()
    {
        System.out.print("Enter Id :: ");
        id = sc.nextInt();
        for(Employee emp : empset)
        {
            if(emp.getId() == id)
            {
                System.out.print(emp);
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("Employee Id Not Found");
        }
    }
    public void updateEmp()
    {

        System.out.print("Enter Id  :: ");
        id=sc.nextInt();
        for(Employee emp : empset)
        {
            if(emp.getId() == id)
            {
                System.out.println("Update Values of ");
                System.out.println("1. Name ");
                System.out.println("2. Designation  ");
                System.out.println("3. Role ");
                System.out.println("4. Salary ");
                System.out.println("5. Update All Name / Designation / Role / Salary ");
                System.out.print("\n Enter your Choice :: ");
                int ch = sc.nextInt();
                switch(ch)
                {
                    case 1:
                        System.out.print("\n Name Updation");
                        System.out.print("\n Enter New Name : ");
                        String Nname = sc.next();
                        emp.setName(Nname);
                        System.out.println("Name Updated SuccessFully :: ");
                        System.out.println(emp);
                        found = true;

                    break;
                    case 2:

                        System.out.print("\n Designation Updation");
                        System.out.print("\n Enter New Designation : ");
                        String NDesg = sc.next();
                        emp.setDesignation(NDesg);
                        System.out.println(" Designation Updated SuccessFully :: ");
                        System.out.println(emp);
                        found = true;
                    break;

                    case 3:
                        System.out.print("\n Role Updation");
                        System.out.print("\n Enter Role Name : ");
                        String Nrole = sc.next();
                        emp.setRole(Nrole);
                        System.out.println("Role Updated SuccessFully :: ");
                        System.out.println(emp);
                        found = true;
                    break;

                    case 4:
                        System.out.print("\n Salary Updation");
                        System.out.print("\n Enter New Salaray : ");
                        double Nsal = sc.nextDouble();
                        emp.setSal(Nsal);
                        System.out.println(" Salary Updated SuccessFully :: ");
                        System.out.println(emp);
                        found = true;
                    break;

                    case 5:
                        System.out.print("\n Enter New Name :");
                        name = sc.next();
                        System.out.print("\n Enter New Designation :");
                        Designation = sc.next();
                        System.out.print("\n Enter New Role :");
                        role = sc.next();
                        System.out.print("\n Enter New Salary :");
                        sal = sc.nextDouble();
                        emp.setName(name);
                        emp.setDesignation(Designation);
                        emp.setRole(role);
                        emp.setSal(sal);
                        System.out.println(emp);
                    break;
                    default:
                        System.out.println("Wrong Choice ");
                        break;
                }


            }
        }
        if(!found)
        {
            System.out.println("Data Updated Successfully  ");
        }
        else
        {
            System.out.println("Wrong Id Entered / No Data Found ");
        }

    }
    void deleteEmp()
    {
        System.out.print("\n Enter Id To Be Delete ::");
        id=sc.nextInt();
        Employee empdelete = null;
        for(Employee emp : empset)
        {
            if(emp.getId() == id)
            {
                empdelete = emp;
                found= true;
            }
        }
        if(!found)
        {
            System.out.println("Employee Not Present ");
        }
        else
        {
            empset.remove(empdelete);
            System.out.println("Employee Data Deleted Sucessfully");
            viewAll();
        }
    }

    void addEmp()
    {
        System.out.println("Add New Employee Data");
        System.out.print("Enter ID ::");
        id = sc.nextInt();
        for(Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.print("This Id Already Exist");
                System.exit(1);
            }
            else
                break;
        }
        System.out.print("Enter Name :: ");
        name = sc.next();
        System.out.print("Enter Designation :: ");
        Designation = sc.next();
        System.out.print("Enter Role :: ");
        role = sc.next();
        System.out.print("Enter salary :: ");
        sal = sc.nextDouble();

        Employee emp = new Employee(id, name, Designation, role, sal);
        empset.add(emp);
        viewAll();
    }

}
