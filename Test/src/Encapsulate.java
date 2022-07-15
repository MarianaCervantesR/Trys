public class Encapsulate
{
    private String Name;
    private int Height;
    private int Weight;

    public int getHeight()
    {
        return Height;
    }

    public String getName()
    {
        return Name;
    }

    public int getWeight()
    {
        return Weight;
    }

    public void setName(String newName)
    {
        Name = newName;
    }

    public void setWeight(int newWeight)
    {
        Weight = newWeight;
    }

    public void setHeight(int newHeight)
    {
        Height = newHeight;
    }

}

	class TestEncaptulation
    {

        public static void main(String[] args)
        {
            Encapsulate obj = new Encapsulate();

            obj.setName("Mariana");
            obj.setWeight(50);
            obj.setHeight(160);

            System.out.println("Name: " + obj.getName());
            System.out.println("Height: " + obj.getHeight());
            System.out.println("Wight: " + obj.getWeight());
        }


}



