
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int smallestI = startIndex;
        for (int i=startIndex;i<array.length;i++) {
            if(array[smallestI]>array[i]) { smallestI = i;
            }
        }
        return smallestI;
    }
    public static int indexOfSmallest(int[] array){
        return indexOfSmallestFrom(array,0);
    }
    
    public static int smallest(int[] array){
        return array[indexOfSmallest(array)];
    }
    
    public static void swap(int[] array,int indx1, int indx2){
        int val = 0;
        val = array[indx1];
        array[indx1] = array[indx2];
        array[indx2] = val;
    }
    
    public static void sort(int[] array){
            for (int i = 0; i < array.length;) {
                System.out.println(Arrays.toString(array));
                int indx = indexOfSmallestFrom(array,i);
                if(indx!=i) swap(array,indx,i);
                i++;
        }
    }

}
