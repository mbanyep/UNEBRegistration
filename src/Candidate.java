public class Candidate {
    private String candidateName;
    private String schoolName;

    public Candidate(String candidateName, String schoolName) {
        this.candidateName = candidateName;
        this.schoolName = schoolName;

        System.out.println("Constructor: registered " + candidateName);
    }
}