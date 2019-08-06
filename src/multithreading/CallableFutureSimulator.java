/**
28-Jul-2019
Dell

 * 
 */
package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Dell
 *
 *         10:10:18 am
 */
public class CallableFutureSimulator {

	public static void main(String[] args) {
		System.out.println(1 << 26);
		List<Future<String>> list = new ArrayList<>();

		ExecutorService threadservice = Executors.newFixedThreadPool(100);
		for (int i = 0; i < 1000; i++) {

			Future<String> taskResult = threadservice.submit(new CallFutureWorker(i));
			list.add(taskResult);
		}

		list.stream().forEach(task -> {
			try {
				System.out.println(task.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		threadservice.shutdown();
	}

}

class CallFutureWorker implements Callable<String> {

	int id;

	CallFutureWorker(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Id :" + id;
	}

}
