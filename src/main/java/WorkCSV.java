import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WorkCSV {
    public static void main(String[] args){
        write();
        read();
    }

    public String[] header;
    public int[][] data;

    public static void write() {
        try (FileWriter writer = new FileWriter("File.csv", false)) {
            String[] header = new String[3];
            header[0] = "Value1";
            header[1] = "Value2";
            header[2] = "Value3";

            writer.write(Arrays.toString(header) + "\n");

            int[][] data = {{100, 200, 123},{300, 400, 500}};
            for (int[] datum : data) {
                for (int j = 0; j <= data.length; j++) {
                    writer.write(datum[j] + ";" + " ");
                }
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void read(){
        try(FileReader reader = new FileReader("File.csv")) {
            int c;
            while ((c = reader.read()) != -1){
                if (c == ','){
                    c = ';';
                }
            } System.out.println((char) c);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
