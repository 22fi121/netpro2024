public class IfTest0 {
    public static void main(String[] args) { 

		boolean b1=true;
		boolean b2=false;
		if(true){
			System.out.println("trueは実行される");
		}
		if(false){
			System.out.println("false");
		}
		
		if(b1){
			System.out.println("(0)b1 is "+b1);
		}
		
		
		if(b2){
			System.out.println("(1)b2 is "+b2);
		}else{
			System.out.println("(2)b2 is "+b2);
		}
		
		
		if(b1&&b2){
			System.out.println("(3)b1&&b2 is true");
		}else{
			System.out.println("(4)b1&&b2 is false");
		}
		
		
		if(b1&&b1){
			System.out.println("(5)b1&&b1 is true");
		}else{
			System.out.println("(6)b1&&b1 is false");
		}
		
		
		if(b2&&b2){
			System.out.println("(7)b2&&b2 is true");
		}else{
			System.out.println("(8)b2&&b2 is false");
		}
		
		
		if(b1||b2){
			System.out.println("(9)b1||b1 is true");
		}else{
			System.out.println("(10)b1||b1 is false");
		}
		
		
		if(b2||b2){
			System.out.println("(11)b2||b2 is true");
		}else{
			System.out.println("(12)b2||b2 is false");
		}
		

	}

}
