package heap;

import java.util.Iterator;

/**
 * @author Anuj Pachauri
 *
 *         6:34:59 pm
 */
public class ArrayQueue<T> implements QueueInterface<T>, Iterable<T> {

	private static final int DEFAULT_SIZE = 10;
	private int cap;
	private int cur;
	private int front;
	private int back;
	private T[] A;

	public static void main(String args[]) {

		ArrayQueue<String> q = new ArrayQueue<>();
		String people[] = { "TOM", "JAY", "PAT", "CAT", "MARK", "KAT" };

		for (int i = 0; i < people.length; i++)
			q.enqueue(people[i]);

		for (int i = 0; i < 2; i++)
			q.dequeue();

		Iterator itr = q.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}

		System.out.println("========================");

		q.enqueue("Mike");
		q.enqueue("Bev");

		q.dequeue();

		itr = q.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		System.out.println();

	}

	ArrayQueue() {
		cap = DEFAULT_SIZE;
		A = (T[]) new Object[DEFAULT_SIZE];
		front = 0;
		back = -1;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see heap.QueueInterface#isEmpty()
	 */
	@Override
	public boolean isEmpty() {

		return cur == 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see heap.QueueInterface#dequeue()
	 */
	@Override
	public T dequeue() throws QueueException {

		T e = front();
		A[front % cap] = null;
		front++;
		cur--;
		return e;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see heap.QueueInterface#front()
	 */
	@Override
	public T front() throws QueueException {
		if (isEmpty())
			throw new QueueException("Queue is Empty");
		else
			return A[front % cap];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see heap.QueueInterface#enqueue(java.lang.Object)
	 */
	@Override
	public void enqueue(T t) {
		if (isFull())
			doDoubelSize();
		back++;
		A[back % cap] = t;
		cur++;

	}

	/**
	 * 
	 */
	private void doDoubelSize() {

		T[] newArray = (T[]) new Object[2 * cap];

		// copy items
		for (int i = front; i <= back; i++) {

			newArray[i - front] = A[i % cap];

		}

		A = newArray;
		front = 0;
		back = cur - 1;
		cap *= 2;

	}

	/**
	 * @return
	 */
	private boolean isFull() {

		return cur == cap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see heap.QueueInterface#clear()
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterator<T> iterator() {
		return new QueueIterator();
	}

	private class QueueIterator implements Iterator<T> {

		private int index; // index traversal

		public QueueIterator() {
			index = front;
		}

		@Override
		public boolean hasNext() {
			return index <= back;
		}

		@Override
		public T next() {
			return A[(index++) % cap];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

}

interface QueueInterface<T> {

	public boolean isEmpty();

	public T dequeue() throws QueueException;

	public T front() throws QueueException;

	public void enqueue(T t);

	public void clear();

}

class QueueException extends RuntimeException {

	QueueException(String msg) {
		super(msg);
	}

	QueueException() {
		super();
	}

}