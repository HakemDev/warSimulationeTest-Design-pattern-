package ObjectClass;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name_country;
    private List<Integer> ListNbrOfSoldierInCities=new ArrayList<>();
    private List<Integer> ListNbrOfCitizenInCities=new ArrayList<>();
    private int NbrOfSoldierOnEdges;

    public String getName_country() {
        return name_country;
    }

    public void setName_country(String name_country) {
        this.name_country = name_country;
    }

    public List<Integer> getListNbrOfSoldierInCities() {
        return ListNbrOfSoldierInCities;
    }

    public void setNbrOfSoldierInCity(int NbrOfSoldierInCity) {
        ListNbrOfSoldierInCities.add(NbrOfSoldierInCity);
    }

    public List<Integer> getListNbrOfCitizenInCities() {
        return ListNbrOfCitizenInCities;
    }

    public void setNbrOfCitizenInCity(int NbrOfCitizenInCity) {
        ListNbrOfCitizenInCities.add(NbrOfCitizenInCity);
    }

    public int getNbrOfSoldierOnEdges() {
        return NbrOfSoldierOnEdges;
    }

    public void setNbrOfSoldierOnEdges(int nbrOfSoldierOnEdges) {
        NbrOfSoldierOnEdges = nbrOfSoldierOnEdges;
    }
}
