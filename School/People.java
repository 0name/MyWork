package School;

public class People {
    String name;
    int age;
    String status; // учитель ученик или директор

public People (String name, int age, String status ){       // конструктор
    this.name = name;
    this.age = age;
    this.status = status;
}

// Методы
    public String getName(){
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introducing(){
    System.out.println("Hello. My name is " + name + "\nI am " + age + " years old. I'm a " + status );
    }

    public void goToSchool (){
    System.out.println("Today I go to school ");
    }

    public void missSchool (){
        System.out.println("Today I go to school, because I'm ill ");
    }

    public void shirkSchool (){
        System.out.println("Today I shirk the school, because I didn't make my homework ");
    }

}
