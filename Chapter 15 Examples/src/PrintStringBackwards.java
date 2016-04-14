
public class PrintStringBackwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		printBackwards(s, s.length()-1);
	}

	public static void printBackwards(String s, int i){
		if(i >= 0){
			System.out.print(s.charAt(i));
			printBackwards(s, --i);
		}
		else
			;// base case
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void printBackwardss(String s, int i){
		if (i >= 0){
			System.out.print(s.charAt(i));
			printBackwards(s, --i);
		}
		else
			;//do nothing
	}
}
