package reflection.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // сообщает к каким элементам программы будет применяться моя аннотация
@Retention(RetentionPolicy.RUNTIME) // говорит как долго будут храниться аннотация

public @interface UserAnnotation {
//      @Override
//      @Deprecated

    String author() default "Me";
}
