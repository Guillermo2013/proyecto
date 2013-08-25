

import java.util.Scanner;

 public class BATTLESHIP {
     public static void main(String []args){
        Partida pd=new Partida("",0);
       
        Scanner sc =new Scanner(System.in);
        int respuesta = 0;
        do{
         try{
            System.out.println("MENU\n-----\n1.JUGAR\n2.DIFICULTAD\n3.DESCRIPCION\n4.SALIR");
             respuesta=sc.nextInt();
             
            switch(respuesta){
                case 1:
                        pd.agregarJugadores();
                        
                        switch(pd.getNivel()){
                             default:
                                    System.out.println("JUGADOR 1");
                                    System.out.println("AGREGANDO BARCOS DISPONIBLES\n---------");
                                    System.out.println("PORTA AVIONES COD:PA\n ACORAZADO COD:AZ\nSUBMARINO COD:SM\nDESTRUCTOR COD:DT");
                                    String cod=sc.next();
                                    switch(cod.toUpperCase()){
                                        case "PA":
                                            System.out.println("ingrese la cordenada en x");
                                            int x=sc.nextInt();
                                            System.out.println("ingrese la cordenada en y");
                                            int y=sc.nextInt();
                                            
                                        case "AZ":
                                        case "DT": 
                                        case "SM":  
                                    }
                                    break;
                             case "DUMMY":
                                  
                                  
                                break;
                           
                             case "HARD":
                                  
                                break;
                             case "EXPERT":
                                  
                                break;
                              case "GENIUS":
    
                                 break;
                              
                        }
                         break;
                case 2 :
                            
                        System.out.println("QUE NIVEL ES EL QUE DESEA DUMMY--EASY--HARD--EXPERT--GENIUS");
                        String nivel=sc.next();
                        pd.setNivel(nivel.toUpperCase());
                        System.out.println("HAZ CAMBIADO EL NIVEL A "+nivel.toUpperCase());
                        break;
                                                               
                case 3 :
                    
                    break;
                case 4 : 
                        break;
                    
            }
            
            
      
         }catch(Exception e){
             System.out.print("A INGRESADO INFORMACION INCORRECTA SE REINICIARA EL JUEGO");
         }
            
       }while(respuesta!=4);
    
     }
        
        
        
        
    }


        
