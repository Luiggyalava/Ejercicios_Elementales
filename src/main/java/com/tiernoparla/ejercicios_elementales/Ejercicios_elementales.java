package com.tiernoparla.ejercicios_elementales;
//import java.lang.math
public class Ejercicios_elementales {  
    public static void main(String[] args) {
      
        String letras = "abcde";
      
       int conteo = 0;
       for(int i =0; i <  letras.length(); i++){
           
           char c = Character.toLowerCase(letras.charAt(i));
       if ((c =='a')||(c=='e') || (c=='i')||(c=='o')||(c=='u')){
       conteo++;
       }//cierre if
       
       }//cierre for
        System.out.println(conteo);
    }//main
}//class
