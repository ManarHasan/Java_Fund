public class StringManipulator{
    public String trimAndConcat(String a, String b){
        String str1 = a.trim();
        String str2 = b.trim();
        String c = str1.concat(str2);
        return c;
    }
    public String getIndexOrNull(String a, String b){
        int c = a.indexOf(b);
        if(c > 0){
            return Integer.toString(c);
        }
        else{
            return null;
        }
    }
    public String concatSubstring(String a, int start, int end, String b){
        String substr = a.substring(start, end);
        String str = substr.concat(b);
        return str;
    }
}