public class lol {
  public static void main(String[] args) {
  int cantdCajas =9;
  int niveles=0;
   System.out.println("Con "+cantdCajas+" cajas");
   while(cantdCajas>0){
       cantdCajas-=++niveles;
           if(cantdCajas<0){
               System.out.println("se pueden armar"+ (niveles-1) +"niveles y sobra/n "+(niveles+cantdCajas)+" caja/s");
           }else{
               System.out.println("se pueden armar" +niveles+ "niveles");
           }
       }
       
    }
}/*    
                   8 nivel 1                                                                               
                    6        2                                                                                
                     3        3                                                                               
                      3         4                                                                             
                      -1                                                                                      
                                                                                                             */

