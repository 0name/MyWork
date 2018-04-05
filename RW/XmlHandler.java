package RW;

public class XmlHandler extends ReadWrite {

    @Override
    public ReadWrite getInstance(String extension) {
        System.out.println("Файл Xml");
        return new XmlHandler(); // аналогично, что и с родительским калссом
    }
}
