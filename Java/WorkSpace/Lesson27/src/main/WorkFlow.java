package main;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class WorkFlow {

	private BlockingDeque<Task> taskDeque;

	public WorkFlow() {

		this.taskDeque = new LinkedBlockingDeque<Task>(100);
	}

	public void addTask(Task task) {
		this.taskDeque.addFirst(task);

	}

	public Task getTask() {

		try {
			return this.taskDeque.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean hasNext(){
		return !this.taskDeque.isEmpty();
	}

	public void returnTask(Task task) {
		this.taskDeque.addLast(task);
	}
	
	public int getElementsCount(){
		return this.taskDeque.size();
	}

}
