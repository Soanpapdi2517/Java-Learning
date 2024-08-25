public class CourseChallenge {
    static int maxCapacity = 5, occurence = 0;
    String courseName;
    int enrollments;
    String studentName;
    String[] enrolledStudents;
    String[] unenrollStudents;

    CourseChallenge(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        enrolledStudents = new String[maxCapacity];
        unenrollStudents = new String[maxCapacity - occurence];
    }
    public static int occurence(String[] enrolledStudents, String studentName){
        int i = 0;
        while(i < enrolledStudents.length){
            if (enrolledStudents[i] == studentName ){
                occurence++;
            }
            i++;
        } return occurence;
    }
    public static void setMaxCapacity(int maxCapacity){
        CourseChallenge.maxCapacity = maxCapacity;
    }
    public void enrolledStudents(String studentsName){
        enrolledStudents[enrollments] = studentsName;
        enrollments++;
        System.out.println(studentsName + " have been enrolled for " + courseName);
    }
    public void unenrollStudents(String studentsName){
        int occ = CourseChallenge.occurence(enrolledStudents, studentName);
        int size = enrolledStudents.length - occ;
        String[] unenrolledStudents =  new String[size];

        int j = 0, k = 0;
        while (j < enrolledStudents.length){
            if (enrolledStudents[j] != studentsName){
                unenrolledStudents[k] = enrolledStudents[j];
                enrollments--;
                k++;
            }
            System.out.println(studentsName + " has been removed");
            j++;
        }
    }

    public int getEnrollments() {
        return enrollments;
    }

    public String[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public String[] getUnenrollStudents() {
        return unenrollStudents;
    }

    public static void main(String[] args) {
        CourseChallenge myCourse = new CourseChallenge("Bca");
        myCourse.enrolledStudents("Sonu");
//        myCourse.enrolledStudents("Sonu");
        myCourse.enrolledStudents("Raj");
        myCourse.enrolledStudents("Subhash");
        myCourse.enrolledStudents("Kiran");
        myCourse.enrolledStudents("vikas");
        myCourse.unenrollStudents("vikas");
        myCourse.unenrollStudents("Raj");
        CourseChallenge.setMaxCapacity(6);
        System.out.println(myCourse.getEnrollments());
    }
}