public class SumSquare {

    public static void main(String args[])
    {
        int total = 0;
        int tot=0;
        int diff=0;
        for (int i = 1; i <= 100; i++)
        {
            total += (i*i);
            tot+=i;
            diff=(tot*tot)-total;

        }
        System.out.println("różnica = " + diff);

    }
}

