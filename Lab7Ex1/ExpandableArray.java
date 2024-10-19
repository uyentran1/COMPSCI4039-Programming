package Lab7Ex1;

public class ExpandableArray 
{
    private int[] myArray = new int[10]; // Initial size
    private int pos = 0; // Next position to add element into   
    
    public void add(int a)
    {
        if (pos >= myArray.length)
        {
            // Make array bigger
            int currentLength = myArray.length;
            int newLength = currentLength + 10;
            int[] newArray = new int[newLength];

            // Copy elements to new array
            System.arraycopy(myArray, 0, newArray, 0, currentLength);
            
            // Reset the reference
            myArray = newArray;
        }

        myArray[pos++] = a;
    }

    public int get(int index)
    {
        if (index < 0 || index > pos)
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        else 
        {
            return myArray[index];
        }
    }

    @Override
    public String toString()
    {
        String line = "";
        for (int i = 0; i < pos; i++)
        {
            line += myArray[i] + " ";
        }
        return line;
    }

    public int getLength()
    {
        return myArray.length;
    }

    public static void main(String[] args) 
    {
        ExpandableArray arr = new ExpandableArray();
        for (int i = 0; i < 10; i++)
            arr.add(i);

        System.out.println(arr);
        System.out.println(arr.getLength());
        arr.add(10);
        System.out.println(arr);
        System.out.println(arr.getLength());
        System.out.println(arr.get(9));
        
    }
}
