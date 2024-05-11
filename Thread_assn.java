class MultithreadEg extends Thread{
    public void run(){
        try{
            System.out.println("I am running "+Thread.currentThread().getId());
            sleep(1000);
        }
        catch(Exception e){
            System.out.println("Exception caught");
        }
    }

}

public class Thread_assn {
    public static void main(String args[]){
        int n=20;
        for(int i=0;i<n;i++){
            MultithreadEg ob = new MultithreadEg();
            ob.start();
        }
    }

}