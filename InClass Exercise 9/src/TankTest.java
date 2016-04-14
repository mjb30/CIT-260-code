
public class TankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank aTank = new Tank();
		
		try{
			aTank.fillTank(19);
			aTank.drainTank(10);
			aTank.fillTank(15);
		}
		catch(TankIsFullException e){
			System.out.println("Sorry, tank has reached max");
		} catch (TankIsEmptyException e) {
			System.out.println("Sorry, tank is empty");
		}
		
		
	}

}
