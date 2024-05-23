import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MathTCPServer {


    public static void main(String arg[]) {
        boolean open = true;
        try {
            /* 通信の準備をする */
            Scanner scanner = new Scanner(System.in);
            System.out.print("ポートを入力してください(5000など) → ");
            int port = scanner.nextInt();
            scanner.close();
            System.out.println("localhostの" + port + "番ポートで待機します");
            ServerSocket server = new ServerSocket(port); // ポート番号を指定し、クライアントとの接続の準備を行う

            Socket socket = server.accept(); // クライアントからの接続要求を待ち、
            // 要求があればソケットを取得し接続を行う
            System.out.println("接続しました。相手の入力を待っています......");
            while(open == true){

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            MathPresent present = (MathPresent) ois.readObject();// Integerクラスでキャスト。


            String msgPresent = present.getMessage();
            int number = present.getExecNumber();
            if(msgPresent.equals("exit")){
                System.out.println("終了のメッセージが届きました。");
            }else if(number <= 1 ){
                System.out.println("この数字は使えません。");
            }
            else{
                System.out.println("調べる数字は、" + number + "です。");
            }

            if(msgPresent.equals("exit")){
                present.setMessage("今回はありがとうございました！");
            }else{
                present.setMessage("サーバーです。計算が完了いたしました。\n");
                present.exec();
                System.out.println("結果は"+present.getResult());
            }
            
            ObjectOutputStream oos =
				new ObjectOutputStream(socket.getOutputStream());

                oos.writeObject(present);
                oos.flush();
            
            
            if(msgPresent.equals("exit") || number <= 1){
            open = false;
            // close処理
            ois.close();
            // socketの終了。
            socket.close();
            server.close();
            }
            }

        } // エラーが発生したらエラーメッセージを表示してプログラムを終了する
        catch (BindException be) {
            be.printStackTrace();
            System.out.println("ポート番号が不正、ポートが使用中です");
            System.err.println("別のポート番号を指定してください(6000など)");
        } catch (Exception e) {
            System.err.println("エラーが発生したのでプログラムを終了します");
            throw new RuntimeException(e);
        }
    }
}

