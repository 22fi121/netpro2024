public class Kuku {
    public static void main(String args[]) {
        //ここに実装
        for(int i = 1; i<10; i++){
            for(int w = 1; w<10; w++){
                int sum = i*w;
                if(sum/10 == 0){
                    if(w == 9){
                        System.out.println("| "+ sum);
                    }else{
                        System.out.print("| "+ sum);
                    }
                }else{
                    
                    if(w == 9){
                        System.out.println("|"+ sum);
                    }else{
                        System.out.print("|"+sum);
                    }
                }
            }
        }
       }
     }

