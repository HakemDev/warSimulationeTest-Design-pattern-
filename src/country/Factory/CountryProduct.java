package country.Factory;
import ObjectClass.Country;

public interface CountryProduct {
    public Country CreatCountry(String NameCountry,int ...Nbr);
}
