package domain;

public class NumberService {

	private int ComputerNum;
	
	public int ComputerNumber() {
		ComputerNum = (int) (Math.random()*6 + 1);
		
		return ComputerNum;
	}
}
