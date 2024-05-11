import java.util.Scanner;

public class Rational {
    private int numerator;
    private int denominator;

    Rational(int p,int q ){
        this.numerator=p;
        this.denominator=q;
    }
    Rational add(Rational num2){
        Rational num3= new Rational(0,1);
        num3.numerator= (numerator*num2.denominator)+(num2.numerator*denominator);
        num3.denominator=denominator*num2.denominator;

        return(num3);

    }
    Rational sub(Rational num2){
        Rational num3= new Rational(0,1);
        num3.numerator= (numerator*num2.denominator)-(num2.numerator*denominator);
        num3.denominator=denominator*num2.denominator;

        return(num3);

    }
    Rational div(Rational num2){
        Rational num3= new Rational(0,1);
        num3.numerator= (numerator*num2.denominator);
        num3.denominator=(num2.numerator*denominator);

        return(num3);

    }
    Rational mul(Rational num2){
        Rational num3= new Rational(0,1);
        num3.numerator= (numerator*num2.numerator);
        num3.denominator=(num2.denominator*denominator);

        return(num3);

    }

    void display(){
        System.out.println("numerator:"+numerator+" "+"denominator:"+denominator);
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter numerator and denominator of 1st number:");
        int p1= scanner.nextInt();
        int q1= scanner.nextInt();
        System.out.println("Enter numerator and denominator of 2nd number:");
        int p2= scanner.nextInt();
        int q2= scanner.nextInt();

        Rational num1= new Rational(p1,q1);
        Rational num2=new Rational(p2,q2);
        Rational res_add= num1.add(num2);
        System.out.println("Addition result:");
        res_add.display();
        Rational res_sub= num1.sub(num2);
        System.out.println("Subtraction result:");
        res_sub.display();
        Rational res_mul= num1.mul(num2);
        System.out.println("Multiplication result:");
        res_mul.display();
        Rational res_div= num1.div(num2);
        System.out.println("Division result:");
        res_div.display();

    }
}

