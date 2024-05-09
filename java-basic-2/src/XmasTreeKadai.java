public class XmasTreeKadai {
    public static final int Leef = 19;
    public final int weight = 3;
    public final int lenght = 7;
    public static void main(String[] args) {
        int X=Integer.parseInt(args[0]);
        int Y=Integer.parseInt(args[1]);
        int N=10;
        int weight = 3;
     int lenght = 7;
        for (int j = 0; j < N; j++) {

            for (int i = 0; i <= N-j; i++) {
                System.out.print("+");
            }

            for (int i = 0; i <= j*2; i++) {
                System.out.print("*");
            }

            for (int i = 0; i <= N-j; i++) {
                System.out.print("+");
            }
            System.out.print("\n");
        }
        for(int w =0; w<=lenght; w++ ){
            for(int e = 0; e<N; e++) {
                System.out.print(" ");
            }
            for(int e = 0; e<weight; e++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        }
       
    


    }


