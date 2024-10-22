package LabWeek4Arrays;

public class Person {
    private static final int MAX_DEPENDANTS = 3;
    private int dependantsNum;
    private Child[] dependants;
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.dependantsNum = 0;
        this.dependants = new Child[MAX_DEPENDANTS];
    }
    
    public String getName() {
        return name;
        }
        
    public void setName(String name) {
        this.name = name;
    }
        
    public int getAge() {
        return age;
    }
            
    public void setAge(int age) {
        this.age = age;
    }

    public int getDependantsNum() {
        return dependantsNum;
    }

    public void setDependantsNum(int dependantsNum) {
        this.dependantsNum = dependantsNum;
    }

    public Person[] getDependants() {
        return dependants;
    }

    public void setDependants(Child[] dependants) {
        this.dependants = dependants;
    }
                    
    public void sayHello() {
        System.out.println("Hello! I'm " + name + " and I'm " + age + " years old.");
    }

    // Add child object to the expandable dependants list
    public void addDependant(Child child) {
        if (dependantsNum >= dependants.length) {
            Child[] newDependants = new Child[dependantsNum + 3];
            System.arraycopy(dependants, 0, newDependants, 0, dependants.length);
            dependants = newDependants;
        }
        dependants[dependantsNum++] = child;
    }

    @Override
    public String toString() {
        String dependantsInfo = "";

        if (dependants[0] == null)
            dependantsInfo = "None";
        else {
            for (Child dependant : dependants) {
                // If there are no more dependant objects in the list, stop interation
                if (dependant == null) 
                    break;
                // If there is a dependant object, add name and age to the string
                else
                    dependantsInfo += (dependant.name + " " + dependant.age + " ");
            }
        }
        return "Name: " + name + ", Age: " + age + ", Dependants: " + dependantsInfo;
    }
}
