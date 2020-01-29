package reading.lang;

public class ObjectReading {
    public static void main(String... args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;

        System.out.println(o1.getClass());
        System.out.println("o1 | o2 | o3");
        System.out.println(o1.hashCode() + " | " + o2.hashCode() + " | " + o3.hashCode());
        System.out.println(o1.toString()+ " | " + o2.toString() + " | " + o3.toString());
        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));
        System.out.println(o1 == o3);
        System.out.println(o1.equals(o3));
    }
}
