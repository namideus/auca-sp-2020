public class Problem05 {
    public static void main(String[] args) {
        int[] unsortedArray = {9,5,6,2,5,9,1,5,6,3,8};
        int[] sorted = selectionSort(unsortedArray);
        for (int i : sorted) System.out.println(i);
    }

    public static int[] selectionSort(int[] list)
    {
        for(int i=0; i<list.length-1;i++)
        {
            int min = list[i], index = i;

            for(int j=i+1; j<list.length; j++)
            {
                if(min>list[j])
                {
                    min = list[j];
                    index = j;
                }
            }

            if(min!=i)
            {
                list[index] = list[i];
                list[i] = min;
            }
        }

        return list;
    }
}
