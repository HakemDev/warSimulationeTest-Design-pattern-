package Kingdom;
import ObjectClass.Country;
import country.Cohesion.AddCountry;
import country.Cohesion.CurrentPower;
import country.Cohesion.Report;

import java.util.ArrayList;
import java.util.List;

public class Kingdom {
    private final String KingName;
    private final List<Country> listcountry;
    private int SoldiersOnEdges;
    CurrentPower currentPower=new CurrentPower();
    Report report=new Report();

    private Kingdom(KingdomBuilder builder){

        this.KingName=builder.KingName;
        this.listcountry=builder.listcountry;
        this.SoldiersOnEdges= builder.SoldiersOnEdges;
    }

    public String getKingName() {
        return KingName;
    }

    public List<Country> getListcountry() {
        return listcountry;
    }

    public String report(){
        String phrase= report.report(this.listcountry,this.KingName);
        return phrase;
    }
    public int currentPower(){
        return currentPower.NbrSoldier(this.listcountry);
    }
    public static class KingdomBuilder{

        private String KingName;
        private List<Country> listcountry=new ArrayList<Country>();
        private int SoldiersOnEdges=0;
        AddCountry addCountryOut=new AddCountry();

        public KingdomBuilder addKing(String KingName){
            this.KingName=KingName;
            return this;
        }

        public KingdomBuilder addSoldierOnEdges(int SoldiersOnEdges){
            this.SoldiersOnEdges=SoldiersOnEdges;
            for(Country c:listcountry){
                c.setNbrOfSoldierOnEdges(SoldiersOnEdges);
            }
            return this;
        }

        public KingdomBuilder addCountry(String CountryName,int ...Nbr){
            this.listcountry=addCountryOut.countryList(CountryName,Nbr);
            return this;
        }

        public Kingdom build(){
            Kingdom kingdom=new Kingdom(this);
            return kingdom;
        }
    }
}
