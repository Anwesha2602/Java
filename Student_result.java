import java.util.Scanner;

class Student {
    private String Name;
    private String Roll_No;  

    void get_data(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Student name: ");
        Name=sc.nextLine();
        System.out.println("Roll Number: ");
        Roll_No=sc.nextLine();
    }
    void put_data(){
        System.out.println("Student name: "+Name);
        System.out.println("Roll no: "+Roll_No);
    }
}
class Test_marks extends Student{
    private float Marks1;
    private float Marks2;

    void get_data(){
        super.get_data();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st marks: ");
        Marks1=sc.nextFloat();
        System.out.println("Enter 2nd marks: ");
        Marks2=sc.nextFloat();
    }
     void put_data(){
        super.put_data();
        System.out.println("Marks1: "+Marks1);
        System.out.println("Marks2: "+Marks2);
    }
}

interface CCA_Score{
   final int CCA_credit=9;
   public void show_cca_cred();

}
class Sem_result extends Test_marks implements CCA_Score  {
    void get_data(){
        super.get_data();
    }
   public  void show_cca_cred(){
               System.out.println("Student Credit: "+CCA_credit);
    }
    void put_data(){
        super.put_data();
        show_cca_cred();
    }

}
class Student_result{
    public static void main(String args[]){
        Sem_result student1= new Sem_result();
        System.out.println("Enter information of 1st student:");
        student1.get_data();
        System.out.println("1st Student data:");
        student1.put_data();

        Sem_result student2= new Sem_result();
        System.out.println("Enter information of 2nd student:");
        student2.get_data();
        System.out.println("2nd Student data:");
        student2.put_data();
    }
}
