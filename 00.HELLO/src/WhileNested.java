
public class WhileNested {

	public static void main(String[] args) {

		/*
		 * ★★★★★
		 */

		System.out.println("★★★★★\n");
		System.out.print("★");
		System.out.print("★");
		System.out.print("★");
		System.out.print("★");
		System.out.print("★");
		System.out.print("\n");

		System.out.println("1. ----------");

		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				//System.out.print("★");
				System.out.printf("%s[%d,%d]","★",i,j);
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("2. ---------");
		/*
		  ☆★★★★
		  ★☆★★★
		  ★★☆★★
		  ★★★☆★
		  ★★★★☆
		 */
		
		i=0;
		while(i<5) {
			
			int j=0;
			while(j<5) {
				if(i==j) {
					System.out.print("☆");
					
				}else {
					System.out.print("★");
					
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}
		System.out.println("3. ---------");
		/*
		 ★☆☆☆☆
		 ☆★☆☆☆
		 ☆☆★☆☆
		 ☆☆☆★☆
		 ☆☆☆☆★
		 */
		
		i=0;
		while(i<5) {
			
			int j=0;
			while(j<5) {
				if(i==j) {
					System.out.print("★");
					
				}else {
					System.out.print("☆");
					
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}
		System.out.println("4. ---------");
		/*
		  ★★★★★
		  ☆★★★★
		  ☆☆★★★
		  ☆☆☆★★
		  ☆☆☆☆★
		 */
		
		i=0;
		while(i<5) {
			int j=0;
			while(j<5) {
				if(j>=i) {
					System.out.println("☆");
				}else {
					System.out.println("★");
				}
				i++;
			}
		}
		
		
		
			
		}
		
		
		
		
		
		
		
		
		
	}

