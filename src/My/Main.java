package My;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] array =new int[1000];
		for(int i=0;i<array.length;i++) {
			array[i]=i;
		}
		
		CalculatingTrades tr=new CalculatingTrades();
		tr.calcSum(array, 4);
		
		
		
		System.out.println("One trade main summa "+CalculatingTrades.oneSum(array));
		System.out.println("MultiTrade summa "+OneTrade.sumaarr);
		System.out.println("программав один поток выполн€лась " + CalculatingTrades.timeConsumedMillis + " миллисекунд");
		System.out.println("программав Multi выполн€лась " + OneTrade.time + " миллисекунд");
	
		
	}

}
