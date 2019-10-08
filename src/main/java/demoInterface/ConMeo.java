package demoInterface;

public class ConMeo extends DongVat implements NhungHanhViCuaDongVat {
    @Override
    public void an() {
        System.out.println("Con Meo An Com");
    }

    @Override
    public void ngu() {
        System.out.println("Con Meo ngu tren noc nha");
    }

    @Override
    public void diChoi() {
        System.out.println("Con meo di choi khuya");
    }

    @Override
    public void chay() {
        System.out.println("Con Meo leo cay chu ko chay");
    }

    public void sanMoi(){
        System.out.println("Con Meo san moi");
    }
}
