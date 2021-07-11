package p3;

import java.util.Comparator;

import p3.Electronics;
public class SortBasedonPrice implements Comparator<Electronics> {
	public int compare(Electronics a1, Electronics a2) {
		return a1.getPrice()-(a2.getPrice());
	}

	
}
