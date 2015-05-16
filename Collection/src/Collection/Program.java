package Collection;

public class Program {

	// main program
	
	public static void main(String[] args) {

		Integer first = 4;
		Integer second = 7;
		Integer thirld = 8;
		Integer fourth = 2;
		
		ArrayStack theArrayStack = new ArrayStack();
		theArrayStack.push(first);
		theArrayStack.push(second);
		theArrayStack.push(thirld);
		theArrayStack.search(second);
		
		Bag theBag = new Bag();
		theBag.add(thirld);
		theBag.add(first);
		theBag.add(fourth);
		theBag.bagSize();
		theBag.contains(fourth);
		
		LinkedQueue theLinkQueue = new LinkedQueue();
		theLinkQueue.add(fourth);
		theLinkQueue.add(second);
		theLinkQueue.clear();
		
	}

}
