package country.composit;
import ObjectClass.Country;

import java.util.ArrayList;
import java.util.List;

public class Country_Composite implements CountryComponent{

    private List<Country> countryList=new ArrayList<Country>();
    @Override
    public String report() {
        return null;
    }

    public List<Country> ListCountry(Country country){
        countryList.add(country);
        return  countryList;
    }
}
