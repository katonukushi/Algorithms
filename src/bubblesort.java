import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] array = {1,2,8,3,4,5,6};
        System.out.println(Arrays.toString(sort(array)));
        System.out.println(Arrays.toString(sort(1,2,3,10,12,5,6)));
    }
    static int[] sort(int...array) {

        boolean swapped = false;
        for (int i = 0; i < array.length-1; i++) {
            int currentElement = array[i];
            int nextElement = array[i + 1];
            if (currentElement > nextElement) {
                array[i] = nextElement;
                array[i + 1] = currentElement;
                swapped = true;
            }
            if (swapped) {
                i = 0;
                swapped = false;
            }
        }
        return array;
    }
}
