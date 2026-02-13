import java.util.*;

class SymptomChecker 
{
    private Scanner sc; // Private instance variable to store the Scanner object for input.

    // Constructor to initialize SymptomChecker with a Scanner.
    public SymptomChecker(Scanner sc) 
    {
        this.sc = sc;
    }

    // Method to check if the patient has a fever.
    public boolean hasFever() 
    {
        System.out.println("Do you have a fever?");
        String answer = sc.nextLine().toLowerCase();
        return answer.equals("yes");
    }

    // Method to check if the patient has a headache.
    public boolean hasHeadache() 
    {
        System.out.println("Do you have a headache?");
        String answer = sc.nextLine().toLowerCase();
        return answer.equals("yes");
    }

    // Method to check if the patient has a sore throat.
    public boolean hasSoreThroat() 
    {
        System.out.println("Do you have a sore throat?");
        String answer = sc.nextLine().toLowerCase();
        return answer.equals("yes");
    }

    // Method to check if the patient has a runny or stuffy nose.
    public boolean hasRunnyOrStuffyNose() 
    {
        System.out.println("Do you have a runny or stuffy nose?");
        String answer = sc.nextLine().toLowerCase();
        return answer.equals("yes");
    }

    // Method to check if the patient has muscle aches.
    public boolean hasMuscleAches() 
    {
        System.out.println("Do you have muscle aches?");
        String answer = sc.nextLine().toLowerCase();
        return answer.equals("yes");
    }

    // Method to check if the patient has a rash.
    public boolean hasRash() 
    {
        System.out.println("Do you have a rash?");
        String answer = sc.nextLine().toLowerCase();
        return answer.equals("yes");
    }

    // Method to check if the patient has a cough.
    public boolean hasCough() 
    {
        System.out.println("Do you have a cough?");
        String answer = sc.nextLine().toLowerCase();
        return answer.equals("yes");
    }

    // Method to check if the patient has difficulty breathing.
    public boolean hasDifficultyBreathing() 
    {
        System.out.println("Do you have difficulty breathing?");
        String answer = sc.nextLine().toLowerCase();
        return answer.equals("yes");
    }

    // Method to check if the patient has chest pain.
    public boolean hasChestPain() 
    {
        System.out.println("Do you have chest pain?");
        String answer = sc.nextLine().toLowerCase();
        return answer.equals("yes");
    }

    // Method to check if the patient has diarrhea.
    public boolean hasDiarrhea()
    {
        System.out.println("Do you have diarrhea?");
        String answer = sc.nextLine().toLowerCase();
        return answer.equals("yes");
    }
}
