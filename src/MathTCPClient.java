import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.BindException;
import java.net.Socket; //ネットワーク関連のパッケージを利用する
import java.util.Scanner;

public class MathTCPClient {

    public static void main(String arg[]) {
        boolean open = true;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("ポートを入力してください(5000など) → ");
            int port = scanner.nextInt();
            System.out.println("localhostの" + port + "番ポートに接続を要求します");
            Socket socket = new Socket("localhost", port);
            System.out.println("接続されました");
            while(open == true){
            System.out.println("計算します。");

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            System.out.println("メッセージを入力してください(終了する場合はexitと入力) ↓");
            String message = scanner.next();
            int number = 1;
            if(message.equals("exit")){
            }else{
            System.out.println("調べたい数字を入力してください。");
             number = scanner.nextInt();
            }
            
            
            
            MathPresent present = new MathPresent();
            present.setMessage(message);
            present.setExecNumber(number);


            oos.writeObject(present);
            oos.flush();

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            MathPresent okaeshiPresent = (MathPresent) ois.readObject();

            
            String replayMsg = okaeshiPresent.getMessage();
            System.out.println(replayMsg);
            if(message.equals("exit")){
            scanner.close();
            ois.close();
            oos.close();
            System.out.println("ありがとうございました！");
            open =false;
            socket.close();
            }else if(number <= 1){
                scanner.close();
                ois.close();
                oos.close();
                System.out.println("その数字は使えません。");
                open =false;
                socket.close();
            }else{
            int replaysum1 = okaeshiPresent.getResult();
            System.out.println("結果は"+ replaysum1 + "です。");
            if(replaysum1 == 0){
                System.out.println("この数字は素数のようです。");
            }
            }
            
            }

        } // エラーが発生したらエラーメッセージを表示してプログラムを終了する
        catch (BindException be) {
            be.printStackTrace();
            System.err.println("ポート番号が不正か、サーバが起動していません");
            System.err.println("サーバが起動しているか確認してください");
            System.err.println("別のポート番号を指定してください(6000など)");
        } catch (Exception e) {
            System.err.println("エラーが発生したのでプログラムを終了します");
            throw new RuntimeException(e);
        }
    }
}
