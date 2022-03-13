package bubbleSort;

import java.util.*;

/*
*BubbleSort Sort list
*Desc -> Reads in Integer and prints them in sorted order using bubble sort.
*Logic -> Use Bubble Sort to sort the integer in the Integer array
*/

public class BubbleSort {
	
	static List<Integer> integerList = new ArrayList<>();
    static Random random = new Random();

    public static void main(String[] args) {
        scanArrayList();
        System.out.println("-------Before Sort-------");
        printArrayList();
        bubbleSortArrayList();
        System.out.println("--------After Sort--------");
        printArrayList();
    }
    
    /*
     * BubbleSort sort
     * @param: No parameters
     * @function : sorts the given list in ascending order and stores them in their
     * indecencies
     * @return: No return value.
     */
    private static void bubbleSortArrayList() {
        for (int i = 1; i < integerList.size(); i++) {
            int size = integerList.size();

            // loop to access each array element
            for (int j = 0; j < size - 1; j++)

                // loop to compare array elements
                for (int k = 0; k < size - j - 1; k++)

                    // compare two adjacent elements
                    // change > to < to sort in descending order
                    if (integerList.get(k).compareTo(integerList.get(k+1)) > 0) {

                        // swapping occurs if elements
                        // are not in the intended order
                        Integer temp = integerList.get(k);
                        integerList.set(k,integerList.get(k+1));
                        integerList.set(k+1,temp);
                    }
        }
    }
    
    /*
     * print array list
     * @param: No parameters
     * @function : prints the array list pre defined to string
     * @return: No return value.
     */
    private static void printArrayList() {
        System.out.println(integerList);
    }

    /*
     * Ability to scan array list
     * @param: No parameters
     * @function : scan the array list from random numbers
     * @return: No return value.
     */
    private static void scanArrayList() {
        for (int i=0;i<10;i++){
            integerList.add(random.nextInt(999)+1);
        }
    }
	
	

}
