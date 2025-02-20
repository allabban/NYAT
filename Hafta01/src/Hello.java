public class Hello {
    public static void main(String[] args) {
        Daire daire=new Daire();
        daire.yaricap=6;
        System.out.println("Dairenin alani :"+ Math.PI*daire.yaricap*daire.yaricap);
        System.out.println("Dairenin cevresi:"+2*Math.PI*daire.yaricap);
        Daire daire2=new Daire();
        daire2.yaricap=5;
        System.out.println("Dairenin alani :"+ Math.PI*daire2.yaricap*daire2.yaricap);
        System.out.println("Dairenin cevresi:"+2*Math.PI*daire2.yaricap);
        Daire daire3=new Daire();
        daire3.yaricap=4;
        System.out.println("Dairenin alani :"+ Math.PI*daire3.yaricap*daire3.yaricap);
        System.out.println("Dairenin cevresi:"+2*Math.PI*daire3.yaricap);
    }
}