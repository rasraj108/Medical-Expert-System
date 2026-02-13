class Patient 
{
    private String name; // Private instance variable to store the patient's name.
    private int age; // Private instance variable to store the patient's age.

    // Constructor to initialize patient details (name and age).
    public Patient(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    // Method to display patient's name and age.
    public void displayPatientInfo() 
    {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
    }
}
