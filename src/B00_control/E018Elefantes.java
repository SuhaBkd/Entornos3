package B00_control;

public class E018Elefantes {
    public static void main(String[] args) {
        int numElefantes = 1;

        for (int numElefante=1; numElefante <= numElefantes; numElefante++) {
            String textoElefantes, textoBalanceaban;

            // ALTERNATIVA A
            if      (numElefante == 1                ) textoElefantes   = "elefante"   ;
            else if (numElefante  < 0.75*numElefantes) textoElefantes   = "elefantes"  ;
            else                                       textoElefantes   = "ELEFANTES"  ;

            if      (numElefante == 1)                 textoBalanceaban = "balanceaba" ;
            else                                       textoBalanceaban = "balanceaban";

            // ALTERNATIVA B
            if      (numElefante == 1                ) { textoElefantes = "elefante" ; textoBalanceaban = "balanceaba" ; }
            else if (numElefante  < 0.75*numElefantes) { textoElefantes = "elefantes"; textoBalanceaban = "balanceaban"; }
            else                                       { textoElefantes = "ELEFANTES"; textoBalanceaban = "balanceaban"; }

            // ALTERNATIVA C
            if  (numElefante == 1) {
                textoElefantes = "elefante";

                textoBalanceaban = "balanceaba";
            } else { // Es más de uno.
                if (numElefante < 0.75*numElefantes) {
                    textoElefantes = "elefantes";
                } else {
                    textoElefantes = "ELEFANTES";
                }

                textoBalanceaban = "balanceaban";
            }

            // ALTERNATIVA D (es una versión compacta de la A)
            textoElefantes   = numElefante == 1 ? "elefante"   : numElefante < 0.75*numElefantes ? "elefantes" : "ELEFANTES";
            textoBalanceaban = numElefante == 1 ? "balanceaba" : "balanceaban";

            System.out.format("%d %s se %s sobre la tela de una araña, como veía que no se caía, fue a llamar a otro elefante...\n", numElefante, textoElefantes, textoBalanceaban);
        }

        System.out.println("...pero mientras se balanceaban, la tela de araña se rompió.");
    }
}
