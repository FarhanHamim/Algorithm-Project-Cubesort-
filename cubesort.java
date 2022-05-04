import java.lang.reflect.Array;
import java.util.*;
//method to sort the cubes of the array elemrnt
public class cubesort{

    static void sortArray(int arr[], int n){
        Integer[] ar = new Integer[n];

        for(int i=0; i<n; i++){
            ar[i] = arr[i];
        }

        //actual method that will compare/sort
        Arrays.sort(ar, new Comparator<Integer>()
            {
                public int compare(Integer a, Integer b){
                    int x = (int)Math.pow(a,3);
                    int y = (int)Math.pow(b,3);
                    return (x<y) ? -1 : 1;
                }
            }
        );

        //print the array
        for(int i=0; i<n; i++) {
            System.out.println(ar[i]+ " ");
        }
    }
    //caller code
    public static void  main(String[] args){
        //the initial array is
        int arr[]={4,-2,0,5,-9,3};
        int n= arr.length;

        //call the sortArray method
        sortArray(arr,n);
    }
}