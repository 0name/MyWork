package reflection.annotation;

import reflection.TestClass;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ParceAnnotation {
    public static void main(String[] args) throws NoSuchFieldException {
        Class aclass = TestClass.class;

        Field field = aclass.getDeclaredField("strData");

        UserAnnotation userAnnotation = field.getAnnotation(UserAnnotation.class);

        // getAnnotationa();
        // @UserAnnotation(author = "not me")

        System.out.println("author " + userAnnotation.author());
    }
}
