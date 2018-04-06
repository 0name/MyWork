package RW;

public abstract class ReadWrite {
    static ReadWrite getInstance(String file) {

// стало вместо if if
        if (file.endsWith("file_name1.xml")) {
        return new XmlHandler();
        }
        return new JsonHandler();
    }

    public void Read(ReadWrite file){

    }

    public void Write(ReadWrite file){

    }

    public static void main(String[] args) {

//        ReadWrite xml = new ReadWrite();
        ReadWrite readWrite = ReadWrite.getInstance("dsdfdsf.xml");
//        ReadWrite.read();
//        ReadWrite.write();
    }
}


//    getInstanse только у родителя, это фабрика, которая создает необходимые объекты
//        имя файла можно передать в конструкторе
//        getInstanse лучше сделать static, не создавать экземпляр ConfHandler
//
//        лучше сделать абстрактным родителя или интерфейсом и задать методы read() и write(),
//        чтобы в дочерних классах уже была конкретная реализация
//

//
//        можно будет проверять тип файла на допустимые, отдельным методом, и вслучае ошибки, выводить информацю об этом
//
//        плюс проверка файла должна быть