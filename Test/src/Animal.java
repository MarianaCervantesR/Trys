class Animal
{
    void eat ()
    {
        System.out.println("eating...");
    }
}
class Doggie extends Animal
{
    void bark()
    {
        System.out.println("woof..");
    }
}
class BabyDoggie extends Doggie
{
    void weep()
    {
        System.out.println("weeping...");
    }
}
/*
class Cat extends Animal
{
    void meow()
    {
        System.out.println("meow...");
    }
}

 */
class TestInheritance
{
    public static void main(String[] args)
    {
        BabyDoggie d = new BabyDoggie();
        d.bark();
        d.eat();
        d.weep();
        /*
        Cat c = new Cat();
        c.eat();
        c.meow();

         */

    }
}