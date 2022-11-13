package country.composit;

import ObjectClass.Country;

public class Leef implements CountryComponent{

    Country country;
    public Leef(Country country){
        this.country=country;
    }

    @Override
    public String report() {
        return null;
    }
}
