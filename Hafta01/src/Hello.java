public class Hello {
    public static void main(String[] args) {
        Daire daire=new Daire(6);
        Dikdortgen d =new Dikdortgen(4,5);
        //
        daire.YazdirAlan();
        daire.YazdirCevre();
        Daire daire2=new Daire(5);
        //daire2.yaricap=5;
        daire2.YazdirAlan();
        daire2.YazdirCevre();
        Daire daire3=new Daire(7);
        //.yaricap=4;
        daire3.YazdirAlan();
        daire3.YazdirCevre();
        Daire daire4=new Daire(8);
        //
        daire4.YazdirAlan();
        daire4.YazdirCevre();
        d.yazdir();
        
    }
}