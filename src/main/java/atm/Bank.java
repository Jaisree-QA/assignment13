package atm;


public class Bank {

	private int validPin[]= {1110,1212,1391};
	

	 	public boolean pin(int enterpin)
	 	{
	 	for(int pnum : validPin) {
	 		if(pnum==enterpin) {
	 			return true;
	 		}
	 }
	 	return false;
}
}
