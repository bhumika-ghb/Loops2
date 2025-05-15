public class Multiple{
	public void MultipleNumbers(int num){
		for(int i=1;i<=10;i++){
			System.out.print(num*i +"\n");
		}
	}
	public static void main(String[] args){
		Multiple obj=new Multiple();
		obj.MultipleNumbers(7);
	}
}