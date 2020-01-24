public class Person {
    private String name;
    private int age;
    private int height;
    private int stamina;

    public Person(String name, int age, int height, int stamina) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.stamina = stamina;
    }

    public Person(String alexandru, int i, int i1) {
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
    stamina--;
}
public void sleep() {
    stamina +=12;
}

public boolean isMajor(){
    return age >= 18;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
}
