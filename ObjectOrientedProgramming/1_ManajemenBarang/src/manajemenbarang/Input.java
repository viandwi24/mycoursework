package manajemenbarang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author viandwi24
 */
public class Input {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public String get(String text) {
        String input;
        System.out.print(text);
        try {
            input = this.br.readLine();
        } catch (IOException exception) {
            input = null;
        }
        return input;
    }
    
    public Integer getInt(String text) {
        String value = this.get(text);
        return Integer.parseInt(value);
    }
    
    public Double getDouble(String text) {
        String value = this.get(text);
        return Double.parseDouble(value);
    }
}
