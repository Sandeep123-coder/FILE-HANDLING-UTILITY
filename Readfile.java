import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {
    public static void main(String[] args){
        //How to read the file using java
        //BufferedReader + FileReader = best for reading text files line-by-line
        //FileInputStream = Best for binary files(like images,audios etc)
        //RandomAccessFile = Best for reading specific portions of large file

        String FilePath="D:\\myfirstproject\\src\\test.txt";

        try(BufferedReader reader=new BufferedReader(new FileReader(FilePath))){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("could not locate the file location");
        }
        catch (IOException e){
            System.out.println("something went wrong");
        }
    }
}
