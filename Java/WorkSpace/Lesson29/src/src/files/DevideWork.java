package src.files;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

public class DevideWork {
	private static ArrayList<Thread> thredList = new ArrayList<>();

	public static void devideAndStart(String str, int threadsCount, char ch) {
		ExecutorService executor = Executors.newFixedThreadPool(threadsCount);
		int len = str.length();
		int partLen = len / threadsCount;
		for (int i = 0; i < threadsCount; i++) {
			int beginIndex = i * partLen;
			int endIndex = i * partLen + partLen;

			thredList.add(new Counter(str.substring(beginIndex, endIndex), ch));
			// Runnable worker = new Counter(str.substring(beginIndex,
			// endIndex), ',');
			// executor.execute(worker);
		}
		for (Thread thread : thredList) {
			executor.execute(thread);
			System.err.println(thread.getName());
		}

		executor.shutdown();

		while (!executor.isTerminated()) {

		}
		int count = 0;

		for (Thread thread : thredList) {

			count += ((Counter) thread).getCount();

		}
		System.out.println("Finished all threads");
		System.out.println("Count of " + String.valueOf(ch) + " is " + count);

	}
}
