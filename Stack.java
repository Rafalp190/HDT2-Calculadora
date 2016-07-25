import java.util.Vector;

// TODO: Auto-generated Javadoc
/**
 * The Class Stack.
 *
 * @param <E> the element type
 */
public class Stack<E> implements I_Stack<E>
{
	
	/** The vector. */
	Vector<E> vector= new Vector<>();

	/* (non-Javadoc)
	 * @see ejercicio2.I_Stack#push(java.lang.Object)
	 */
	@Override
	public void push(E element) {
		// TODO Auto-generated method stub
		vector.addElement(element);
	}

	/* (non-Javadoc)
	 * @see ejercicio2.I_Stack#pop()
	 */
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return vector.lastElement();
	}

	/* (non-Javadoc)
	 * @see ejercicio2.I_Stack#IsEmpty()
	 */
	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return vector.isEmpty();
	}

	/* (non-Javadoc)
	 * @see ejercicio2.I_Stack#Size()
	 */
	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return vector.size();
	}

	/* (non-Javadoc)
	 * @see ejercicio2.I_Stack#get()
	 */
	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
