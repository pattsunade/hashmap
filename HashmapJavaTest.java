import java.util.HashMap;
public class HashmapJavaTest {
    
    public static void main(String[] args) {
   
    HashMap<Integer, String> trackList = new HashMap<Integer, String>();
        trackList.put(1, "Todo de ti");
        trackList.put(2, "Dakiti");
        trackList.put(3, "Todo de ti");
        trackList.put(4, "La dificil");
        
        System.out.println(trackList.get(2));
        System.out.println(trackList);
        
  }
    
}
