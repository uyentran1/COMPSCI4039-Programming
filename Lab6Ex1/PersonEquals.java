package Lab6Ex1;

public class PersonEquals 
{
    private String name;
    private int age;

    public PersonEquals(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof PersonEquals))
            return false;
        
        else
        {
            PersonEquals other = (PersonEquals) o;
            return age == other.getAge();
        }
    }

    @Override
    public int hashCode() {
        return age;
    }

    public static void main(String[] args)
    {
        PersonEquals a = new PersonEquals("Claire", 21);
        PersonEquals b = new PersonEquals("Fred", 21);
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true
    }
}
