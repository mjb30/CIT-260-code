
public class SumFirstSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(7));
	}
	
	public static int sum(int n){
		if(n==0)
			return 0;
		else
			return n*2+sum(n-1);
	}

}
