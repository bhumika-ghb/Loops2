public class Numbers{
	public void divisbleNumbers(){
		for(int i=1;i<50;i++){
			if(i%4==0 || i%6==0){
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args){
		Numbers obj=new Numbers();
		obj.divisbleNumbers();
	}
}