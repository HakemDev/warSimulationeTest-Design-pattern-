package country.Cohesion;

import ObjectClass.Country;

import java.util.List;

public class CurrentPower {
    int TotalSoldier=0;
    public int NbrSoldier(List<Country> countryList){
        for(int i=0;i<countryList.size();i++){
            for(int j=0;j<countryList.get(i).getListNbrOfSoldierInCities().size();j++){
                    TotalSoldier+=countryList.get(i).getListNbrOfSoldierInCities().get(j);
            }
        }
        return TotalSoldier;
    }
}
