public class Problem10 {

    public static void main(String[] args) {
        int N = 50, i = 2, c, cnt, t;
        System.out.println("The first "+N+" prime numbers are");

        for(cnt=1, t=0; cnt<=N; i++)
        {
            for(c=2; c<i; c++)
                if (i % c == 0)
                    break;

            if(c==i) // Ex: 2==2, 3==3, not 10==2, 10 not prime
            {
                System.out.print(c+" ");
                cnt++;
                t++;
            }

            if(t==10) {
                System.out.println(); // New line
                t=0;
            }
        }
    }
}
