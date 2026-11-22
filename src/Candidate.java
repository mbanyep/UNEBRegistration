public class Candidate {
    private String candidateName;
    private String schoolName;
    private String registrationStatus;
    private String examinationCentre;

    private static int examYear;
    private static double registrationFee;
    private static String gradingPolicy;

    static {
        examYear = 2026;
        registrationFee = 50000;
        gradingPolicy = "A to E grading scale";

        System.out.println("Static block: loaded UNEB exam settings");
    }

    {
        registrationStatus = "Registered";
        examinationCentre = "Not yet assigned";

        System.out.println("Instance block: initialized candidate defaults");
    }

    public Candidate(String candidateName, String schoolName) {
        this.candidateName = candidateName;
        this.schoolName = schoolName;

        System.out.println("Constructor: registered " + candidateName);
    }

    public static void displayExamSettings() {
        System.out.println("Exam year: " + examYear);
        System.out.println("Registration fee: UGX " + registrationFee);
        System.out.println("Grading policy: " + gradingPolicy);
    }

    public void displayCandidateDetails() {
        System.out.println("Candidate: " + candidateName);
        System.out.println("School: " + schoolName);
        System.out.println("Registration status: " + registrationStatus);
        System.out.println("Examination centre: " + examinationCentre);
    }

    public static void main(String[] args) {
        displayExamSettings();

        Candidate candidate1 = new Candidate("Amina", "Kampala Secondary School");
        Candidate candidate2 = new Candidate("Brian", "Jinja High School");
    }

}