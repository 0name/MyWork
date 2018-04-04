//package lesson7;
//
//public class InnerLesson {
//    public static void main(String[] args) {
//        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerStatic innerStatic = new OuterClass.InnerStatic();
//        innerStatic.notStatic();
//    }
//}
//
//class OuterClass{
////    static
//    private int notStaticInt = 1;
//    private static int staticInt = 2;
//
//    public OuterClass(){
//        InnerStatic InnerStatic = new InnerStatic();
//        System.out.println(InnerStatic.innerInt);
//        InnerStatic.someVoid();
//
//        InnerClass innerClass = new InnerClass();
//        InnerClass.innerVoid();
//
//
//    }
//
//    static class InnerStatic{
//        private int innerInt = 1;
//
//        public void someVoid(){
//            staticInt++;
////            notStaticInt; имеет доступ только к статическим методам и свойствам внешнего класса
//        }
//    }
//    class InnerClass{
//        // ему доступны все методы и свойства внешнего класса
//        public void innerVoid(){
//            System.out.println(notStaticInt);
//            System.out.println(staticInt);
//        }
//        //  не может содержать статических методов и свойств
//        //  public static void staticVoid() {
//
//        }
//
//    public static void voidWithClass(){
//
//        class LocalClass(){         //
//
//            public Object localVoid
//            System.out.println(staticInt);
//            System.out.println(notStaticInt);
//            LocalClass = new LocalClass();
//            return localClass;
//        }
//    }
//
//}
//
//
//
//class ChildOuter extends OuterClass{
//    public void someVoid();{
//        static.someVoid();
//
//    }
//}