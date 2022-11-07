package ba.unsa.etf.rpr;

import ba.unsa.etf.rpr.t2.Math;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if(args.length != 2){
            System.err.println("Nedovoljan broj argumenata");
        }else if(!args[0].equals("sinus") && !args[0].equals("factoriel")){
            System.err.println("Neispravna fja");
        }else{

                String fja = args[0];
                double unosBroja = Double.parseDouble(args[1]);
                if(fja.equals("sinus")){
                    System.out.println("sinus("+unosBroja+") = "+ Math.sin(unosBroja));
                }
                if(fja.equals("factoriel")){

                    System.out.println("factoriel "+unosBroja+" = " + Math.faktorijel((int)unosBroja));

            }
        }
        System.out.println( "Hello World!" );
    }
}
