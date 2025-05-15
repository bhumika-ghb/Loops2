public class Reverse{
	public int reversemultiplication(int num){
		for(int i=10;i>=1;i--){
			System.out.println(num+"x"+i+"="+(num*i));
		}
		return num;
	}
	public static void main(String[] args){
		Reverse obj=new Reverse();
		int result=obj.reversemultiplication(6);
		System.out.println("Reverse Multiplication:"+result);
	}
}