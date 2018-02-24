package Selection;

import java.io.IOException;

public class SelectionSort {

	public static void main(String[] args) {

		List_s list = new Lis_s(100000, 'r'); // size, random numbers
		try {
			list.print("list_out.log");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		list.sort(); // Selection Sort
		try {
			list.print("sorted_out.log");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("DONE");
	}

}
