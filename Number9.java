public class Number9{
	public void divisbleNumbers(){
		for(int i=1;i<100;i++){
			if(i%9==0){
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args){
		Number9 obj=new Number9();
		obj.divisbleNumbers();
	}
}