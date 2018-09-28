package My;

public class OneTrade implements Runnable {
	private int[] arr;
	public static int sumaarr = 0;
	public static int time = 0;
	private int start;
	private int stop;
	private Thread tr;

	
	
	public OneTrade(int[] arr, int start, int stop) {
		super();
		this.arr = arr;
		this.start = start;
		this.stop = stop;
		tr = new Thread(this);
		tr.start();
	}

	public int getSumaarr() {
		return sumaarr;
	}

	public Thread getTr() {
		return tr;
	}

	public void run() {
		long startt = System.nanoTime();
		for(int i=start; i<stop; i++){			 
			sumaarr+=arr[i];
			}
		long finish = System.nanoTime();
		long timeConsumedMillis = finish - startt;
		time+=timeConsumedMillis;
	
		
	}

}
