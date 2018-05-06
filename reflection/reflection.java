package reflection;

import java.io.ObjectOutputStream;
import java.lang.reflect.*;
import java.util.Arrays;

public class reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        java.lang.Class
//            String className = "TestClass";
//        Class unknownClass = Class.forName(className); //
        Class unknownClass = Class.forName(args[0]); //
//        Class unknownClass = TestClass.class; //
        // TestClass
        System.out.println(unknownClass);

        // Получение имени класса
        String fullName = unknownClass.getName();
        String className = unknownClass.getSimpleName();

        System.out.println(fullName + " : " + className);

        // получение модификатора
        int classModif = unknownClass.getModifiers();
//        Modifier.isAbstract(int modifier);
//        Modifier.isFinal(int modifier);
//        Modifier.isInterface(int modifier);
//        Modifier.isNative(int modifier);
//        Modifier.isPrivate(int modifier);
//        Modifier.isPublic()int modifier);
//        Modifier.isStatic()int modifier);

        // получение информации о пакете
        Package pack = unknownClass.getPackage();
        System.out.println(pack);

        // получение суперкласса
        Class superClass = unknownClass.getSuperclass();

        // получение реализованых интерфейсов
        Class[] interfaces = unknownClass.getInterfaces(); //  интерфейсы родителей не возвр, для этого нужно обращаться через переменную superClass
        System.out.println(Arrays.toString(interfaces));

        // Получение информации о конструкторах
        Constructor[] constructors = unknownClass.getConstructors();
        System.out.println(Arrays.toString(constructors));

        // Получение параметров конструктора
        Class[] paramTypes = constructors[0].getParameterTypes();
        System.out.println(Arrays.toString(paramTypes));

        Constructor constructor = unknownClass.getConstructor(int.class, String.class);

        // Создание объектов
        Object tstObj = constructor.newInstance(21, "Object"); // объект создается только через конструктор

        // Получение атрибутов класса
        Field[] fields = unknownClass.getFields();
        Field field = unknownClass.getField("tst");

        String fieldName = field.getName();
        Object fieldType = field.getType();

        Object val = field.get(tstObj);
        System.out.println(val);
        field.set(tstObj, "Some val");

        // получение информации о методах
        Method[] methods = unknownClass.getMethods();
        Method method = unknownClass.getMethod("getStrData", null);

        // получить тип возвращаемого значения
        Class returnType = method.getReturnType();

        // вызов метода объекта
        System.out.println(method.invoke(tstObj, null));
//        method.invoke(null, params); если метод static

        // Доступ к приватным полям
        // Class.getDeclaredFields() и Class.getDeclaredField(name)
        // и методам
        Method privateMethod = unknownClass.getDeclaredMethod("callPrivate", null);
        privateMethod.setAccessible(true);
        privateMethod.invoke(tstObj, null);
        privateMethod.setAccessible(false);

    }
}
