public class CompareToMethod 
{
    public static void main(String[] args) 
    {
        System.out.println("apple".compareTo("banana")); 
        // negative → apple < banana

        System.out.println("dog".compareTo("cat")); 
        // positive → dog > cat

        System.out.println("java".compareTo("java")); 
        // 0 → equal

        System.out.println("nilesh".compareTo("wankhede"));

        System.out.println("c".compareTo("a"));
    }
}
// int java.lang.String.compareTo(String anotherString)
// Compares two strings lexicographically. The comparison is based on the Unicode value ( ASCII ) of each character in the strings. The character sequence represented by this String object is compared lexicographically to the character sequence represented by the argument string. The result is a negative integer if this String object lexicographically precedes the argument string. The result is a positive integer if this String object lexicographically follows the argument string. The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.

// lexicographically means 'a' < 'b'