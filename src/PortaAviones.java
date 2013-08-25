

import java.util.Random;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 
/**
 *
 * @author Guillermo Sandoval
 */
public class PortaAviones extends PadreBarco{
   protected int cantBombas;
    public static final String codigo="PA";

    public PortaAviones() {
        super(0,0);
        cantBombas = 5;
    }
    
   
        
    
Scanner sc =new Scanner (System.in);
 Random rd=new Random();
 Partida pd =new Partida("",0);

   public void setPosicion(int x,int y){   
        switch (pd.mapa[x][y]) {
            case "SM":
            case "AZ":         
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
       System.out.print("Haz destruido un porta aviones");
       } 

       public void cambiarPosicion(){
       for(int x=0;x<8;x++){
           for(int y=0;y<8;y++){
              if(pd.mapa[x][y].equals(codigo))
                  pd.mapa[x][y]="";
            }
           
       }    
       int x=rd.nextInt(0)+7;
       int y=rd.nextInt(0)+7;          
       setPosicion(x, y);
       
       }
         
}
