public class fivemultliplicationthread extends Thread {
    public void multiplifive()
    {
        int n=5,m=10;
        for (int i=1;i<=m;i++)
        {
            System.out.println(i+"*"+ n+"="+ i*n);
        }
    }

}
