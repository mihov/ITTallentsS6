package main;

import java.util.Comparator;

import people.Waiter;

public class WaiterComparator implements Comparator<Waiter> {

	@Override
	public int compare(Waiter w1, Waiter w2) {
		if (w1.getMoney().equals(w2.getMoney())) {
			return w1.getName().compareToIgnoreCase(w2.getName());
		}
		return (int) ((w1.getMoney() - w2.getMoney()) * 100);
	}
}
