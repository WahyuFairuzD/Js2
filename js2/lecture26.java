public class lecture26 {
    static String lectureID;
    static String Name;
    static boolean status;
    static int startYear;
    static String expertiseField;

    public lecture26 (String id, String name, boolean Status, int year, String expert){
        lectureID = id;
        Name = name;
        status = Status;
        startYear = year;
        expertiseField = expert;
    }
    static void printData(){
        System.out.println("Lecture ID: "+ lectureID );
        System.out.println("Name :" + Name);
        System.out.println("Status :" + status);
        System.out.println("Start Year:" + startYear);
        System.out.println("ExpertiseField :" + expertiseField);
    }
    static void setStatus(boolean newStatus){
        status=newStatus;
    }
    lecture26(String string, String string2, boolean b, int yearNow, String string){
        int Year = yearNow - startYear;
        System.out.println("Year:"+ Year);
                
    }
    static void changeExpertise(String newExpertise){
        expertiseField = newExpertise;
    }
    public static int calculateYear(int i) {
       
        throw new UnsupportedOperationException("Unimplemented method 'calculateYear'");
    }
}
