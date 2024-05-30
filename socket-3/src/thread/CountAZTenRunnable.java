package thread;

public class CountAZTenRunnable implements Runnable {

    
    public static void main(String[] args){
        
        char c1 = 97; 
        
       
        System.out.println(c1); 
         
        
        CountTenRunnable ct = new CountTenRunnable();
        
        Thread th = new Thread(ct);
        
        th.start();
        
        try {
            for(int i = 1; i <= 10; i++) {
                for(int w = 0; w<26; w++){
                char c2 = (char)(c1 + w); 
                System.out.println("main:i=" + c2 + i);
                
                Thread.sleep(500); 
                }
                 
            }
        }
        catch(InterruptedException e) {
            
            System.err.println(e);
        }
    }
    
    public void run() {
        char c1 = 97; 
        try {
            for(int i = 0; i < 10; i++) {
                for(int w = 0; w<26; w++){
                char c2 = (char)(c1 + w); 
                System.out.println("runnable thread:i=" + c2 + i);
                
                Thread.sleep(1000); 
                }
            }
        }
        catch(InterruptedException e) {
            
            System.err.println(e);
        }
    }
}

