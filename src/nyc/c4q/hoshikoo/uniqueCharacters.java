package nyc.c4q.hoshikoo;
import java.util.ArrayList;
/**
 * Created by Hoshiko on 3/21/15.
 */
public class uniqueCharacters {

    public static String uniqueCharacters(String s){
        ArrayList letters = new ArrayList();
        s =s.toLowerCase();
        String s2="";
        for(int i=0; i<s.length(); ++i) {
            char c = s.charAt(i);

            if (letters.contains(c)){

            }else{
                letters.add(c);
                s2 += c;
            }
        }

        return s2;
    }


    public static void main(String[] args) {

        System.out.println(uniqueCharacters("hello"));
        System.out.println(uniqueCharacters("abbcaabcaa"));
        System.out.println(uniqueCharacters("microsoft"));

    }

}
