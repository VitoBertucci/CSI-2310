package MainAssignments.Project2;

public class packetSelector {
	
	//set packets to null
	static StackWork packets = null;
	
	public static void main(String[] args) {
		
		System.out.println("Packet selector is now running...\n");
		
		packets = new StackWork(10, 10, 10);
		
		packets.Push(95, 0);
		packets.Push(103, 0);
		packets.Push(81, 0);
		packets.Push(120, 0);
		packets.Push(74, 0);
		packets.Push(134, 0);
		packets.Push(62, 0);
		packets.Push(101, 0);
		packets.Push(59, 0);
		packets.Push(148, 0);
		
		packets.displayStackData();
		
		reorganizeNetworkTraffic();
		
		packets.displayStackData();
		
	}
	
	
	// Precondition: The StackWork object packets is different than null.
	// Postcondition: The elements of the stack S0 that are equal to, or less than 100, are inserted in the stack S1.
	// The elements of the stack S0 that are greater than 100 are inserted in the stack S2.

	//make sure the packets are not null
	//iterate through S0 by using S0top
	//if the value at the top of S0 is >= 100, use the pop method to remove it from S0 and put it in S1
	//put in S2 if value is < 100
	//at the end you should display no values in S0, values >= 100 in S1, and values < 100 in S2

	public static void reorganizeNetworkTraffic() {
		if (packets != null) {
			int i;
			while (packets.getS0top() >= 0) {
				i = packets.Pop(0);
				if (i <= 100) {
					packets.Push(i, 1);
				} 
				if (i > 100) {
					packets.Push(i, 2);
				}
			}
		}
		
	} 
}       

