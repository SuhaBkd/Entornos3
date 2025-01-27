package mis_intentos;

public class E110CompararConAnterior {
    public static void main(String[] args){

        double[] ArrayDouble = { 24.00, 37.97, 93.84, 93.84, 17.39, 17.38, 32.98 };
        for (int i = 0; i < ArrayDouble.length - 1 ; i++){
            if( ArrayDouble[i] == ArrayDouble[i+1] ){
                System.out.println(" El número " + (i+2) + " es IGUAL al número " + (i+1));
            }else if( ArrayDouble[i] > ArrayDouble[i+1] ){
                System.out.println(" El número " + (i+2) + " es MENOR que el número " + (i+1) );
            }else{
                System.out.println(" El número " + (i+2) +  " es MAYOR que el número " + (i+1) );
            }
        }
    }
}
