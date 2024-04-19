public class IfTest2 {
    public static void main(String[] args) { 
		int x=Integer.parseInt(args[3]);
		if(x>=7){
			System.out.println(x+" is Big Number");
		}else if(x>=4){
        System.out.println(x+" is Middle Number");
        }else {
            System.out.println(x+" is Small Number");
        }

}
}
