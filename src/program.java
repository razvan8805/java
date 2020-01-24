public class program {
    public static void main(String[] args) {
        Person Alex = new Person();
        Alex.name = "Alexandru";
        Alex.age = 20;
        Alex.height = 175;
        Alex.age++;
        Alex.age++;
        Alex.stamina = 10;
        System.out.println(Alex.name + " are " + Alex.age + " de ani ");
        Alex.run();
        Alex.run();
        Alex.run();
        System.out.println(Alex.name + " are energia " + Alex.stamina );
        Alex.sleep();
        System.out.println(Alex.name + " are energia " + Alex.stamina );

        if (Alex.isMajor()) {
            System.out.println(Alex.name + " drinks beer");
        }
    }
}
