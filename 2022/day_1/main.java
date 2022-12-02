import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {

        BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("./2022/day_1/input.txt"));
            String line;
            ArrayList<Integer> totalList = new ArrayList<>();
            while((line = reader.readLine()) != null) {
                if (line.length() > 0) {
                    int value = Integer.parseInt(line);
                    int size = totalList.size();
                    if(size > 0)  {
                        totalList.set(size-1,value+totalList.get(size-1));
                    } else {
                        totalList.add(value);
                    }
                } else{
                    totalList.add(0);
                }
            }
            System.out.println("############################");
			System.out.println(Collections.max(totalList));
            System.out.println("############################");
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    
    }
}