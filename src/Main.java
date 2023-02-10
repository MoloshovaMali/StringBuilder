import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Song song = new Song();
        FileWriter fileWriter = new FileWriter("song");
        StringBuilder stringBuilder=new StringBuilder();
        fileWriter.write("Metallica\n");
        fileWriter.write("Nothing else matters\n");
        fileWriter.write("So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I do\n" +
                "n't just say\n" +
                "And nothing else matters");
        fileWriter.close();

        FileReader fileReader = new FileReader("song");
        Scanner sc = new Scanner(fileReader);
        song.setAuthor(sc.nextLine());
        song.setTitle(sc.nextLine());
        while (sc.hasNextLine()) {
            stringBuilder.append(sc.nextLine()+"\n");
        }
        song.setText(stringBuilder.toString());
        fileReader.close();
        System.out.println(song);
    }
}