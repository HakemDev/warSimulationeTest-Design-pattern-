package country.Cohesion;
import ObjectClass.Country;
import country.Factory.ConcreteCreator;
import country.Factory.CountryProduct;
import country.composit.Country_Composite;

import java.util.List;

public class AddCountry {
    //create instance of concretecreator class to create ConcreteCountryProduct
    ConcreteCreator concreteCreator=new ConcreteCreator();
    CountryProduct country1=concreteCreator.country();
    //creat instance of country composite to add country to list of countries of kingdom
    Country_Composite country_composite=new Country_Composite();

    public List<Country> countryList(String CountryName,int ...Nbr){
        //cal creatcountry method to create  one country
        Country country= country1.CreatCountry(CountryName,Nbr);
        //add this country to list of countries
        return country_composite.ListCountry(country);

    }

}
