# pizza_khana_hai

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Pizza {
 
    private float totalPrice = 0;
 
    private Size size;
    private Topping topping;
    private Crust crust;
    private Cheese cheese;
 
    public Size getSize() {
        return size;
    }
 
    public void setSize(Size size) {
        this.size = size;
    }
 
    public Topping getTopping() {
        return topping;
    }
 
    public void setTopping(Topping topping) {
        this.topping = topping;
    }
 
    public Crust getCrust() {
        return crust;
    }
 
    public void setCrust(Crust crust) {
        this.crust = crust;
    }
 
    public Cheese getCheese() {
        return cheese;
    }
 
    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }
 
    public float getTotalPrice() {
        return totalPrice;
    }
 
    public void addToPrice(float price) {
        this.totalPrice = totalPrice + price;
    }
}


class PizzaBuilder {
 
    Pizza pizza = new Pizza();
 
    public PizzaBuilder withTopping(Topping topping) {
        pizza.setTopping(topping);
        pizza.addToPrice(topping.getCost());
        return this;
    }
 
    public PizzaBuilder withSize(Size size) {
        pizza.setSize(size);
        pizza.addToPrice(size.getCost());
        return this;
    }
 
    public PizzaBuilder withCrust(Crust crust) {
        pizza.setCrust(crust);
        pizza.addToPrice(crust.getCost());
        return this;
    }
 
    public Pizza build() {
        return pizza;
    }
 
    public double calculatePrice() {
        return pizza.getTotalPrice();
    }
 
}

enum Cheese {
    AMERICAN {
        public float getCost() {
            return 40;
        }
    }, ITALIAN {
        public float getCost() {
            return 60;
        }
    };
 
    public abstract float getCost();
 
}
 
 enum Crust {
 
      THIN  {
        public float getCost(){
            return 70;
        }
    } , STUFFED{
        public float getCost(){
            return 90;
        }
    };
 
    public abstract float getCost();
}
 
 enum Size {
    MEDIUM {
        public float getCost() {
            return 100;
        }
    }, LARGE {
        public float getCost() {
            return 160;
        }
    };
 
    public abstract float getCost();
}
 
 enum Topping {
 
    PEPPERONI {
        public float getCost(){
            return 30;
        }
    }, CHICKEN{
        public float getCost(){
            return 35;
        }
    }, MUSHROOM{
        public float getCost(){
            return 20;
        }
    };
 
    public abstract float getCost();
}


public class Main
{
	public static void main(String[] args) {
		Pizza pizza = new PizzaBuilder().withCrust(Crust.THIN).withTopping(Topping.CHICKEN).withSize(Size.LARGE).build();
		System.out.println(pizza.getTotalPrice());
	}
}
