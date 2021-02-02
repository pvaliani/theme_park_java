package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor == null){
            return 0.00;
        }
        if(visitor.getHeight() > 200){
            return (defaultPrice() * 2);
        }
        else{
            return defaultPrice();
        }
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getHeight() > 145 && visitor.getAge() >=12){
            return true;
        }else{
            return false;
        }

    }


}
