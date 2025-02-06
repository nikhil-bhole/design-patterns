package patterns.builder;

public class PizzaBuilderExample {

    public static void main(String[] args) {
        Pizza myPizza = new Pizza.PizzaBuilder("Thin Crust", "Mozzarella")
                .addOlives()
                .addMushrooms()
                .addExtraCheese()
                .build();

        System.out.println(myPizza);
    }
}
