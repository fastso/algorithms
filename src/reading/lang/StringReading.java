package reading.lang;

public class StringReading {
    public static void main(String... args) {
        String s1 = "sample";
        String s2 = new String("sample");
        String s3 = s1;

        System.out.println(s1.getClass());
        System.out.println("s1 | s2 | s3");
        System.out.println(s1.hashCode() + " | " + s2.hashCode() + " | " + s3.hashCode());
        System.out.println(s1.toString()+ " | " + s2.toString() + " | " + s3.toString());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
