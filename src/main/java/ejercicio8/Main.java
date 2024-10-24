package ejercicio8;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.print("Introduce tu una frase o alguna palabra, cuento las vocales: ");
        String palabra = lectura.nextLine();

        HashMap<Character,Integer> dictOfVocals = new HashMap<>();
        dictOfVocals.put('a',0);
        dictOfVocals.put('e',0);
        dictOfVocals.put('i',0);
        dictOfVocals.put('o',0);
        dictOfVocals.put('u',0);

        for (var i = 0; i <= palabra.length()-1;i++){

            char character = palabra.charAt(i);

            if (dictOfVocals.containsKey(character)){
                dictOfVocals.put(character,dictOfVocals.get(character) + 1);
            }
        }

        System.out.println("a: "+ dictOfVocals.get('a')+",e: "+dictOfVocals.get('e')+",i: "+dictOfVocals.get('i')+",o: "+dictOfVocals.get('o')+",u: "+dictOfVocals.get('u'));

    }
}
