package Travel;

public class Travelrunner {
    public static void main(String[]args){
        int num = 0;
        Travel n = new Travel(6);
        while(num <= 21){
            int v = n.goByVan();
            int c = n.goByCanoe();
            int p = n.goByPlane();
        }
        System.out.println("people = " + n + "vans = " + v + "canoes = " + c + "planes = " + p);
}
}