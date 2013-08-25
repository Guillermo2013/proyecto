
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

public class Acorazado extends PadreBarco {
    protected int cantBombas;
    public static final String codigo="AZ";
    
    public Acorazado(){
        super(0,0);
     cantBombas=4;
     
        
    }
 
Scanner sc =new Scanner (System.in);
 Random rd=new Random();
 Partida pd =new Partida("",0);

 public void setPosicionJugador1(int x,int y){   
       if(x>=0&&x<8&&y<8&&y>0){ 
       switch (pd.mapa_jugador1[x][y]) {
            case "SM":
            case "PA":         
            case "DT":
             System.out.print("POSICION OCUPADA");
                System.out.println("OTRA CORDENADA");   
                System.out.println("cordenada en x");
                x=sc.nextInt();
                System.out.println("coordenada en y ");
                setPosicionJugador1(x, y);
            case "":    
            pd.mapa_jugador1[x][y]=codigo;
              break;      
        }
       }
       System.out.println("Las coordenadas estan fuera de limite");
   }
       public void setPosicionJugador2(int x,int y){   
       if(x>=0&&x<8&&y<8&&y>0){ 
       switch (pd.mapa_jugador2[x][y]) {
            case "SM":
            case "PA":         
            case "AZ":
             System.out.print("POSICION OCUPADA");
                System.out.println("OTRA CORDENADA");   
                System.out.println("cordenada en x");
                x=sc.nextInt();
                System.out.println("coordenada en y ");
                setPosicionJugador1(x, y);
            case "":    
            pd.mapa_jugador2[x][y]=codigo;
              break;      
        }
       }
       System.out.println("Las coordenadas estan fuera de limite");
   }  
    @Override
   public void golpeJugador1 (int x,int y){
        if (cantBombas>0){
           if (pd.mapa_jugador1[x][y].equals(codigo)){
                   cantBombas-=1;
               }
                   System.out.println("HAZ FALLADO");
              
       }else
       System.out.print("Haz destruido un destructor");
       } 
        
   @Override
       public void golpeJugador2 (int x,int y){
        if (cantBombas>0){
           if (pd.mapa_jugador2[x][y].equals(codigo)){
                   cantBombas-=1;
               }
                   System.out.println("HAZ FALLADO");
              
       }else
       System.out.print("Haz destruido un destructor");
       } 
       public void cambiarPosicionJugado1(){
       for(int x=0;x<8;x++){
           for(int y=0;y<8;y++){
              if(pd.mapa_jugador2[x][y].equals(codigo))
                  pd.mapa_jugador2[x][y]="";
            }
           
       }    
       int x=rd.nextInt(0)+7;
       int y=rd.nextInt(0)+7;          
       setPosicionJugador1(x, y);
       
       }
       public void cambiarPosicionJugado2(){
       for(int x=0;x<8;x++){
           for(int y=0;y<8;y++){
              if(pd.mapa_jugador2[x][y].equals(codigo))
                  pd.mapa_jugador2[x][y]="";
            }
           
       }    
       int x=rd.nextInt(0)+7;
       int y=rd.nextInt(0)+7;          
       cambiarPosicionJugado2();
       
       }  
       
}
