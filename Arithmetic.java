class Arithmetic {
    int a;
    float b;
    char c;
    double d;

    Arithmetic(int i, float f, char ch, double dou) {
        a = i;
        b = f;
        c = ch;
        d = dou;
    }

    void add(int i, double f) {
        a = a + i;
        d = d + f;
    }

    void add(int i, float f, double num) {
        a = a + i;
        b = b + f;
        d = d + num;
    }

    void add(float f, int i, double num) {
        b = b + f;
        a = a + i;
        d = d + num;
    }

    Arithmetic add(Arithmetic ar) {
        Arithmetic arith = new Arithmetic(0, 0, ' ', 0);
        arith.a = ar.a + a;
        arith.b = ar.b + b;
        arith.d = ar.d + d;
        return arith;
    }

    void display() {
        System.out.println(a + "  " + b + "  " + c + "  " + d);
    }

    public static void main(String[] args) {
        Arithmetic ob = new Arithmetic(14, 10.5f, 'A', 15.58);
        ob.display();
        ob.add(20, 15.25);
        ob.display();
        ob.add(20, 15.2f, 25.50);
        ob.display();
        ob.add(14.2f, 20, 15.2);
        ob.display();
        Arithmetic ob1 = new Arithmetic(10, 12.2f, 'a', 99.25);
        Arithmetic ob2 = ob.add(ob1);
        ob2.display();
    }
}
