public class Candidate {
    private String candidateName;
    private String schoolName;

    private static int examYear;
    private static double registrationFee;
    private static String gradingPolicy;

    static {
        examYear = 2026;
        registrationFee = 50000;
        gradingPolicy = "A to E grading scale";

        System.out.println("Static block: loaded UNEB exam settings");
    }

    public Candidate(String candidateName, String schoolName) {
        this.candidateName = candidateName;
        this.schoolName = schoolName;

        System.out.println("Constructor: registered " + candidateName);
    }
}