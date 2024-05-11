class Computer_professional {
    private String EName;
    private double DutyHour;
    private String Prospect;

    Computer_professional(String name, double hour, String prospect) {
        this.EName = name;
        this.DutyHour = hour;
        this.Prospect = prospect;
    }

    void display() {
        System.out.println("Name: " + EName + "\n" + "Duty Hour: " + DutyHour + "\n" + "Prospect: " + Prospect);
    }

}

class Developer extends Computer_professional {
    private double StudyHour;

    Developer(String name, double hour, String prospect, double Shour) {
        super(name, hour, prospect);
        this.StudyHour = Shour;
    }

    void display_data() {
        super.display();
        System.out.println("Study Hour: " + StudyHour + "\n");
    }
}

class Network_Admin extends Computer_professional {
    private double PracticeHour;

    Network_Admin(String name, double hour, String prospect, double p_hour) {
        super(name, hour, prospect);
        this.PracticeHour = p_hour;
    }

    void display_data() {
        super.display();
        System.out.println("Practice Hour: " + PracticeHour +"\n");
    }
}

class DataOperator extends Computer_professional {
    private double TypingSpeed;

    DataOperator(String name, double hour, String prospect, double t_hour) {
        super(name, hour, prospect);
        this.TypingSpeed = t_hour;
    }

    void display_data() {
        super.display();
        System.out.println("Typing Speed: " + TypingSpeed+"\n");
    }
}

class JavaProfesional extends Developer {

    private String ProficiencyLevel;

    JavaProfesional(String name, double hour, String prospect, double Shour, String level) {
        super(name, hour, prospect, Shour);
        this.ProficiencyLevel = level;
    }

    void display_data() {
        super.display_data();
        System.out.println("Proficiency level: " + ProficiencyLevel);
    }
}

class PythonProfesional extends Developer {

    private String ProficiencyLevel;

    PythonProfesional(String name, double hour, String prospect, double Shour, String level) {
        super(name, hour, prospect, Shour);
        this.ProficiencyLevel = level;
    }

    void display_data() {
        super.display_data();
        System.out.println("Proficiency level:" + ProficiencyLevel);
    }
}

class Comp {
    public static void main(String args[]) {
        Developer ob1 = new Developer("A", 10.5, "Fair", 5.0);
        ob1.display_data();
        Network_Admin ob2 = new Network_Admin("B", 12, "good", 7.5);
        ob2.display_data();
        DataOperator ob3 = new DataOperator("C", 9, "excellent", 5.5);
        ob3.display_data();
        PythonProfesional ob4 = new PythonProfesional("D", 8.3, "fair", 9.5, "Pro");
        ob4.display_data();
        JavaProfesional ob5 = new JavaProfesional("E", 8, "fair", 9.5, "Beginner");
        ob5.display_data();
    }
}