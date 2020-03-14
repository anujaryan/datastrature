package queue;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         4:40:23 pm
 */
public class ArrayDqueue<T> {

	Object[] ArrayDqueue;
	int size;
	int front;
	int rear;

	public ArrayDqueue(int size) {
		this.size = size;
		this.ArrayDqueue = new Object[this.size];
		this.front = -1;
		this.rear = -1;
	}

	public boolean isEmpty() {

		return (front == -1 || front > rear);
	}

	public boolean isFull() {

		return (rear == this.size - 1);
	}

	public int getSize() {
		return this.ArrayDqueue.length;

	}

	public void queue(Object t) {
		ensureCapacity(rear + 2);
		if (isFull()) {
			System.out.println("Queue is Full");
			return;
		}

		rear = rear + 1;
		ArrayDqueue[rear] = t;
		if (front == -1) {
			front = 0;
		}

	}

	/**
	 * @param i
	 */
	private void ensureCapacity(int minCapacity) {
		int oldcapacity = getSize();
		if (minCapacity > oldcapacity) {
			int newcapacity = minCapacity * 2;

			if (newcapacity < minCapacity)
				newcapacity = minCapacity;
			this.ArrayDqueue = Arrays.copyOf(this.ArrayDqueue, newcapacity);
		}

	}

	public Object dQueue() {

		if (isEmpty()) {

			System.out.println("Queue is Empty..");
			return null;
		}
		Object t = this.ArrayDqueue[front];
		front = front + 1;
		return t;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayDqueue<Integer> adq = new ArrayDqueue<>(2);

		adq.queue(5);
		adq.queue(7);
		adq.queue(10);
		System.out.println(adq.dQueue());
	}

}
