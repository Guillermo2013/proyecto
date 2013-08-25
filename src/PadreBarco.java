/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo Sandoval
 */
public abstract class PadreBarco  {
  protected int posicionx;
 
   protected int posiciony;  
 
  public PadreBarco(int y, int x){
        posicionx =x;
       
        posiciony=y;
  }

    public int getPosicionx() {
        return posicionx;
    }

    public void setPosicionx(int posicionx) {
        this.posicionx = posicionx;
    }

    public int getPosiciony() {
        return posiciony;
    }

    public void setPosiciony(int posiciony) {
        this.posiciony = posiciony;
    }
    
    public abstract  void golpeJugador1(int x,int y);
    public abstract  void golpeJugador2(int x,int y);

}
