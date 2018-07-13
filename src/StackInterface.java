
public interface StackInterface<AnyType> {
	
    public void push(AnyType item); // adds item to stack
    public AnyType pop( ); // removes, but does not return, item from top of stack
    public AnyType top(); // returns item at top, does not remove
	public boolean isEmpty(); // returns true if stack contains no data, false otherwise
    public void makeEmpty(); // resets stack to be empty

}
