package generic;

public class GenericExample {
/**
 Подход к описанию данных и алгоритмов, который позволяет их
 использовать с различными типами данных без изменения их описания
*/

public static void main(String[] args) {
    Container cont1 = new Container("some value");
    Container cont2 = new Container(null);
    String str = (String) cont1.getItemOrDefault("Default value");
//    Integer integ = (Integer) cont2.getItemOrDefault(0);
//    Integer integ = (Integer) cont2.getItemOrDefault("Def value");// ошибка на момент компиляции

    Integer integ = (Integer) cont2.getItemOrDefault(0);
    // ошибка на момент выполнения программы
    System.out.println(str);
    System.out.println(integ);

    GenericContainer <String> gcont1 = new GenericContainer<>("Some value");
//    GenericContainer <String> gcont1 = new GenericContainer<>("Some value"); // до 7 версии нужно было указывать тип во вторых <>


//    Вариант ниже совместим со старыми версиями
    GenericContainer <String> gcont2 = new GenericContainer<>(null);
    String str1 = gcont1.getItemOrDefault("Value");
//  Integer integ1 = gcont2.getItemOrDefault("Some val"); // ошибка на момент компиляции

    Pair<String, Integer> pair = new Pair<>("key", 4);

    // Generic соблюдает правило полиморфизма.
    GenericContainer<Number> numbCont = new GenericContainer<>(null);
    Number numb = numbCont.getItemOrDefault(0);
    Number numb1 = numbCont.getItemOrDefault(0.0);
}

}
class Container{
    private Object item;
    public Container(Object item){
        this.item = item;
    }

    public Object getItemOrDefault (Object dflt){
        return item == null ? dflt : item;
    }
}

class GenericContainer<T> { // в угловых скобках указывается неизвестный тип
    private T item;

    public GenericContainer(T item) {
        this.item = item;
    }

    public T getItemOrDefault(T dflt) {
        return item == null ? dflt : item;
    }
}
//    Допускается использовать несколько generic типов

class Pair<K, V>{
    private K key;
    private V value;
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

