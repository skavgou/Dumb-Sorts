import java.util.Random;
public class Bogosort {

    public static void ArrayShuffle(int[] array)
    {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
        {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
    }

    public static boolean checkIfSorted(int[] array)
    {
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] <= array[i-1])
            {
                return false;
            }
        }
        return true;
    }

    public static void print1DArray(int[] array){
        for (int index = 0; index < array.length; index++){
            System.out.print(array[index] + ", ");

        }
        System.out.println();
    }

    public static int[] Bogosort(int [] array) {
        boolean sorted = checkIfSorted(array);
        while(!sorted)
        {
            ArrayShuffle(array);
            sorted = checkIfSorted(array);
        }
        print1DArray(array);
        return array;
    }
}
