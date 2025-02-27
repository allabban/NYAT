public class Dikdortgen {
    private double en;
    private double getEn() {
        return en;
    }
    private void setEn(double en) {
        if (en<=0){
            System.out.println("En 0'dan büyük olmaldr.");
            en=0;
        }else {
            this.en = en;
        }
    }
    private double boy;
    private double getBoy() {
        return boy;
    }
    private void setBoy(double boy) {
        if (boy<=0){
            System.out.println("Boy 0'dan büyük olmaldr.");
            boy=0;
        }else {
            this.boy = boy;
        }
    }

    public Dikdortgen(double en, double boy) {
        this.setEn(en);
        this.setBoy(boy);
    }
    private double alanHesapla(){
        return getEn()*getBoy();
    }
    private double cevreHesapla(){
        return 2*(getBoy()+getEn());
    }
    public void yazdir(){
        System.out.println("Dikdörtgenin Alan: "+alanHesapla());
        System.out.println("Dikdörtgenin Çevresi: "+cevreHesapla());
    }
}
