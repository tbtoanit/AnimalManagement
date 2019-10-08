package demoInterface;

public class ConCho extends DongVat implements NhungHanhViCuaDongVat, NhungHanhViKhacCuaDongVat {
    @Override
    public void an() {
        System.out.println("Con Cho An Com");
    }

    @Override
    public void ngu() {
        System.out.println("Con Cho ngu duoi dat");
    }

    @Override
    public void diChoi() {
        System.out.println("Con Cho khong di choi");
    }

    @Override
    public void chay() {
        System.out.println("Con Cho chay bang 4 chan");
    }

    public void sanMoi(){
        System.out.println("Con Cho san moi");
    }

    @Override
    public void noDua() {
        System.out.println("Dong Vat No Dua");
    }

    @Override
    public void sinhSan() {
        System.out.println("Dong Vat Sinh San");
    }
}
