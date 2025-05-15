public class Cubes{
	public void everyCube(){
		for(int i=1;i<=10;i++){
			System.out.print(i*i*i+"\n");
		}
	}
	public static void main(String[] args){
		 Cubes obj=new Cubes();
		obj.everyCube();
	}
}