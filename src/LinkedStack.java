
/**
 * LinkedStack can contain any type of data, but all data must be of the same type.
 * 
 * Data is stored in a singly-linked list with top (head) pointer that references the 
 * top of the list.
 * 
 * @ R McCauley built shell
 */
public class LinkedStack<AnyType> implements StackInterface<AnyType> {
    
    /******** a nested class  **********************
     * The node type for a linked list Stack
     */
    private static class Node<AnyType> {
        
        public Node(AnyType x) {
            data = x; next = null;           
        }
        
        public AnyType data;
        public LinkedStack.Node<AnyType> next;
    }
    /**********************************************************/
    
    // The LinkedStack contains a reference to the top of the stack.
    
    private LinkedStack.Node<AnyType> top; // front marker

    /**
     * Constructor allocates initializes front reference
     */
    public LinkedStack () {
         
        top = null;  // When list is empty, top is null
    }
    
    /**
     * For display purposes, traverse the stack and build string of contents
     *  -- this is for verification purposes - is stack working
     *     properly?
     * @return a String representation of the list
     */
    public String toString(){
        LinkedStack.Node<AnyType> walker = top;
        String returnString = "";
        if (isEmpty())
        	returnString += "nothing";
        else
        	returnString += "top --> ";
        		
        while (walker != null){
            returnString += walker.data + "\n        ";
            walker = walker.next;
        }  
        return returnString + "\n-----";
    }

    /**
     * isEmpty determines if collection has no elements
     * @return true if collection empty, false otherwise
     */
    public boolean isEmpty(){
        return top == null; 
    }
    
    /**
     * makeEmpty resets the collection to be empty
     */ 
    public void makeEmpty(){
        top = null;
    }
    
    public void push(AnyType x) {
    	
    	Node n = new Node(x);
    	n.next = top;
    	top = n;
    	
    }
    
    public AnyType pop() {
    	AnyType temp = top.data; 
    	top = top.next;
    	return temp;
    }
    
    public AnyType top() { 
    	return top.data; 
    }
       
     
    public static void main(String[] args){
   
        LinkedStack<Integer> o = new LinkedStack<>();
        System.out.println("The stack contains: \n" + o);
        o.push(25);
        System.out.println("The stack contains: \n" + o);
        o.push(13);
        System.out.println("The stack contains: \n" + o);  
        o.push(100);
        System.out.println("The stack contains: \n" + o); 
        o.push(13);
        System.out.println("The stack contains: \n" + o);  
        System.out.println("The top element is " + o.top());
        System.out.println("The stack contains: \n" + o); 
        System.out.println("The stack used to contain " + o.pop());
        System.out.println("The stack contains: \n" + o); 
        
     } 
}// end class Linked