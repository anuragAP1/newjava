public class Pattern3
{
    public static void main(String[] args)
    {
        int n=6;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
//                if (n%2==0)
//                {
//                    if (i==(n)/2||j==0||j==n-1)
//                    {
//                        System.out.print("* ");
//                    }
//                    else
//                    {
//                        System.out.print("  ");
//                    }
//                }
//                else
                {
                    if (i == (n - 1) / 2 || j == 0 || j == n - 1)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }
}
