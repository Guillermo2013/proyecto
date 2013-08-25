
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo Sandoval
 */
public final  class Partida {
 protected String[] jugador;
 protected String nivel;
 protected int numeroPartida;
 protected String mapa_J[][];

public Partida(String nivel,int numPartida  ){
   jugador=new String[1];
   this.nivel=nivel;
   numeroPartida=numPartida;
   mapa=new String [8][8];
}

        
    public void agregarJugadores(){
        for (int x=0;x<1;x++){
            Scanner sc=new Scanner(System.in);
            System.out.println("ingrese JUGADO"+(x+1));
            jugador[x]=sc.next();
        }
        
    }
     
              
            
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getNumeroPartida() {
        return numeroPartida;
    }

    public void setNumeroPartida(int numeroPartida) {
        this.numeroPartida = numeroPartida;
    }
    
    public void dibujarmap(int fila , int colummas){
       for (int x=0;x<8;x++){
           for (int y=0;y<8;y++){
              System.out.print("~");
           }
        System.out.println("");
       }
    }
  
}
