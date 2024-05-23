import java.io.Serializable;

public class TaskObject implements Serializable, ITask {

    String message;
    String content;
    int first;
    int second;
    int sum1;
    int sum2;
    int x;
    int result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getFirst(){
        return first;
    }

    public void setFirst(int first){
        this.first = first;
    }

    public int getSecond(){
        return second;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public int getSum1(){
        return sum1;
    }

    public void setSum1(int sum1){
        this.sum1 = sum1;
    }

    public int getSum2(){
        return sum2;
    }

    public void setSum2(int sum2){
        this.sum2 = sum2;
    }

    public void setExecNumber(int x) {
        this.x = x;
    }

    public int getExecNumber(){
        return x;
    }

    public boolean isPrime(int w){
        if (w <= 1) {
            return false;
        }
        if (w <= 3) {
            return true;
        }
        
        // 2と3の倍数以外の奇数を確認
        if (w % 2 == 0 || w % 3 == 0) {
            return false;
        }
        
        // 6k ± 1の形の数のみを確認
        for (int i = 5; i * i <= w; i += 6) {
            if (w % i == 0 || w % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public void exec() {
        int number = 0;
        for(int i = 1; i<x; i++){
            if(isPrime(i)){
                number = i;
            }
        }
        this.result = number;
    }

    public int getResult(){
        return result;
    }

}
