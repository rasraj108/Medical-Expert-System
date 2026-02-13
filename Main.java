import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Medical Expert System!");

        while (true) 
        {
            clearScreen(); // Clear the console for a new patient's interaction.

            System.out.println("Patient Details:");
            Patient patient = createPatient(sc); // Create a new patient object.

            SymptomChecker checker = new SymptomChecker(sc); // Initialize a symptom checker.
            MedicalExpertSystem expertSystem = new MedicalExpertSystem(checker); // Initialize the medical expert system.

            System.out.println("Appointment Details:");
            Appointment appointment = createAppointment(sc, patient); // Create a new appointment object.
            System.out.println("Please enter your answer by typing 'yes' or 'no':");

            expertSystem.runDiagnosis(); // Run the medical diagnosis.

            System.out.println("\nAppointment Details:");
            appointment.displayAppointmentDetails(); // Display appointment details.

            System.out.println("\nPress Enter to move on to the next patient (or type 'exit' to quit)");
            String answer = sc.nextLine().toLowerCase(); // Get user input to continue or exit.
            if (answer.equals("exit")) 
            {
                break; // Exit the loop if the user chooses to quit.
            }
        }

        System.out.println("\nThank you for using the Medical Expert System. Goodbye!");
        sc.close(); // Close the scanner.
    }

    public static Patient createPatient(Scanner sc) 
    {
        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        System.out.print("Enter patient age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline character

        return new Patient(name, age); // Create and return a new patient object.
    }

    public static Appointment createAppointment(Scanner sc, Patient patient) 
    {
        System.out.print("Enter appointment date (00/00/00 format): ");
        String date = sc.nextLine();
        boolean isValidFormat = checkDateFormat(date); // Check if the date format is valid.
        if (isValidFormat) 
        {
            System.out.println("The date format is valid.");
        } else 
        {
            System.out.println("The date format is invalid.");
            System.exit(0); // Exit the program if the date format is invalid.
        }

        System.out.print("Enter appointment time (00:00 format): ");
        String time = sc.nextLine();
        if (isValidTimeFormat(time)) // Check if the time format is valid.
        {
            System.out.println("Valid time format.");
        } else 
        {
            System.out.println("Invalid time format.");
            System.exit(0); // Exit the program if the time format is invalid.
        }

        return new Appointment(date, time, patient); // Create and return a new appointment object.
    }

    public static boolean isValidTimeFormat(String time) 
    {
        if (time.length() != 5)
            return false;

        String[] parts = time.split(":");
        if (parts.length != 2)
            return false;

        String hoursStr = parts[0];
        String minutesStr = parts[1];

        if (hoursStr.length() != 2 || minutesStr.length() != 2)
            return false;

        try 
        {
            int hours = Integer.parseInt(hoursStr);
            int minutes = Integer.parseInt(minutesStr);

            if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59)
                return false;
        }
        catch (NumberFormatException e) 
        {
            return false;
        }

        return true; // Return true if the time format is valid.
    }

    public static boolean checkDateFormat(String date) 
    {
        if (date.length() != 8 || date.charAt(2) != '/' || date.charAt(5) != '/') 
        {
            return false;
        }

        try 
        {
            int day = Integer.parseInt(date.substring(0, 2));
            int month = Integer.parseInt(date.substring(3, 5));
            int year = Integer.parseInt(date.substring(6, 8));

            if (day < 1 || day > 31 || month < 1 || month > 12 || year < 0 || year > 99) 
            {
                return false;
            }
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }

        return true; // Return true if the date format is valid.
    }

    public static void clearScreen() 
    {
        System.out.print("\u000C"); // Clear the console screen.

    }
}
