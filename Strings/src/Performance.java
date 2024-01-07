public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch; // series += ch this will run too much and will take too much time so we use STRINGBUILDER
        }

        System.out.println(series);
    }
}
