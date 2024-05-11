import java.util.Scanner;

public class Employee {
    private String employee_id;
    private String employee_name;
    private String address;
    private String contact_number;

    Employee(String id, String name, String addr , String number)
    {
        this.employee_id=id;
        this.employee_name=name;
        this.address=addr;
        this.contact_number=number;
    }
    void display(){
        System.out.println("Employee id:"+employee_id);
        System.out.println("Employee name:"+employee_name);
        System.out.println("Employee address:"+address);
        System.out.println("Employee contact number:"+contact_number);
    } 
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter employee id:");
        String id= scanner.nextLine();
        System.out.println("Enter employee name:");
        String name= scanner.nextLine();
        System.out.println("Enter employee address:");
        String addr= scanner.nextLine();
        System.out.println("Enter employee phone number:");
        String number= scanner.nextLine();

        Employee obj=new Employee(id, name, addr, number);
        obj.display();
        
    }
}
