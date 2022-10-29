package MainAssignments.Project2;

public class packetSelectorMap {
    static StackWorkMap packets = null;
	
	public static void main(String[] args) {
		
		System.out.println("Packet selector is now running...\n");
		
		packets = new StackWorkMap(10, 10, 10);
		
		packets.Push(95, 0);
		packets.Push(103, 0);
		packets.Push(81, 0);
		packets.Push(70, 0);
		packets.Push(74, 0);
		packets.Push(134, 0);
		packets.Push(62, 0);
		packets.Push(19, 0);
		packets.Push(59, 0);
		packets.Push(1, 0);
		
		packets.displayStackData();
		
		reorganizeNetworkTraffic();
		
		packets.displayStackData();
		
	}
	
	
	// Precondition: The StackWork object packets is different than null.
	// Postcondition: The elements of the stack S0 that are equal to, or less than 100, are inserted in the stack S1.
	// The elements of the stack S0 that are greater than 100 are inserted in the stack S2.
	public static void reorganizeNetworkTraffic() {
		packets.stacks.get(0).stream().filter(i -> (i<100)).forEach(packets.stacks.get(1)::add);
		packets.stacks.get(0).stream().filter(i -> (i>=100)).forEach(packets.stacks.get(2)::add);
		packets.stacks.get(0).clear();
	} 
    
}
