

	
	package training_java;


	public class copyArray {
		public static void main(String args[]) {
			int a[] = { 10,45,23,5 };

	        System.out.println("Contents of a[] ");
	        for (int i = 0; i < a.length; i++)
	            System.out.print(a[i] + " ");
	 
	        copyOf(a);
	      
		}
		public static void copyOf(int []a) {
			  int b[] = new int[a.length];
		        b = a;
		 
		        System.out.println("\n\nContents of b[] ");
		        for (int i = 0; i < b.length; i++)
		            System.out.print(b[i] + " ");
		        
		}

	}


