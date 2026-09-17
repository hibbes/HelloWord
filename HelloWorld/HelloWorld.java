
/**
Beschreiben Sie hier die Klasse HelloWorld.

@author (Ihr Name) 
@version (eine Versionsnummer oder ein Datum)
 */
public class HelloWorld {

    public static void main(String args[]){
        System.out.println(istSchaltjahr(400)
        );
    }
    
    
    public static boolean istSchaltjahr(int jahr){
         
        return (jahr % 4==0 && jahr % 100 != 0 || jahr % 400 == 0);
    }
    
    public static void summe(){
        int[] a ={3, 9, 2, 7};
        int summe = 0;
        
        for(int i =0; i<a.length; i++){
          summe+=a[i];    
        }
        System.out.println("Summe: "+summe);
        
        
        
        int[] b = new int[7];
    }
}