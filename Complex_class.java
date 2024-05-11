class Complex {
    private int a;
    private int b;
    
    Complex(int r , int i){
        this.a = r;
        this.b = i;
    }

    Complex add( Complex ob2){
        Complex ob_add = new Complex(0, 0);
        ob_add.a = a + ob2.a;
        ob_add.b = b + ob2.b;
        return ob_add;
    }

    Complex sub( Complex ob2){
        Complex ob_sub = new Complex(0, 0);
        ob_sub.a = a - ob2.a;
        ob_sub.b = b - ob2.b;
        return ob_sub;
    }

    void display(){
        System.out.println( "(" + a +" , "+ b + "i" + ")");
    }

}

class Complex_class{
    public static void main(String args[]){
        Complex o1 = new Complex(2, 3);
        Complex o2 = new Complex(4, 2);
        Complex add_ob = o1.add(o2);
        add_ob.display();
        Complex sub_ob = o1.sub(o2);
        sub_ob.display();

    }
}
