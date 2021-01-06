public class StringManipulatorTest{
    public static void main(String[] args){
        StringManipulator test = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        System.out.println(test.trimAndConcat("    Hello     ","     World    "));
        System.out.println(test.getIndexOrNull(word, subString));
        System.out.println(test.concatSubstring("Hello", 1, 2, "world"));
    }
}
