import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Josephus
{
   private static String WINNER = "Josephus";
   public static void main(String[] args) throws FileNotFoundException
   {
      /* run it first with J_numbers.txt  */
      ListNode p = null;
      int n = Integer.parseInt(JOptionPane.showInputDialog("How many names (2-20)?"));
      File f = new File("J_numbers.txt");
      p = readNLinesOfFile(n, f);
      int countOff = Integer.parseInt(JOptionPane.showInputDialog("How many names to count off each time?"));
      countingOff(p, countOff, n);
      
   	/* run it next with J_names.txt  */
      System.out.println("\n ****  Now start all over.  Enter the winning position in the JOptionPane.  *** \n");
      p = readNLinesOfFile(n, new File("J_names.txt"));
      int winPos = Integer.parseInt(JOptionPane.showInputDialog("Enter Josephus's preferred position."));
      replaceAt(p, WINNER, winPos);
      countingOff(p, countOff, n);
      System.out.println(WINNER + " wins!");    
   }
   /* reads the names, builds the linked list.
	  */
   public static ListNode readNLinesOfFile(int n, File f) throws FileNotFoundException
   {
      Scanner infile = new Scanner(f);
      ListNode filler = new ListNode(infile.next(), null);  
      ListNode pointer = filler; 
      for(int i = 0; i < n; i++)
      {
         ListNode temp = new ListNode(infile.next(), null); 
         filler.setNext(temp); 
         filler = filler.getNext();
      }
      filler.setNext(pointer); 
      filler = filler.getNext(); 
      
      return filler;
   }
  /* Runs a Josephus game, counting off and removing each name. Prints after each removal.
     Ends with one remaining name, who is the winner. 
	  */
   public static ListNode countingOff(ListNode p, int count, int n)
   {
     for(int i = 0; i < count-1; i++)
      {
         p = remove(p, n); 
         print(p);  
      }    
      return p; 
   }
   /* removes the node after counting off count-1 nodes.
	  */
   private static ListNode remove(ListNode p, int count)
   {
      ListNode temp = p; 
      if(count == 1)
      {
         while(temp.getNext().getValue() != p.getValue())
            temp = temp.getNext(); 
         count = 2; 
      }
      for(int i = 1; i < count-1; i++)
         temp = temp.getNext(); 

      temp.getNext().setValue(null);
      temp.setNext(temp.getNext().getNext());
      temp = temp.getNext();  
      
      return temp;
   }
   /* prints the circular linked list.
	  */
   public static void print(ListNode p)
   {
      if(p == null)
      {
         System.out.println("[]");
         return;
      }
      ListNode pointer = new ListNode(); 
      for(ListNode x = p; x != null; x = x.getNext())
      {
         System.out.print(p.getValue() + " "); 
         if(x.getValue() == p.getValue())
         {
            pointer = p; 
            break; 
         }
      }
      pointer = p.getNext(); 
      while(pointer != p)
      {
         System.out.print(pointer.getValue() + " "); 
         pointer = pointer.getNext();  
      
      }
      System.out.println();    
   }
 /* helper method to build the list.  Creates the node, then
    inserts it in the circular linked list.
	 */
   private static ListNode insert(ListNode p, Object obj)
   {
      ListNode prev = new ListNode(obj, p); 
      ListNode pointer = new ListNode();  
      for(ListNode x = p; x != null; x = x.getNext())
      {
         if(x.getNext() == p)
         {
            pointer = p; 
            break; 
         }
      }
      prev.setNext(p.getNext()); 
      pointer.setNext(prev);
      
      return prev;     
   }

	/* replaces the value (the string) at the winning node.
	   */
   private static void replaceAt(ListNode p, Object obj, int pos)
   {
      for(int i = 1; i < pos; i++)
      {
         p = p.getNext(); 
      }
      p.setValue(obj);    
   }
}

  //the College Board's standard ListNode class
class ListNode
{
   private Object value;
   private ListNode next;
   public ListNode()
   {
      value = null; 
      next = null; 
   }
   public ListNode(Object v, ListNode n)
   {
      value=v;
      next=n;
   }
   public Object getValue()
   {
      return value;
   }
   public ListNode getNext()
   {
      return next;
   }
   public void setValue(Object newv)
   {
      value=newv;
   }
   public void setNext(ListNode newn)
   {
      next=newn;
   }
}