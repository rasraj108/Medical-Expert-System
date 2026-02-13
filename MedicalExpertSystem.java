class MedicalExpertSystem 
{
    private SymptomChecker checker; // Private instance variable to store the symptom checker.

    // Constructor to initialize the MedicalExpertSystem with a SymptomChecker object.
    public MedicalExpertSystem(SymptomChecker checker) 
    {
        this.checker = checker;
    }

    // Method to run a diagnosis based on the symptoms provided by the SymptomChecker.
    public void runDiagnosis() 
    {
        if (checker.hasFever()) 
        {
            if (checker.hasHeadache()) 
            {
                if (checker.hasSoreThroat()) 
                {
                    // Provide advice for possible strep throat diagnosis.
                    System.out.println("You may have strep throat. Gargling with warm saltwater can help soothe a sore throat and reduce inflammation. Mix half a teaspoon of salt in a glass of warm water and gargle several times a day.");
                } else if (checker.hasRunnyOrStuffyNose()) 
                {
                    // Provide advice for possible sinus infection diagnosis.
                    System.out.println("You may have a sinus infection. Inhaling steam from a bowl of hot water or using a humidifier can help moisten the nasal passages, relieve congestion, and promote drainage. Be cautious to avoid burns and always supervise children when using steam inhalation.");
                } else 
                {
                    // Provide advice for possible migraine diagnosis.
                    System.out.println("You may have a migraine. Rest in a quiet, dark room and take pain relievers. Drink plenty of water throughout the day to stay hydrated.");
                }
            }
            else 
            {
                if (checker.hasMuscleAches()) 
                {
                    // Provide advice for possible flu diagnosis.
                    System.out.println("You may have the flu. Get plenty of rest and drink fluids. Antiviral medications may be prescribed.");
                } else if (checker.hasRash()) 
                {
                    // Provide advice for possible measles diagnosis.
                    System.out.println("You may have measles. Consult a doctor for proper diagnosis and supportive care.");
                } else 
                {
                    // Provide advice for possible infection diagnosis.
                    System.out.println("You may have an infection. Rest, fluids, and over-the-counter medications can help.");
                }
            }
        } 
        else 
        {
            if (checker.hasCough()) 
            {
                if (checker.hasDifficultyBreathing()) 
                {
                    // Provide advice for possible asthma or pneumonia diagnosis.
                    System.out.println("You may have asthma or pneumonia. Seek immediate medical attention.");
                } else if (checker.hasChestPain()) 
                {
                    // Provide advice for possible bronchitis diagnosis.
                    System.out.println("You may have bronchitis. Rest, fluids, and over-the-counter medications can help. See a doctor if symptoms worsen.");
                } else 
                {
                    // Provide advice for possible common cold diagnosis.
                    System.out.println("You may have a common cold. Rest, fluids, and over-the-counter medications can help.");
                }
            }
            else 
            {
                if (checker.hasDiarrhea()) 
                {
                    // Provide advice for possible gastroenteritis diagnosis.
                    System.out.println("You may have gastroenteritis. Drink plenty of fluids and consider over-the-counter medications for symptom relief.");
                } else 
                {
                    // Provide advice for when symptoms do not suggest a specific condition.
                    System.out.println("Your symptoms do not suggest a specific condition. It is advisable to consult a doctor for proper diagnosis.");
                }
            }
        }
    }
}
