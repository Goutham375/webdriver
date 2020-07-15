package javaExamples;

public class Star_pattern {

	public static void main(String[] args) {
		int rows=5;
		 for (int i= 0; i<= rows-1 ; i++)
	        {
	            for (int j=rows-1; j>i; j--)
	            {
	                 System.out.print(" ");// fills with spaces
	            }
	            for (int k=0; k<=i; k++)
	            {
	                 System.out.print("* ");
	            }//fills the colum with stars
	            System.out.println();// enters to new line
	        }//outer for loop to create rows
	}//void main
}//class
/*OUTPUT
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
*/