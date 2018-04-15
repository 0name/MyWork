package Homework5.Interface;

class XmlHandler implements Handler {

    @Override
    public void read() {
        System.out.println("Reading Xml");
    }
    @Override
    public void write() {
        System.out.println("Writing Xml");
    }
}
