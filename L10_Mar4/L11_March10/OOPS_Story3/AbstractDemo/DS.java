package L10_Mar4.L11_March10.OOPS_Story3.AbstractDemo;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Mar-2018
 */

public abstract class DS {

	int size = 0;

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public abstract void display() ;
}
