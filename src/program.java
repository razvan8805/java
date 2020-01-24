public class program {
    public static void main(String[] args) {
        Person Alex = new Person("Alexandru",20,175 );


        System.out.println(Alex.getName() + " are " + Alex.getAge()+ " de ani ");

        Alex.run();
        Alex.run();
        Alex.run();
        System.out.println(Alex.getName() + " are energia " + Alex.getStamina() );
        Alex.sleep();
        System.out.println(Alex.getName() + " are energia " + Alex.getStamina() );

        if (Alex.isMajor()) {
            System.out.println(Alex.getName() + " drinks beer");
        }
    }
}
