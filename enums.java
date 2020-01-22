public enum Cheese {
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
 
public enum Crust {
 
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
 
public enum Size {
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
 
public enum Topping {
 
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