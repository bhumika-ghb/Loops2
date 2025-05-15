public class OddNum{
	public int SumOfOddNumbers(int num){
		int sum=0;
		for(int i=1;i<=num;i=i+2){
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args){
		OddNum obj=new OddNum();
		int result=obj.SumOfOddNumbers(30);
		System.out.println(result);
	}
}
		
