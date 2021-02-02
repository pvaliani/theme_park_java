package behaviours;

import people.Visitor;

public interface IReviewed {

    double defaultPrice();

    double priceFor(Visitor  visitor);
}
