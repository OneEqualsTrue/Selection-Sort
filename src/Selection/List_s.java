package Selection;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class List_s {
	
	int[] lis;
	int n;
	boolean random = false; // Assume elements not random
	BufferedWriter writer;

	/*
	 * Constructor
	 */
	public List_s(int len, char type) {
		this.n = len;
		this.lis = new int[len];
		if(type == 'r') fillRandom();
	}
	
	/*
	 * Fill array with random values from 1-99
	 * Only works if 'r' was invoked from instantiation
	 */
	private void fillRandom() {
		Random rand = new Random();
		
		for(int i=0; i < n; i++)
			lis[i] = rand.nextInt(99)+1;
	}

	/*
	 * Print entire list to inputted file in a readable format
	 */
	public void print(String file) throws IOException {
		writer = new BufferedWriter(new FileWriter(file));
		
		writer.write("[ ");
		
		for(int i : this.lis) {
			writer.write(i+" ");
		}
		
		writer.write("]");
		writer.close();
	}
	
	/*
	 * Selection Sort
	 */
	public void sort() {
		int smallest;
		int temp;
		int indexOfMinimum = 0;
		
		for(int i=0; i < n; i++) {
			smallest = Integer.MAX_VALUE;
			
			for(int j=i; j < n; j++) {
				if(this.lis[j] < smallest) {
					smallest = this.lis[j];
					indexOfMinimum = j;
				}
			}
			
			// SWAP
			temp = this.lis[i];
			this.lis[i] = smallest;
			this.lis[indexOfMinimum] = temp;
		}
		
	}

}
