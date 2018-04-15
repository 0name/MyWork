package Homework5.Interface;

class JsonHandler implements Handler {

    @Override
    public void read() {
        System.out.println("Reading Json");
    }
    @Override
    public void write() {
        System.out.println("Writing Json");
    }
}
