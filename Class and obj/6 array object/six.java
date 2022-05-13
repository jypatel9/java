class subject {
    private String subjectID;
    private String subjectName;
    private int maxMarks;
    private int marksObtain;

    public subject(String subjectID, String subjectName, int maxMarks) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.maxMarks = maxMarks;
    }

    public String getsubjectID() {
        return subjectID;
    }

    public String getsubjectName() {
        return subjectName;
    }

    public int getmaxMarks() {
        return maxMarks;
    }

    public int getmarksObtains() {
        return marksObtain;
    }

    public void setmarksObtains(int marksObtain) {
        this.marksObtain = marksObtain;
    }

    public boolean isQualify() {
        return marksObtain > maxMarks / 10 * 4;
    }

    public String toString() {
        return "\n subject ID: " + subjectID + "\n Subject Name: " + subjectName + "\n Marks Obtains: " + marksObtain;
    }
}

public class six {

    public static void main(String args[]) {
        subject sub[] = new subject[3];
        sub[0] = new subject("a101", "C", 100);
        sub[1] = new subject("a102", "C++", 100);
        sub[2] = new subject("a103", "JAVA", 100);

        for(subject s:sub)
        {
            System.out.println(s);
        }
    }

}
