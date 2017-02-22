public class DoubleNode<T> {


		private DoubleNode<T> next;
	
		private DoubleNode<T> prev;
		
		 private T element;
		
		 

		 public DoubleNode() {
			 next = null;
			 prev = null;
			 element = null;
		 }
		
		 public DoubleNode(T elem) {
			 next = null;
			 prev = null;
			 element = elem;
		 }
		 

		 public void setNext(DoubleNode<T> node) {
			 next = node;
		 }
		 
		
		 public DoubleNode<T> getNext() {
			 
			 return next;
		 }
		 
	
		 public void setPrevious(DoubleNode<T> node) {
			 prev = node;
		 }
		 
		 
		 public DoubleNode<T> getPrevious() {
			 
			 return prev;
		 }
		 
		
		 
		
		 public void setElement(T elem) {
			 element = elem;
		 }
		 
		 
		 public T getElement() {
			 return element;
		 }
		 
		 

}