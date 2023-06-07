import java.util.Arrays;

    //отличный код

public class Task2
{public static void main(String[] args) {
        int[] array = new int[] {3,2,4,3,3,1,5,3,3};
        int val = 3;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != val) {
                array[counter] = array[i];
                array[i] = val;
                counter += 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }    
}

