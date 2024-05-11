
class Account {
    private String Acc_No;
    private String C_name;
    private String Contact_No;

    Account(String Acc, String Name, String Contact) {
        Acc_No = Acc;
        C_name = Name;
        Contact_No = Contact;
    }

    void show() {
        System.out.println("Account No:- " + Acc_No + "\n" + "Name:- " + C_name + "\n" + "Contact No:- " + Contact_No);
    }

}
//Savings Account
    class Savings_Ac extends Account {
        private double ROI;
        private double Acc_Balance;

        Savings_Ac(String AccNo, String Name, String Contact_No, double ROI, double balance){
            super(AccNo, Name, Contact_No);
            this.ROI = ROI;
            this.Acc_Balance = balance;
        }

        void showdata(){
            super.show();
            System.out.println("Rate of Interest:- " + ROI + "\n" + "Account Balance:- " + Acc_Balance);
        }

        void compute(){
            Acc_Balance = Acc_Balance + (ROI/100)*Acc_Balance;
        }
    }

//Current Account
class Current_Ac extends Account {
    private double Acc_Balance;
    private double Min_Balance;

    Current_Ac(String AccNo, String Name, String Contact_No, double Acc_Balance, double Min_Balance){
        super(AccNo, Name, Contact_No);
        this.Acc_Balance = Acc_Balance;
        this.Min_Balance = Min_Balance;
    }
    void show(){
        super.show();
        System.out.println("Account Balance:- " + Acc_Balance + "\n" + "Minimum Balance:- " + Min_Balance);
    }

    void compute()
    {
        if (Acc_Balance >= Min_Balance)
            System.out.println("Balance is ");
        else {
            double deficit=Min_Balance - Acc_Balance;
            System.out.println("Deficit Amount: " + deficit);
        }
    }
}



//TD Account
class TD_Ac extends Account {
    private double Principal;
    private double Term;
    private double ROI;
    private double Maturity_Balance;

    TD_Ac(String AccNo, String Name, String Contact_No, double Principal, double Term, double ROI, double Maturity_Balance){
        super(AccNo, Name, Contact_No);
        this.Principal = Principal;
        this.Term = Term;
        this.ROI = ROI;
        this.Maturity_Balance = Maturity_Balance;
    }
    void show(){
        super.show();
        System.out.print("Principal:- "+Principal+"\n"+"Term:- "+Term+"\n"+"ROI:- "+ROI+"\n"+"Maturiy Balance:- "+Maturity_Balance);
    }
    void compute(){
        Maturity_Balance = Principal * Math.pow(1+ROI/(100*Term),Term*1);
    }
}


    public class account_operation {
        public static void main(String[] args) {
            Savings_Ac ob1 = new Savings_Ac("123456789", "Anwesha", "9330303674",5,200000);
            Current_Ac ob2 = new Current_Ac("187654321","Meghana","9906578987", 15000, 20000);
            TD_Ac ob3 = new TD_Ac("123456339","Rupsa","8981075614",100000,2,7.5,0);

            ob1.compute();
            ob1.showdata();
            System.out.println();

            ob2.compute();
            ob2.show();
            System.out.println();

            ob3.compute();
            ob3.show();
        }
    }
