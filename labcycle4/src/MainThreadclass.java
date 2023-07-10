public class MainThreadclass {
    public static void main(String[] args) {
        fivemultliplicationthread f_m_t=new fivemultliplicationthread();
        primenumberThread p_t=new primenumberThread(10);
        f_m_t.multiplifive();
        p_t.runprocessThread();
    }
}
