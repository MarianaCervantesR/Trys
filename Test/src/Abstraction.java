abstract class Dog
{
    public void bark()
    {
        System.out.println("bark!");
    }
    public abstract void smile();
}
class Chihuahua extends Dog {
    @Override
    public void smile() {
        System.out.println("The dog smile");
    }
}
public class Abstraction
{
    public static void main(String[] args) {
        Chihuahua c = new Chihuahua();
        c.bark();
        c.smile();

    }
}
