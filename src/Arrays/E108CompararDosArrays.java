package Arrays;

public class E108CompararDosArrays {
    public static void main(String[] args) {
        int[] ArrayIntA = { 25, 2, -1, 0, 8};
        int[] ArrayIntB = { 12, 3, 0, 19, 7};

        System.out.println("Comparar los elemntos de arrays de tipo Int por pares: ");

        for (int i = 0; i < ArrayIntA.length; i++) {
            if (ArrayIntA [i] == ArrayIntB [i]) {
                System.out.println("Los elemntos en " + i + " del ArrayIntA " + "(" + ArrayIntA [i] +  ")" + " del ArrayIntB " + ArrayIntB [i] +  ")" + " son iguales");
            } else if (ArrayIntA [i] > ArrayIntB [i]) {
                System.out.println("El elemnto "+ i +" del ArrayIntA " +  "(" + ArrayIntA [i] +  ")" + " es Mayor que el elemnto del ArrayIntB " + "(" + ArrayIntB [i] + ")" );
            }else if (ArrayIntA [i] < ArrayIntB [i])
                System.out.println("El elemnto " + i + " del ArrayIntA " + "(" + ArrayIntA [i] +  ")" + " es Menor que el elemnto del ArrayIntB " + "(" + ArrayIntB [i] + ")" );
        }

        double [] ArrayDoubleA = { 13.93, -56.90, 1.08, 15.67};
        double [] ArrayDoubleB = { 78.13, 65.05, -19,94, 31.07};

        System.out.println("\nComparar los elemntos de arrays de tipo double por pares: ");

        for (int i = 0; i < ArrayDoubleA.length; i++) {
            if (ArrayDoubleA [i] == ArrayDoubleB [i]) {
                System.out.println("Los elemntos en " + i + "(" + ArrayDoubleA [i] + ")" + "(" + ArrayDoubleB [i] +  ")" + " son iguales");
            }else if (ArrayDoubleA [i] > ArrayDoubleB [i]) {
                System.out.println("El elemnto " + i + " del ArrayDoubleA " + "(" + ArrayDoubleA [i] +  ")" + " es Mayor que el elemnto del ArrayDoubleB" + "(" + ArrayDoubleB [i] + ")" );
            }else if (ArrayDoubleA [i] < ArrayDoubleB [i]){
                System.out.println("El elemnto " + i + " del ArrayDoubleA " +  "(" + ArrayDoubleA [i] +  ")" + " es Menor que el elemnto del ArrayDoubleB" + "(" + ArrayDoubleB [i] + ")" );
            }
        }

        boolean [] ArrayBooleanA = { false , false, true, true };
        boolean [] ArrayBooleanB = { true , false, true , false };

        System.out.println("\nComparar los elemntos de arrays de tipo boolean por pares: ");
        for (int i = 0; i < ArrayBooleanA.length; i++) {
            if (ArrayBooleanA [i] == ArrayBooleanB [i]) {
                System.out.println("Los elementos en " + i + " del ArrayBooleanA " + "(" + ArrayBooleanA [i] + ")" + " y el elemento del ArrayBooleanB " + "(" + ArrayBooleanB [i] + ")" + " son iguales");
            }else {
                System.out.println("Los elementos en " + i + " del ArrayBooleanA " + "(" + ArrayBooleanA [i] + ")" + " y el elemento del ArrayBooleanB " + "(" + ArrayBooleanB [i] + ")" + " son diferentes");
            }
        }
    }
}
