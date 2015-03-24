package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/21/15.
 */
public class uniqueCharacters {

    public static String uniqueCharacters(String s){
        s =s.toLowerCase();
        String s2="";
        for(int i=0; i<s.length(); ++i) {
            char c = s.charAt(i);
            int code = (int) c;

            String codes = Integer.toString(code);
            //codes += codes;
            codes =codes + ", ";
            System.out.print(codes);

                s2 += c;
        }

        return s2;
    }


    public static void main(String[] args) {

        System.out.println(uniqueCharacters("hello"));
    }

}
