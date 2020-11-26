public class Problem07 {

    public static void main(String[] args) {
       int sum = 0;
       int number = 0;

       while(number<20)
       {
           sum+=++number;

           if(sum>=100)
               break;
       }

       System.out.printf("The number is %d\nThe sum is %d\n\n",number,sum);

       number = 0;
       sum = 0;
       while(number<20)
       {
            ++number;

            if(number==10 || number==11)
                continue;

            sum+=number;
       }

        System.out.printf("The sum is %d\n",sum);
    }
}
