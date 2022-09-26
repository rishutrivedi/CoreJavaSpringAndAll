package dayseven.methodreference;

import java.util.Comparator;

public class AmountComparator implements Comparator<order> {

	@Override
	public int compare(order o1, order o2) {
		if(o1.getAmount()==o2.getAmount()) {
			return 0;
		}
		else if(o1.getAmount()==o2.getAmount()) {
			return 1;
		}else {
			return -1;
		}
	}

}
