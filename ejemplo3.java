
import java.util.HashMap;

public class ejemplo3 {

    public static void main(String[] args) {

        HashMap<String, String> ciudadesCapitales = new HashMap<String, String>();
        ciudadesCapitales.put("España", "Madrid");
        ciudadesCapitales.put("Francia", "París");
        ciudadesCapitales.put("Italia", "Roma");

        System.out.println("Capital de España: " + ciudadesCapitales.get("España"));
        System.out.println("Capital de Francia: " + ciudadesCapitales.size());
       
    }
    
}
