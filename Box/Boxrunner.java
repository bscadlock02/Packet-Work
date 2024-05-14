package Box;

public class Boxrunner {
    public static void main(String[]args){
        Box bob = new Box(3);
        int v = bob.getVolume();
        System.out.println(v+"cu.in.");
        
        Box ann - new Box(4);
        v=ann.getVolume();
        System.out.println(v+"cu.in.");

        ann.change(2);
        v=ann.getVolume();
        System.out.println(v+"cu.in.");
}
}