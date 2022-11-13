package country.Cohesion;

import ObjectClass.Country;

import java.util.List;

public class Report {
    public String report(List<Country> countries,String KingName) {
        
        String phrase=KingName+":|";
        for(int i=0;i<countries.size();i++){
            if(i>0){
                phrase+=",";
            }
            phrase+=""+countries.get(i).getName_country().charAt(0)+":<";

            // extraire le premiere caractere d'un pays plus ajouter caractere c
            String NcPc=countries.get(i).getName_country().charAt(0)+"c";
            int len=countries.get(i).getListNbrOfSoldierInCities().size();
            for(int j=0;j<len;j++){
                phrase+=NcPc+(j+1)+":"
                        +countries.get(i).getListNbrOfSoldierInCities().get(j)
                        +"-"
                        +countries.get(i).getListNbrOfCitizenInCities().get(j);
                if(j!=(len-1)){
                    phrase+=",";
                }
            }
            phrase+=">-"+countries.get(i).getNbrOfSoldierOnEdges();



        }
        return phrase+"|";
    }
}
