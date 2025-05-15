public class EvenNum{
	public void CountOfEvenNumbers(){
		int count=0;
		for(int i=1;i<=50;i++){
			if(i%2==0){
				count++;
			}
			
		}
		System.out.println(count);
	}
	public static void main(String[] args){
		EvenNum obj=new EvenNum();
		obj.CountOfEvenNumbers();
	}
}
	