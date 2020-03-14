package queue;

/**
 * @author Anuj Pachauri
 *
 *         4:17:52 pm
 */
public class ArrayQueue<T> {

	Object[] ArrayQueue;
	int rear;
	int front;
	int size;

	public ArrayQueue(int size) {
		this.size = size;
		this.ArrayQueue = new Object[this.size];
		this.front = -1;
		this.rear = -1;
	}

	public boolean isFull() {
		return rear == this.size - 1;
	}

	public boolean isEmpty() {

		return front == -1 || front > rear;
	}

	public void Queue(Object T) {

		if (isFull()) {
			System.out.println("Queue is Full..");
			return;
		}
		rear = rear + 1;
		ArrayQueue[rear] = T;
		if (front == -1) {
			front = front + 1;
		}

	}

	public Object Dequeue() {

		if (isEmpty()) {
			System.out.println("Queue is Empty..");
			return null;
		}

		Object t = ArrayQueue[front];
		front = front + 1;
		return t;

	}

	public static void main(String[] args) {

		ArrayQueue<Integer> aq = new ArrayQueue<>(5);

		aq.Queue(3);

		aq.Queue(5);

		aq.Queue(7);

		aq.Queue(8);

		aq.Queue(10);
		aq.Queue(7);

		System.out.println(aq.Dequeue());
		System.out.println(aq.Dequeue());
	}
}
