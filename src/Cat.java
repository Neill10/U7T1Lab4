public class Cat {
    private String name;

    public void setName(String newName)
    {
        this.name = newName;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        String a = "Cat:" + name;
        return a;
    }
}
