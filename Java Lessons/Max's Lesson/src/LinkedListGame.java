public class LinkedListGame {
	
	public class LinkedList 
	{
		public LLIntegerNode head;
		public LLIntegerNode tail;
		public int size;
		
		public LinkedList()
		{
			size = 0;
		}
		
		public LinkedList(int start, int size)
		{
			LLIntegerNode temp = new LLIntegerNode(start);
			
			this.head = temp;
			this.tail = temp;
			
			this.size = 1;
					
			for (int i=start; i < start+size; i++)
			{
				add(i);
			}
		}
		
		public LinkedList(int data)
		{
			this.head = this.tail = new LLIntegerNode(data);
			size = 1;
		}
		
		public void add(int data)
		{
			LLIntegerNode item = new LLIntegerNode(data);
			
			if (this.head == null)
				this.head = item;
			else if (this.tail != null)
			{
				item.setPrev(this.tail);
				tail.setLink(item);
			}
			
			this.tail = item;
			
			size++;
		}
		
		public boolean find(int n)
		{
			LLIntegerNode temp = this.head;
				
			while (temp != null)
			{
				if (temp.getInfo() == n)
					return true;
				
				temp = temp.getLink();
			}
			
			return false;
		}
		
		public void remove(LLIntegerNode item)
		{
			
			if (item.getPrev() != null)
				item.getPrev().setLink(item.getLink());
			else
				this.head =  item.getLink();
			
			if (item.getLink() != null)
				item.getLink().setPrev(item.getPrev());
			else
				this.tail = item.getPrev();
			
			size--;
		}
		
		@Override
		public String toString()
		{
			String str = "";
			
			LLIntegerNode temp = this.head;
			
			while (temp != null)
			{
				str += temp.getInfo() + ", ";
				temp = temp.getLink();
			}
			
			return str.substring(0, Math.max(0, str.length() - 2));
		}
	}

	private LinkedList elimList;
	private LinkedList guessList;
	private boolean gameOver;
	
	

	public LinkedListGame() {
		gameOver = false;
		elimList = new LinkedList(1001, 9000);
		guessList = new LinkedList();
	}
	
	
	public void reset() {
		gameOver = false;
		elimList = new LinkedList(1001, 9000);
		guessList = new LinkedList();
	}
	

	public boolean isPriorGuess(int n) {
		return guessList.find(n);
	}
	

	public int numGuesses() {
		return guessList.size;
	}
	

	public static int numMatches(int a, int b) { // DO NOT remove the static qualifier
		int matchCount = 0;
		int pow = 1;
		
		for (int i = 0; i < 4; i++)
		{
			matchCount += (a / pow % 10 == b / pow % 10) ? 1 : 0;
			pow *= 10;
		}
		
		return matchCount;
	}
	

	public boolean isOver() {
		return gameOver;
	}
	

	public int getGuess() {
		if (guessList.size == 0)
			guessList.add(1000);
		
		else if (elimList.size > 1)
			guessList.add(elimList.head.getInfo());
		
		return guessList.tail.getInfo();
	}
	

	public boolean updateGuess(int nmatches) {
		
		if (nmatches == 4)
		{
			// Win
			gameOver = true;
			return true; 

		}
		else
		{			
			int guess = guessList.tail.getInfo();
			LLIntegerNode temp = elimList.head;
			
			while (temp != elimList.tail)
			{
				int info = temp.getInfo();
				if (numMatches(info, guess) != nmatches)
					elimList.remove(temp);
				
				temp = temp.getLink();
			}
		}
		
		if (elimList.size <= 1)
		{
			gameOver = true;
			return false;
		}
		
		return true;
		
	}
	

	public LLIntegerNode priorGuesses() {
		if (guessList.size > 0)
			return guessList.head;
		else
			return null;
	}
	

	public String priorGuessesString() {
		return guessList.toString();
	}
	
}