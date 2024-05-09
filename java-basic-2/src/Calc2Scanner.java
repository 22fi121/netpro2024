import java.util.Scanner;

public class Calc2Scanner {

    public static void main(String[] args) {
        int i=0;
        int sum = 0;
        while(i<10) {
            Scanner scan = new Scanner(System.in);

            String str = scan.next();
            System.out.println("最初のトークンは: " + str);
            sum += Integer.parseInt(str);
            str = scan.next();
            System.out.println("次のトークンは: " + str);
            sum += Integer.parseInt(str);
            System.out.println("トークンの合計は:" + sum);
            i++;
            sum = 0;
        }
    }

}
