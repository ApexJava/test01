package Day01;

public class testobject {
    public static void main(String[] args) {
        person p = new person();
        p.setAge(20);
        person p2 = new person();
        p2.setAge(20);
        System.out.println(p.equals(p2));
    }
}
