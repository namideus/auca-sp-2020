public class Problem05 {
    public static void main(String[] args) {

    }

    public static void selectionSort(int[] list)
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
    }
}
