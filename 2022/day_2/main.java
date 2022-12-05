import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("./2022/day_2/input.txt"));
            String line;
            int res=0;
            while((line = reader.readLine()) != null) {
                res += action.getResult(line.charAt(0), line.charAt(2));
            }
            System.out.println("############################");
            System.out.println(res);
            System.out.println("############################");

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}