public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        ///////////////////////// trimAndConcat////////////////////////
        // String str = manipulator.trimAndConcat("Hello", "World");
        // System.out.print(str);
        /////////////////////////////// end////////////////////////////

        ////////////////////// getIndexOrNull/////////////////////////
        // char letter = 'o';
        // Integer a = manipulator.getIndexOrNull("Coding", letter);
        // Integer b = manipulator.getIndexOrNull("Hello World", letter);
        // Integer c = manipulator.getIndexOrNull("Hi", letter);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        /////////////////////////////// end////////////////////////////

        /////////////////////// getIndexOrNull2////////////////////////
        // String word = "Hello";
        // String subString = "llo";
        // String notSubString = "world";
        // Integer a = manipulator.getIndexOrNull(word, subString);
        // Integer b = manipulator.getIndexOrNull(word, notSubString);
        // System.out.println(a);
        // System.out.println(b);
        /////////////////////////////// end////////////////////////////

        ////////////////////// concatSubstring/////////////////////////
        String word = manipulator.concatSubString("Hello", 1, 2, "world");
        System.out.println(word);
        /////////////////////////////// end////////////////////////////
    }
}