import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Writfile {
    public static void  main(String[] args){
      // How to write a file using java(4 popular methods)
      // FileWriter = good for small and medium size text files
      // BufferedWriter = better performance for large amount of text
      // PrintWriter = best for structured data,like reports or logs
      // FileOutputStream = best for binary files (like images,videos,audios etc)
        String FilePath="D:\\myfirstproject\\src\\text.txt";
        String textContent= """
                I am Sandeep Varma
                I persuing my btech at brilliant group of institutions
                I am a passinate learner
                I like coding
                """;
        try(FileWriter writer=new FileWriter(FilePath)) {
            writer.write(textContent);
            System.out.println("file has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("could not locate your file location");
        }
        catch (IOException e){
            System.out.println("could not write file");
        }

    }
}
