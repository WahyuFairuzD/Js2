public class StudentMain {
    public static void main(String[] args) {
       Student26 student1 = new Student26(null, null, null, 0);
       student1.studentID = "244107020097";
       student1.Name = "Wahyu";
       Student26.className = "TI-1I";
       student1.gpa = 3.8;
       student1.printData();
       student1.className = ("TI-2I");
       student1.updateIPK(3.9);
       student1.printData(); 
       Student26 student2 = new Student26("244107020225", "Wahyu", "TI-1I", 3.5);
       student2.updateIPK(3.3);
       student2.printData();
    }

}
