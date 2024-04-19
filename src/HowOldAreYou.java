import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou {
    public static void main(String[] args) { 

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader というのは、データ読み込みのクラス(型)
			// クラスの変数を作るには、new を使う。

			// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
			//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
		try {
			System.out.println("何歳ですか?");
			String line = reader.readLine();
			int age = Integer.parseInt(line);
			System.out.println("あなたは" + age + "歳ですね。");
			System.out.println("あなたは2030年の時、" + (age + 2030-2024) + "歳ですね。");
            if(0<=age&&age<=6) {
                System.out.println("あなたは令和"+(6-age)+"年生まれですね。");
            }else if(7<=age&&age<=35) {
                System.out.println("あなたは平成"+(35-age)+"年生まれですね。");
            }else if(36<=age&&age<=98) {
                System.out.println("あなたは昭和"+(98-age)+"年生まれですね。");
            }else if(99<=age&&age<=120){

            }
		}
		catch(IOException e) {
			System.out.println(e);
		}


	}

}
