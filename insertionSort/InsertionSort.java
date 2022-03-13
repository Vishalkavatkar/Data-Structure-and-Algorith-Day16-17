package insertionSort;

import java.util.Scanner;

public class InsertionSort {
	
	static Scanner scanner = new Scanner(System.in);
    //insertion sort method
    static public void insertionSort(String[] array){
        for (int i = 1; i <array.length; i++) {
            String  key = array[i];
            int j = i - 1;
            // Compare key with each element on the left of it until an element smaller than it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && (key.compareTo(array[j])<0)) {
                array[j + 1] = array[j];
                --j;
            }
            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }

    }
    
    /*
    *print String array
    *It takes String array as input
    *print the given string array
    @return: No return value.
   */
  static public void printString(String[] strings){
      for(int i=0;i< strings.length;i++){
          System.out.println("string at index "+i+" is "+strings[i]);
      }
  }
  
  /*
  *scan String array
  *Takes String array as input
  *scans the data from user and stores in to string array
  @return: No return value.
 */
  static public void scanString(String[] strings){
	  for(int i=0;i<strings.length;i++){
		  System.out.printf("Enter the string at index :%d\n",i);
		  strings[i]= scanner.nextLine();
	  }
  }
  
  public static void main(String[] args) {
      String[] strings = new String[5];
      scanString(strings);
      System.out.println(" -------Before Sort :------- ");
      printString(strings);
      insertionSort(strings);
      System.out.println("-------After Sort :--------");
      printString(strings);

  }
}