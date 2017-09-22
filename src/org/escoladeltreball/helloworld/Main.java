/**
 * 
 */
package org.escoladeltreball.helloworld;

/**
 * @author iaw39443990
 *
 */
public final class Main implements Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		 System.out.println("Hello World");
//		 int [] myarray = {1,2,3,4,5,2};
//		 int buscar = 2;
//		 Main m = new Main();
//		 System.out.println("pequeo " + m.findSmallest(myarray));
//		 System.out.println("suma " + m.sum(myarray));
//		 System.out.println("total " + m.frequency(myarray, buscar));
//		 System.out.println("result " + m.frequencyPercentage(myarray, buscar));
	}
	 /*
	  * This methods returns the smallest value from values 
	  * @see org.escoladeltreball.helloworld.Utils#findSmallest(int[])
	  */
	@Override
	public int findSmallest(int[] values) {
		// TODO Auto-generated method stub	
		int menor = values[0];
		for (int i=0; i<values.length; i++) {
			if (values[i]<menor) {
				menor = values[i];
			}
		}
		return menor;
	}
	
	public int sum(int[] values) {
		int total = 0;
		for (int i=0; i< values.length ;i++) {
			total += values[i];
		}
		return total;
	}
	
	public int frequency(int[] values, int buscar) {
		int total = 0;
		for (int i = 0; i<values.length ; i++) {
			if (buscar == values[i]) {
				total++;
			}
		}
		return total;
	}
	
	@Override
	public double frequencyPercentage(int[] values, int n) {
		return (double) frequency(values,n)/ values.length;
	}

	


}
