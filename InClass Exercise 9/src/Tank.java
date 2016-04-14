
public class Tank {
	private int level;
	
	public void fillTank(int units) throws TankIsFullException
	{
		//you will need the following: throw new TankIsFullException();
		if(level + units >= 20){
			level = 20;
			throw new TankIsFullException();
		}
		else
			level += units;
	}
	
	public void drainTank(int units) throws TankIsEmptyException
	{
		if(level - units <= 0){
			level = 0;
			throw new TankIsEmptyException();
		}
		else
			level -= units;
	}
}
