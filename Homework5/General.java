package Homework5;

public abstract class General {

    static Handler getInstance(String file) {

// стало вместо if if
        if (file.endsWith(".xml")) {
        return new XmlHandler();
        }
        return new JsonHandler();
    }

    public static void main(String[] args) {

        getInstance("dsdfdsf.xml").write(); // допустим создается новый файл Xml
        getInstance("dsdfdsf.json").read();
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