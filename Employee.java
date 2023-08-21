import java.io.Serializable;
public class Employee
{

        private int id;
        private String name;
        private String Designation;
        private String Role;
        private double sal;


    public int getId() {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDesignation()
    {
        return Designation;
    }
    public void setDesignation(String Designation)
    {
        this.Designation = Designation;
    }
    public String getRole()
    {
        return Role;
    }
    public void setRole(String Role)
    {
        this.Role = Role;
    }
    public double getSal()
    {
        return sal;
    }
    public void setSal(double sal)
    {
        this.sal = sal;
    }

    @Override
    public String toString()
    {

        return "[\t"+id+",\t"+name+",\t"+Designation+",\t"+Role+",\t"+sal+"]";
    }

    public Employee(int id, String name, String Designation, String Role, double sal)
    {
        super();
        this.id = id;
        this.name = name;
        this.Designation = Designation;
        this.Role = Role;
        this.sal = sal;
    }
}
