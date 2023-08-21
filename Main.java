import java.util.Scanner;

public class Main
{
    private static boolean ordering;

    public static void Menu()
    {
        System.out.println("Welcome To Employee Management System ");
        System.out.println("1.  Add Employee :: ");
        System.out.println("2.  Update Employee :: ");
        System.out.println("3.  Delete Employee :: ");
        System.out.println("4.  View  Employee :: ");
        System.out.println("5.  ViewAll Employee :: ");
        System.out.println("6.  Exit From Application :: ");
    }
    public static void main(String[] args) {




        while(true)
        {
            EmplyeeService service = new EmplyeeService();
            Menu();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Choice : ");
            int Choice = sc.nextInt();

            switch(Choice)
            {

                case 1:
                    System.out.println("Add Employee ");
                    service.addEmp();
                    break;
                case 2:
                    System.out.println("Update Employe Name / Designation / Role / Salary");
                    service.updateEmp();
                    break;
                case 3:
                    System.out.println("Delete Employee Data");
                    service.deleteEmp();
                    break;
                case 4:
                    System.out.println("View Employee By ID ");
                    service.view();
                    break;
                case 5:
                    System.out.println("Veiw All Employee ");
                    service.viewAll();
                    break;
                case 6:
                    System.out.println("Exit Application");
                    System.exit(0);
                    break;
            }
        }
    }
}