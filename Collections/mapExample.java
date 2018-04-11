package Collections;

import java.util.*;

public class mapExample {
// interface Map
//    В контейнерах Map хранятся 2 ОБЪЕКТА!: ключ и значение
//    Ключи должны быть уникальны, зачения могут дублироваться
//    Существует возможность искать объекты по ключу

//    interface SortedMap - элементы размещаются по возрастанию ключей
//    interface NavigableMap - расширяет SortedMap
//    Map.Entry позволяет работать c элементами Map

//    HashMap - структура данных для хранения пары ключ - значение,
//    Ключи и значения могут быть любого типа, даже null
//    Нет гарантий относительно неизменности порядка элементов.
//    Разрешение коллизий осуществляется методом цепочек

//   TreeMap коллекция с отсортированными ключами
//   LinkedMap - запоминается порядок, в котором добавлялись элементы
//   WeakHashMap - значения могут удаляться сборщиком мусора, если они не используются
//    IdentityHashMap - ключи сравниваются с помощью ==, вместо equals

//    interface Map<K, V>

//    void clear() - удаляет все пары ключ - значение
//    boolean containsKey(Object key);
//    boolean containsValue(Object val)
//    boolean equals(Object obj) - сравнивает по значению
//        true, если obj - это map, который содержит одинаковые значения
//    boolean isEmpty()
//    put(key, val)
//    putAll();
//    remove(key)
//    int size();
//    get(key) - по указанному ключу возвращает значение

//    Интерфейс map предоставляет три способа для доступа к данным, используя:
//    set  из ключей (метод getKey)
//    коллекцию из значений (метод getValues)
//    set из пары ключ - значение (entrySet)

//    for (Map.Entry entry: mapName.entrySet()){
//        System.out.println(entry.getKey() + " : " + entry.getValue());
    final static Map<Integer, String> finalMap = new LinkedHashMap<>(1);

    public static void main(String[] args){

        finalMap.put(90, "90val");
        finalMap.put(777, "90val");
        Map<Integer, String> newMap = Collections.unmodifiableMap(finalMap); // неизменяемый Map
       // newMap.put(45, "977");

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("key", "value");
        hashMap.put("key1", "value");
        System.out.println(hashMap.get("key1"));
        for (Map.Entry entry: hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

//        TreeMap - для хранения элементов применяет красное-черное дерево
//        Объекты сохраняются в отсортированном порядке: ключи по возрастанию

//        TreeMap ();       /
//        TreeMap(Comparator comp)  // в скобках наше название hashMap
//        TreeMap(Map m)
//        TreeMap(SortedMap sortm)

//        class CustComp implements Comparable {
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }

//        LinkedHashMap - расширяет HashMap. Элементы в том порядке, как и добавлялись друг за другом
        Map<String, String> lnkMap = new LinkedHashMap<>();
        lnkMap.put("333", "value1");
        lnkMap.put("key1", "value3");
        lnkMap.put("null", "value4");
        System.out.println(lnkMap.get("key1"));
        for (Map.Entry entry: lnkMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
