
import java.util.Scanner;
import java.util.Random;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo Sandoval
 */

public class Acorazado {
    protected int cantBombas;
    public static final String codigo="AZ";
    
    public Acorazado(){
     cantBombas=4;
     
        
    }
 
Scanner sc =new Scanner (System.in);
 Random rd=new Random();
 Partida pd =new Partida("",0);

   public void setPosicion(int x,int y){   
        switch (pd.mapa[x][y]) {
            case "SM":
            case "PA":         
            case "DT":
             System.out.print("POSICION OCUPADA");
                System.out.println("OTRA CORDENADA");   
                System.out.println("cordenada en x");
                x=sc.nextInt();
                System.out.println("coordenada en y ");
                setPosicion(x,y);
            case "":    
            pd.mapa[x][y]=codigo;
              break;      
        }
   }
       public void golpe (int x,int y){
        if (cantBombas>0){
           if (pd.mapa[x][y].equals(codigo)){
                   cantBombas-=1;
               }
                   System.out.println("HAZ FALLADO");
              
       }else
       System.out.print("Haz destruido un acorazado");
       } 

       public void cambiarPosicion(){
       
       int x=rd.nextInt(0)+7;
       int y=rd.nextInt(0)+7;          
       setPosicion(x, y);
       
       }
              
       
}
