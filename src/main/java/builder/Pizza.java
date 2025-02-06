package builder;

/**
 * Product class
 */
public class Pizza {
    // Product class

        private String crust;
        private String cheese;
        private boolean olives;
        private boolean mushrooms;
        private boolean jalapenos;
        private boolean extraCheese;

        // Private constructor to enforce object creation via Builder
        private Pizza(PizzaBuilder builder) {
            this.crust = builder.crust;
            this.cheese = builder.cheese;
            this.olives = builder.olives;
            this.mushrooms = builder.mushrooms;
            this.jalapenos = builder.jalapenos;
            this.extraCheese = builder.extraCheese;
        }

        @Override
        public String toString() {
            return "Pizza [crust=" + crust + ", cheese=" + cheese + ", olives=" + olives +
                    ", mushrooms=" + mushrooms + ", jalapenos=" + jalapenos + ", extraCheese=" + extraCheese + "]";
        }

        // Builder Class
        public static class PizzaBuilder {
            private String crust;
            private String cheese;
            private boolean olives;
            private boolean mushrooms;
            private boolean jalapenos;
            private boolean extraCheese;

            public PizzaBuilder(String crust, String cheese) { // Mandatory fields
                this.crust = crust;
                this.cheese = cheese;
            }

            public PizzaBuilder addOlives() {
                this.olives = true;
                return this;
            }

            public PizzaBuilder addMushrooms() {
                this.mushrooms = true;
                return this;
            }

            public PizzaBuilder addJalapenos() {
                this.jalapenos = true;
                return this;
            }

            public PizzaBuilder addExtraCheese() {
                this.extraCheese = true;
                return this;
            }

            public Pizza build() {
                return new Pizza(this);
            }
        }
    }

