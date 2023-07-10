import arthamatic.shapes;
import add.addtion;
import sub.substraction;
import mul.mulitiplication;
import div.division;
public class arthamaticMain {
    public static void main(String[] args) {
        addtion a_d=new addtion(2,5);
        System.out.println(a_d.operation());
        substraction s_b=new substraction(10,20);
        mulitiplication m_l=new mulitiplication(30,80);
        division d_v=new division(60,38);
        System.out.println(s_b.operation());
        System.out.println(m_l.operation());
        System.out.println(d_v.operation());
    }
}
