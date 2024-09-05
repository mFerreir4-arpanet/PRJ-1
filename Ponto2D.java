
package Ponto2D;
public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D() {
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D p2) {
        this.x= p2.x;
        this.y= p2.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void movimenta(){
            this.x = 0;
            this.y = 0;
        }
       public void movimenta(double x, double y){
         this.x +=0;
         this.y +=0;
       }
       public boolean igual(Ponto2D p2){
           if(x == this.x && y==this.y){
               return true; 
           }
           return false;
       }
    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
    public double distancia(Ponto2D p){
        return(Math.sqrt(Math.pow(p.x -this.x  , 2) +Math.pow(p.y -this.y  , 2)));
    }
    
    public Ponto2D clonar() {
 
        return new Ponto2D(this.x, this.y);
        
}
}