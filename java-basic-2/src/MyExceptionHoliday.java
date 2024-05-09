import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyExceptionHoliday {
    public static void main(String[] args) {

		NoHolidayException myE=new NoHolidayException();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
            while(true) {
			System.out.println("日付を入力してください。");
			String line = reader.readLine();
            int theday = Integer.parseInt(line);
            System.out.println("日付" + theday + "日です。休日ですね。");

            test(theday);
            }
		}catch (IOException e){
            System.out.println(e);
        } 
        catch (NoHolidayException e) {
			e.printStackTrace();
		}
    


	}

	static void test(int theday) throws NoHolidayException{
		if(theday%7 != 4 || theday%7 != 5){
			throw new NoHolidayException();
		}
	}

}
