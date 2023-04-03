import java.util.*;

class studmark {
    int n;
    float totalmark;
    float p_mark;
    float[] mark;
    String[] name;

    void readdata() {
        Scanner m_r_n = new Scanner(System.in);

        System.out.println("Enter number of students:");
        n = m_r_n.nextInt();
        mark = new float[n];
        name = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of student (below 100):");
            float usermark = m_r_n.nextFloat();
            if (usermark <= 100) {
                mark[i] = usermark;
                System.out.println("Enter name:");
                name[i] = m_r_n.next();
            } else {
                System.out.println("Enter a valid mark");
                i--;
            }
        }
    }

    void displaydata() {
        for (int i = 0; i < n; i++) {
            System.out.println("Name of student: " + name[i] + " | Mark of student: " + mark[i]);
        }
    }

    void addtotalmark() {
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mark[i];
        }
        totalmark = sum;
        System.out.println("Total marks obtained by all students: " + totalmark);
        p_mark = (totalmark / (n*100)) * 100;
        System.out.println("percentage of total mark"+p_mark);
    }
     


    public static void main(String[] args) {
        studmark objread = new studmark();
        objread.readdata();
        objread.displaydata();
        objread.addtotalmark();
    }
}

