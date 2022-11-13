package country.Factory;
import ObjectClass.Country;

public class ConcreteCountryProduct implements CountryProduct{

    @Override
    public Country CreatCountry(String NameCountry, int... Nbr) {
        Country country=new Country();
        country.setName_country(NameCountry);
        for(int i=0;i<Nbr.length;i+=2){
            country.setNbrOfSoldierInCity(Nbr[i]);
            country.setNbrOfCitizenInCity(Nbr[i+1]);
        }
        return country;
    }
}
