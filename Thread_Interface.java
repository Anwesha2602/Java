class MyRunnable implements Runnable{
    public void run(){
        try{
            System.out.println("I am running "+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("Exception caught");
        }
    }
}
public class Thread_Interface {
     public static void main(String args[]){
        for(int i =0 ; i<10;i++){
            Thread t = new Thread(new MyRunnable() );
            t.setName("Thread"+i);
            t.start();
        }
     }
}