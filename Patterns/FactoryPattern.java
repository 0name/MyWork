package Patterns;

interface Handler{
    void read();
    void write();
}

class JsonHandler implements Handler{

    @Override
    public void read() {
    }
    @Override
    public void write() {
    }
}
class XmlHandler implements Handler{

    @Override
    public void read() {
    }
    @Override
    public void write() {
    }
}

class FactoryPattern {
    public Handler getChild(String str){
        if (str.equals("file_name1.xml")) {
            return new JsonHandler();
        } else {
            return new XmlHandler();
        }
    }

    public void someVoid(){
        FactoryPattern factoryPattehn = new FactoryPattern();
        Handler handler = factoryPattehn.getChild("config.jsonh");
        handler.read();
        handler.write();
    }
//    Определяет интерфейс для создвния, но оставляет подкласам решение о том, какой класс инстанцировать.
//    Фабричный метод позволяет классу делегировать создание подкласса.

//    Используется, когда:
//    - классу заранее неизвестно , объекты каких подклассов ему нужно создать
//    - класс спроектирован так, чтобы обхекты, которые он создает специфицировались подклассами
//    - класс делегирует свои обяханости оддному из нескольких вспомогательных
//    подклассов, и планируется локализовать знание о том, какой класс принимает на себя эти обязанности


}
