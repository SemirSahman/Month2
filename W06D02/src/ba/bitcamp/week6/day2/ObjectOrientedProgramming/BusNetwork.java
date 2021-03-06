package ba.bitcamp.week6.day2.ObjectOrientedProgramming;

public class BusNetwork extends Network {

	public BusNetwork(String networkName) {
		super(networkName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addComputer(Computer c) {
		
		ArrayManipulation.extendArray(getCompArr());
		getCompArr()[getCompArr().length-1]=c;
		
		if(c instanceof Server){
			throw new UnsupportedOperationException("Cannot connect servers on this network");
		} else if (c instanceof Client) {
			Client c1 = (Client) c;
			
			c1.connect(this);
		}
		
	}

	@Override
	public void removeComputer(Computer c) {
		// TODO Auto-generated method stub
		
	}

}
