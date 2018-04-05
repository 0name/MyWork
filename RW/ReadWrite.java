package RW;


public class ReadWrite {
    public ReadWrite getInstance(String extension) {

        if (extension.endsWith(".xml")) {
                return new XmlHandler().getInstance(extension);
        }

        if (extension.endsWith(".json")) {
                return new JsonHandler().getInstance(extension);
        }
        return new ReadWrite();
    }

    public static void main(String[] args) {

        ReadWrite xml = new ReadWrite();
        xml.getInstance("dsdfdsf.xml");

        ReadWrite json = new ReadWrite();
        xml.getInstance("dsdfddsasf.json");



//        handler.read();
//        handler.write();
    }
}
