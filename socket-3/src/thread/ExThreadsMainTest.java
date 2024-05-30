package thread;
import java.util.Random;

public class ExThreadsMainTest extends Thread{
    int[] score = new int[100];
    Random random = new Random();
    public void run(){
        for(int i=0; i<score.length; i++){
            score[i] = random.nextInt(101);
            System.out.println(score[i]);
            if(score[i] >= 80){
                System.out.println("Clear!");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args){
    ExThreadsMainTest test = new ExThreadsMainTest(); 
     test.start();
     
}

}
