package Travel;

public class Travel {
    private int people;

    public Travel( int n ){
        people = n;
    }


    public int goByVan(){
        int v = (people+(8-(people%8)))/8;
        return v;
    }
       

        public int goByCanoe(){
            int c = (people+(3-(people%3)))/3;
            return c;
        }

        public int goByPlane(){
            int p = (people+(12-(people%12)))/12;
            return p;
        }
      
}