import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Map<String, String> croatiaMap = new LinkedHashMap<>();
        croatiaMap.put("dz=", "*");
        croatiaMap.put("c=", "*");
        croatiaMap.put("c-", "*");
        croatiaMap.put("d-", "*");
        croatiaMap.put("lj", "*");
        croatiaMap.put("nj", "*");
        croatiaMap.put("s=", "*");
        croatiaMap.put("z=", "*");

        String[] keys = croatiaMap.keySet().toArray(new String[0]);

        for (int i = 0; i < keys.length; i++) {
            String key = keys[i];               
            String value = croatiaMap.get(key);   
            input = input.replace(key, value);    
        }

        System.out.println(input.length());
    }
}
