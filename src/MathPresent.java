import java.io.Serializable;

public class MathPresent implements Serializable {

    String message;
    String content;
    int first;
    int second;
    int sum1;
    int sum2;

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

}
