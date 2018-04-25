package streams.io;

// символьные потоки
// Классы потоков символов наследуются от
// java.io.Reader
// java.io.Writer

import java.io.*;

// Классы для файлового ввода и вывода:
// java.io.FileReader
// java.io.FileWriter
public class CharStream {
    private void writeToFile(String str, File file) throws IOException{
        try (Writer writer = new FileWriter(file)){
            writer.write(str);
        }
    }
    private String readToStr(File file) throws IOException{
        try (Reader reader = new FileReader(file)) {
            StringBuilder sb = new StringBuilder();
            char[] buf = new char [512];
            int len;
            while((len = reader.read(buf))>0){
                sb.append(buf, 0, len);
            }
            return sb.toString();
        }
    }

// любой поток байт можно превратить в поток символов, обернув в java.io.OutputStreamReader (мост между классами и Reader)
// или в OutputStreamWriter (мост между классами OutputStream и Writer)

//    try (Reader reader = new InputStreamReader(new ByteArrayInputStream(byteArr, Charset.forName("UTF-8"))))

    private void readWithBuffer(File file){

    }
}

    public static void main(String[] args) {

}
