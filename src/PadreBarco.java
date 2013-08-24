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
  protected String codigo;
   protected int posiciony;  
 
  public PadreBarco(int y, int x,String cod){
        posicionx =x;
        codigo=cod;
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

    public abstract String getCodigo() ;
     
    public abstract void setCodigo(String codigo) ;
  
    public abstract  void golpe(int x,int y);


}
