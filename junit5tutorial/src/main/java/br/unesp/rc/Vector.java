package br.unesp.rc;

public class Vector {
    private Vector(){
    }

    public static boolean equal(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }


    public static boolean size(int a, int b){
        if ((a < 0) || (b < 0)){
            throw new IllegalArgumentException("Valotes negativos não são permitidos");
        }

        return a == b;
    }
}
