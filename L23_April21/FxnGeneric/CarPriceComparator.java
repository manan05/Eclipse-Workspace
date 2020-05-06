package L23_April21.FxnGeneric;

import java.util.Comparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Apr-2018
 */

public class CarPriceComparator implements Comparator<Car> {

	@Override
	public int compare(Car tc, Car oc) {
		return oc.price - tc.price;
	}

}
