package example2;

public class evenPrinter implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println("even Thread: "+i);
            }
        }
    }
}
