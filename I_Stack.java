
// TODO: Auto-generated Javadoc
/**
 * The Interface I_Stack.
 *
 * @param <E> the element type
 */
public interface I_Stack <E>
{
	
	/**
	 * Push.
	 *
	 * @param element the element
	 */
	public void push(E element);
	
	/**
	 * Pop.
	 *
	 * @return the e
	 */
	public E pop();
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if successful
	 */
	public boolean IsEmpty();
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int Size();
	
	/**
	 * Gets the.
	 *
	 * @return the e
	 */
	public E get();

}
