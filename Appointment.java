class Appointment 
{
    // Private instance variables to store appointment information
    private String date; 
    private String time;
    private Patient patient;

    // Constructor to initialize appointment details
    public Appointment(String date, String time, Patient patient) 
    {
        this.date = date;
        this.time = time;
        this.patient = patient;
    }

    // Method to display appointment details
    public void displayAppointmentDetails() 
    {
        System.out.println("Appointment Date: " + date);
        System.out.println("Appointment Time: " + time);
        patient.displayPatientInfo(); // Call the patient's method to display their information
    }
}
