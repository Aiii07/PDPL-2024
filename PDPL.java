public class PDPL {
    private String geekName;
    private int geekRoll;
    private int geekAge;

    // Getter methods
    public int getAge() { 
        return geekAge; 
    }

    public String getName() { 
        return geekName; 
    }

    public int getRoll() { 
        return geekRoll; 
    }

    // Setter methods
    public void setAge(int newAge) { 
        geekAge = newAge;     
    }

    public void setName(String newName) {
        geekName = newName;
    }

    public void setRoll(int newRoll) {
        geekRoll = newRoll;
    }

    // Main method for testing
    public static void main(String[] args) {
        PDPL geek = new PDPL();

        // Set values
        geek.setName("Aii");
        geek.setRoll(1);
        geek.setAge(21);

        // Get and print values
        System.out.println("Name: " + geek.getName());
        System.out.println("Roll: " + geek.getRoll());
        System.out.println("Age: " + geek.getAge());
    }
}
