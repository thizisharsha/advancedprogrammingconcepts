package example2;

public class oddPrinter implements  Runnable{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==1){
                System.out.println("odd Thread: "+i);
            }
        }
    }
}
