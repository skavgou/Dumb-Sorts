public class AttemptedSort {

    public static int[] attemptedSort(int[] array)
    {
        for(int i = 0; i <= 20; i++)
        {
            Bogosort.ArrayShuffle(array);
            if(Bogosort.checkIfSorted(array))
            {
                return array;
            }
        }
        return array;
    }
}
