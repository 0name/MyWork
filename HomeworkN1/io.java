package HomeworkN1;

import javax.imageio.stream.FileCacheImageInputStream;
import java.io.*;

//        1) Скопировать файл
//        2) Разбить/склеить файл. Размер куска задается
//        3) Посмотрите самостоятельно и попробуйте реализовать:
//        a) Зашифровать/ дешифровать файл паролем (XOR)
//        b) Зашифровать/ дешифровать файл другим файлом
public class io {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("file.txt")){
            File Directory = new File("HomeworkN1/folder");
            if(!Directory.exists()) Directory.mkdir();
            try(FileOutputStream outputStream = new FileOutputStream("HomeworkN1/folder/file.txt")){
                byte[] bytes = new byte[inputStream.available()];
                int length;

                while((length = inputStream.read(bytes)) != -1){
                    outputStream.write(bytes, 0, length );
                }
            } catch (IOException exception){
                System.out.println("Output error");
            }
        }catch (IOException exception){
            System.out.println("Input error");
        }
    }
}
