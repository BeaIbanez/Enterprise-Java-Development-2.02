public class HelloClas {

    public static void main(String[] args) {

        Animal lion = new Animal("Leon",4,"marron");
        Animal penguin = new Animal("Pinguino",2,"blanco y negro");

        System.out.println(
                """
                Name: %s
                NumeroPatas: %s
                Color: %s
                """.formatted(lion.getName(),lion.getNumeroPatas(),lion.getColor())
        );
        System.out.println(
                """
                Name: %s
                NumeroPatas: %s
                Color: %s
                """.formatted(penguin.getName(),penguin.getNumeroPatas(),penguin.getColor())
        );



        if(lion.equals("penguin")){
            System.out.println("They are equals.");
        }else {
            System.out.println("They are differents animals.");
        }

    }
}