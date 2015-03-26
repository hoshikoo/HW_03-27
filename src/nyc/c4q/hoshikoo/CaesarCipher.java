package nyc.c4q.hoshikoo;

import java.util.Scanner;
import java.util.ArrayList;
/**
 * Class for Encoding and Decoding CaesarCiphers
 */
public class CaesarCipher {

    public static String decode(String enc, int offset) {
        return encode(enc, 26-offset);
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }


    public static boolean codeBreaker(String a, String b) {
        //ArrayList<int> codeNums = new ArrayList();
        //ArrayList<int> codeNumsTwo = new ArrayList();

        // check string a and b length are the same

        if (a.length() == b.length()){
            //check the 1st letters of each strings and use it as a condition
            char ca = a.charAt(0);
            int codea = (int)ca;
            System.out.println(ca);
            char cb = b.charAt(0);
            int codeb = (int)cb;
            System.out.println(cb);
            int difference = codea-codeb; //TODO  need to add if the differentce is negative ad 26
            if (difference <0){
                difference = difference+26;
            }
            System.out.println(difference);

            //loop only 1 time since string a and b are the same length
            for (int i =1; i< a.length();i++){
                ca = a.charAt(i);
                System.out.println(ca);
                codea = (int)ca;
                System.out.println(codea);
                cb = b.charAt(i);
                System.out.println(cb);
                codeb = (int)cb;

                System.out.println(codeb);

                int differenceinloop = codea-codeb;
                if (differenceinloop <0){
                    differenceinloop = differenceinloop+26;
                }
                if (differenceinloop==difference){
                   // System.out.println(codea-codeb);
                    continue;
                }else{
                    //inside of loop if any time the difference became different from the first letters of 2 string, break loop
                    return false;
                }
            }
            return true;

        }else{
            return false;
        }

    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to encode");

        String input = sc.nextLine();
        String encoded = CaesarCipher.encode(input, 25);
        System.out.println(encoded);

        String decoded = CaesarCipher.decode(encoded, 25);
        System.out.println(decoded);

        encoded = CaesarCipher.encode(input, 3);
        System.out.println(encoded);
        decoded = CaesarCipher.decode(encoded, 3);
        System.out.println(decoded);

        //System.out.println(codeBreaker("bzq", "fdu")); //true
        //System.out.println(codeBreaker("car", "mkd")); //false
        System.out.println(codeBreaker("abc", "efg")); //true
    }
}
