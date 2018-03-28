public class Human {

    boolean walking; // при создании, если значение не задано значение по умолчанию false;
    String name;    // ... null
    int age;    // ... 0
    Animal animal;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Human ivan = new Human("Ivan", 23);
//        Human numan2 = new Human();
//        Human numan3 = human2;
          ivan.walk();
          ivan.walk();
          ivan.setName("Ivan");
          Animal cat = new Animal("Barsik", "siamskaya");
          ivan.addPet(cat);

        System.out.println(ivan.getName()); // свойства лучше делать приватными,
        // чтобы они могли использоваться только внутри конкретного класса и использовать getName и setName
        //System.out.println(ivan.getAge());

        System.out.println("Имя кошки " + ivan.animal.name);

        Human masha = new Human("Masha", 25);
        masha.setName("Masha");
        masha.walk();
        System.out.println(masha.getName());
    }

    public void walk(){
        if(!walking) {
            System.out.println("walking...");
            walking = true;

        }else{
            System.out.println("Already walking...");
        }
    }

    public void addPet(Animal animal){
        this.animal = animal;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void stop(){
        if(walking) {
            System.out.println("stop...");
            walking = false;
        }else{
            System.out.println("Already stoped");
        }
    }


//    public Integer getAge(){
//        return int age;
//    }

}

class Animal{
   // public Animal(String name, String ){
    String name;
    String type;
    int Age;

    public Animal(String name, String type){
        this.name = name;
        this.type = type;
    }
}