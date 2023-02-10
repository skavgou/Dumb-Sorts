public class BogoBogoSort {

    public static int[] BogoBogoSort(int[] array)
    {
        int currentVal = 2;
        boolean sorted = Bogosort.checkIfSorted(array);
        while(!sorted)
        {
            int[] newArray = new int[currentVal];
            System.arraycopy(array,0,newArray,0,currentVal);
            Bogosort.ArrayShuffle(newArray);
            //Bogosort.print1DArray(newArray);
            if(Bogosort.checkIfSorted(newArray) && currentVal == array.length)
            {
                array = newArray;
                sorted = true;
            }
            currentVal += 1;
            if(!Bogosort.checkIfSorted(newArray))
            {
                currentVal = 2;
            }
            System.arraycopy(newArray,0,array,0,newArray.length);

        }
        return array;
    }
}
