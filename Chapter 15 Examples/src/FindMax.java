
public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {2, 64, 3, 15, 7, 81};
		System.out.println(maxValue(list, 0, list.length-1));
		// 0 = max value, list.length-1 = current item looking at
	}
	
	public static int maxValue(int[] list, int max, int i){
		
		if (i == -1)
			return max;
		else
			return maxValue(list, Math.max(max, list[i]), --i);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int maxValues(int[] list, int max, int i){
		if(i>= 0)
			return maxValue(list, Math.max(max, list[i]), --i);
		else
			return max;
	}
}
