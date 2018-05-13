package Homework8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Commands {
    public static ArrayList<File> listOfFiles2;

    public static ArrayList<File> getListOfFiles2() {
        return listOfFiles2;
    }

    public static File creatingNewFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сейчас будет создан текстовый файл \nВведите название файла(без расширения): ");
        String nameOfFile = scanner.next();

        String fileSeporator = System.getProperty("file.separator"); // разделитель пути в текущей ОС
        String absoluteFilePath = "Homework8" + fileSeporator + nameOfFile + ".txt"; // scanner;

        File file = new File(absoluteFilePath);
        if (file.createNewFile()) {
            System.out.println(absoluteFilePath + " файл создан");
        } else {
            System.out.println("Файл " + absoluteFilePath + " уже существует");
        }
        return file;
    }

    // пишем в файл с помощью Files
    static void writeUsingFiles(File file) {
        System.out.println("Созданный файл пуст\nЗапишите что-нибудь в файл.");
        Scanner scanner = new Scanner(System.in);
        String information = scanner.nextLine();
        try {
            Files.write(Paths.get(file.getPath()), information.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    Используем потоки для копирования файла
    static void copyingFile(File source) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try{
            input = new FileInputStream(source);
            File newFile = new File(source.getPath() + ".копия");
            output = new FileOutputStream(newFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = input.read(buffer))>0){
                output.write(buffer, 0, length);
            }
        } finally {
            input.close();
            output.close();
        }
    }

/*    // простой и удобный метод копирования файла начиная с Java 7
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }*/

// разбить файл
    public static ArrayList splitFile(File file) throws IOException{

        //ArrayList listOfFiles = new ArrayList();
        listOfFiles2 = new ArrayList();
        int partCount = 1;
        System.out.println("Введите размер файлов");
        Scanner scan = new Scanner(System.in);
        int sizeOfFiles = Integer.parseInt(scan.next());
        byte[] buffer = new byte[sizeOfFiles];
        String fileName = file.getName();
        FileInputStream fis = new FileInputStream(file);

        try( BufferedInputStream bis = new BufferedInputStream(fis)){

            int bytesAmount = 0;
            while((bytesAmount = bis.read(buffer)) > 0) {
                String filePartName = String.format("%s.%03d", fileName, partCount++);
                File newFile = new File(file.getParent(), filePartName);
                listOfFiles2.add(newFile);                 //
                try (FileOutputStream out = new FileOutputStream(newFile)){
                    out.write(buffer, 0, bytesAmount);
                }
            }
            System.out.println(listOfFiles2) ;
        }
        return listOfFiles2;
    }

// склеить файл
    public static void mergeFiles(List<File> files) throws IOException {

        File newFile = new File("Homework8/merged.txt");
        try (FileOutputStream fos = new FileOutputStream(newFile);
             BufferedOutputStream mergingStream = new BufferedOutputStream(fos)) {
            for (File f : files) {
                Files.copy(f.toPath(), mergingStream);
            }
        }
    }

//    a) Зашифровать/ дешифровать файл паролем (XOR)
    public static void encription(File ref) throws IOException {
        System.out.println("Зашифруем исходный файл паролем");
        System.out.println("Введите пароль:");
        Scanner sc = new Scanner(System.in);
        String pswrd = sc.nextLine();

        try (InputStream in = new FileInputStream((ref));
            ByteArrayOutputStream bout = new ByteArrayOutputStream()){

            }

//        byte [] txt = pText.getBytes();
//        byte [] key = pswrd.getBytes();
//        byte [] res = new byte[pText.length()];
//
//        for (int i = 0; i < txt.length; i++){
//            res[i] = (byte) (txt[i] ^ key [i % key.length]);
//        }

    }

    public static void decryption(){
        System.out.println("Расшифруем файл");
    }
}
