public class SkipChar {
    public static void main(String[] args) {
        skip("", "abcda");
        System.out.println(skipInplace("abcdabcdabcdabcd"));
        System.out.println(skipBanana("abcdbananaabcd"));
        System.out.println(skipBanaNotBanana("abcdbanaabcdbananaabcd"));
    }
    static void skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }



    static String skipInplace(String up){
        if (up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            return skipInplace(up.substring(1));
        }
        else{
            return ch + skipInplace(up.substring(1));
        }
    }


    static String skipBanana(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("banana")){
            return skipBanana(up.substring(6));
        }
        else{
            return up.charAt(0) + skipBanana(up.substring(1));
        }
    }


    static String skipBanaNotBanana(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("bana") && !up.startsWith("banana")){
            return skipBanaNotBanana(up.substring(4));
        }
        else{
            return up.charAt(0) + skipBanaNotBanana(up.substring(1));
        }
    }
}
