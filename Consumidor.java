
package Ponto2D;


public class Consumidor {
    public static void main(String[] args) {
        Ponto2D p = new Ponto2D();
        p.setX(10);
        p.setY(20);
        
        Ponto2D p2 = new Ponto2D();
        p2.setX(10);
        p2.setY(20);
        
        
        System.out.println(p.toString());
       
        Ponto2D z = new Ponto2D(2, 3);
        
        Ponto2D x = z.clonar();
        System.out.println(" ");

        System.out.println(z); 
        System.out.println(x); 
        System.out.println(" ");
        
        Ponto2D p3 = new Ponto2D(7, 18);
        p3.movimenta(2, 3);

        System.out.println(p); 
    }
}
