public class IfTest3 {
    public static void main(String[] args) { 
		int x=Integer.parseInt(args[0]);
		
        if(x<=9&&x>6){
		System.out.println(x+" is Big Number");
        }else if(x<=6&&x>3) {
        System.out.println(x+" is middle Number");
        }else if(x<=3&&x>0) {
        System.out.println(x+" is Small Number");
        }else{
            System.out.println("out of scope");
        }
	}//main end
}
