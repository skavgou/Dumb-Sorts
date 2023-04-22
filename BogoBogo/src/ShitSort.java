public class ShitSort {

    public static int[] ShitSort(int[] array)
    {
        boolean quit = false;
        while(!quit)
        {
            Bogosort.ArrayShuffle(array);
            if(!Bogosort.checkIfSorted(array))
            {
                quit = true;
            }
        }
        return array;
    }
}
