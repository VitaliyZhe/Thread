package My;

public class CalculatingTrades {
	static int sumTr = 0;
	static long timeConsumedMillis=0;
	public CalculatingTrades() {
		super();
	}

	public static int oneSum(int[] arr) {
		long startt = System.nanoTime();
		for (int i = 0; i < arr.length; i++) {

			sumTr += arr[i];
		}
		long finish = System.nanoTime();
		timeConsumedMillis = finish - startt;
		return sumTr;

	}

	public void calcSum(int[] arr, int quantityTrade) {
		OneTrade[] trarray = new OneTrade[quantityTrade];
		int i;
		for (i = 0; i < trarray.length; i++) {
			int chislo = arr.length / quantityTrade;
			int start = chislo * i;
			int stop = chislo * (i + 1);
			if ((arr.length - stop) < chislo) {
				stop = arr.length;
			}

			trarray[i] = new OneTrade(arr, start, stop);
		}

		int b;

		for (b = 0; b < trarray.length; b++) {
			try {

				trarray[b].getTr().join();
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}

	}

}
