
public class hourglass {
	/*
|”””””””””| 9 : +
 \::::::::/	8 : + 1_
  \::::::/	6 : + 2_
   \::::/	4 :	+ 3_
    \::/	2 : + 4_
     ||
    /::\	2 : + 4_
   /::::\	4 : + 3_
  /::::::\  6 : + 2_
 /::::::::\ 8 : + 1_
|”””””””””| 9 "

sorry bad variable names
	 */
	public static void main(String[] args) {
		//top half
		System.out.print("|");
		for(int i = 1; i <= 9; i++) {
			System.out.print("\"");
		}
		System.out.print("|");
		System.out.println("");
		int k = 8;
		for(int a = 1; a <= 4; a++) {
			System.out.print(" \\");
			for(int g = 1; g <= k; g++) {
				System.out.print(":");
			}
			System.out.print("/");
			System.out.println("");
			for(int space = 1; space <= a; space++) {
				System.out.print(" ");
			}
			k -= 2;
		}
		System.out.println(" ||");
		//bottom half
		int o = 2;
		for(int q = 4; q >= 1; q--) { 
			for(int p = 1; p <= q; p++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for(int h = 1; h <= o; h++) {
				System.out.print(":");
			}
			System.out.print("\\");
			System.out.println("");
			o += 2;
		}
		System.out.print("|");
		for(int i = 1; i <= 9; i++) {
			System.out.print("\"");
		}
		System.out.print("|");
		System.out.println("");
	}
}
 