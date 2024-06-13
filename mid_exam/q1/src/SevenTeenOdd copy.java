public class SevenTeenOdd {
    public static void main(String[] args) {
        for (int i = 1; i <= 800; i++) {
         if(i%17 == 0){
            if(i%2 == 1){
                System.out.print(i+ ",");
            }
         }
        }
    }

}
