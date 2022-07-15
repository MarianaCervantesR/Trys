public class Main
{
    public static void main(String[] args) {
        Threads thread2 = new Threads();
        thread2.start();
        System.out.println(thread2.isAlive());
        System.out.println(thread2.getName());
    }
}