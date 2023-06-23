package labcycle3;

import java.util.Scanner;
class Student{
private  int acscore;
public Student(int acscore)
{
    this.acscore=acscore;
}
public int getAcscore()
{
    return acscore;
}
}
class Sports{+
private  int sport_sc;
public Sports(int sport_sc)
{
    this.sport_sc=sport_sc;
}
int getSport_sc()
{
    return sport_sc;
}
}
class result{
    private Student student;
    private Sports sports;
    result(Student student, Sports sports)
    {
        this.sports=sports;
        this.student=student;
    }
public void display()
{
    System.out.println("academic score:"+sports.getSport_sc());
    System.out.println("sports score:"+student.getAcscore());
}
}
public class resultdisplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student details");
        System.out.println("enter acadmic score");
        int a_c=sc.nextInt();
        System.out.println("enter sport score");
        int s_c=sc.nextInt();
        Student student =new Student(a_c);
        Sports sports = new Sports(s_c);
        result re=new result(student,sports);
        re.display();

    }
}
//class Student {
//    private int academicScore;
//
//    public Student(int academicScore) {
//        this.academicScore = academicScore;
//    }
//
//    public int getAcademicScore() {
//        return academicScore;
//    }
//}
//
//class Sports {
//    private int sportsScore;
//
//    public Sports(int sportsScore) {
//        this.sportsScore = sportsScore;
//    }
//
//    public int getSportsScore() {
//        return sportsScore;
//    }
//}
//
//class Result {
//    private Student student;
//    private Sports sports;
//
//    public Result(Student student, Sports sports) {
//        this.student = student;
//        this.sports = sports;
//    }
//
//    public void displayScores() {
//        System.out.println("Academic Score: " + student.getAcademicScore());
//        System.out.println("Sports Score: " + sports.getSportsScore());
//    }
//}
//
//public class ResultDisplay {
//    public static void main(String[] args) {
//        int academicScore = 80;
//        int sportsScore = 90;
//
//        Student student = new Student(academicScore);
//        Sports sports = new Sports(sportsScore);
//
//        Result result = new Result(student, sports);
//        result.displayScores();
//    }
//}
