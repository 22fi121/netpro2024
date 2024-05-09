import java.util.Random;

public class HeikinCKadai {
    public static final int N=100;
	Kamoku[] kamoku = new Kamoku[N];
	static String kamokuname="数学";

	public static void main(String[] args) {
		HeikinCKadai heikinc= new HeikinCKadai(kamokuname);
		heikinc.initalizeScores();
		heikinc.printAverage();
		heikinc.gokakusha();

	}
    HeikinCKadai(String s){
		this.kamokuname=s;
		
	}
    void initalizeScores(){
		Random r = new Random();

		for(int i=0;i<N;i++){
			int score = r.nextInt(N+1);
			kamoku[i]= new Kamoku(score);

		}
    }

    void printAverage(){
		int sum=0;
		for(int i=0;i<N;i++){
			sum+=kamoku[i].getScore();

		}
		System.out.println("平均点は"+sum/N);

	}

    void gokakusha(){
        int sum = 0;
        System.out.println("以下合格者の点数です。");
        for(int i=0;i<N;i++){
        if(kamoku[i].getScore() >= 80) {
            sum++;
            System.out.println("番号"+i);
            System.out.println(kamoku[i].getScore());
        }
    }
    System.out.println("合格者数は、"+sum+"です。");
	}


}
