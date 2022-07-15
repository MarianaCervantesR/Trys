class MultiThread extends Thread
{
    @Override
    public void run() {
        try {
            System.out.println("Thread number: " + Thread.currentThread().getId());
        }catch (Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
}
public class MultipleThread
{
    public static void main(String[] args) {
        int n = 0;

        while (n<10 )
        {
            MultiThread T0 = new MultiThread();
            T0.start();
            n++;
        }
    }
}
