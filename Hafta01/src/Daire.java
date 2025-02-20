public class Daire {
    private double yaricap;
    public Daire(double yaricap){
        yaricap=yaricap;
    }
    private double AlanHisapla(){
        return Math.PI * yaricap * yaricap;
    }
    private Double CevreHisapla(){
        return 2 * Math.PI * yaricap;
    }
    public void YazdirAlan(){
        System.out.println("Alan: " + AlanHisapla());
    }
    public void YazdirCevre(){
        System.out.println("Cevre: " + CevreHisapla());
    }
}
