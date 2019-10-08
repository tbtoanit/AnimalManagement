package demoInterface;

public class App {
    public static void main(String[] args) {
        ConCho c = new ConCho();
        c.tenDongVat = "lu lu";
        c.tuoi = "7";
        c.an();
        c.chay();
        c.diChoi();
        c.ngu();
        c.sanMoi();
        c.noDua();
        c.sinhSan();

        ConMeo m = new ConMeo();
        m.tenDongVat = "meo meo";
        m.tuoi = "5";
        m.an();
        m.chay();
        m.diChoi();
        m.ngu();
        m.sanMoi();
    }
}
