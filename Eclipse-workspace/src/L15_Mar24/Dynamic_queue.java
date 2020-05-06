package L15_Mar24;

import L10_Mar4.Queue;

public class Dynamic_queue extends Queue {

	public static void main(String[] args) {
		
	}
	@Override
	public void enqueue(int item) throws Exception{
		if(this.size() == this.data.length){
			int oq[] = this.data;
			int nq[] = new int[2*this.size()];
			for (int i = 0;i<oq.length;i++){
				int id = (i + this.front) % this.data.length;
				nq[i]=oq[id];
			}
			this.data = nq;
			this.front=0;
		}
		super.enqueue(item);
	}

}
