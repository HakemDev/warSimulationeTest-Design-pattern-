import Kingdom.Kingdom;
import Kingdom.Kingdom.KingdomBuilder;
public class Main {
    public static void main(String[] args){
        Kingdom kingdom=new KingdomBuilder()
                            .addKing("hamza")
                            .addCountry("Maroc",10,200,20,300)
                            .addCountry("France",40,800,60,900)
                            .addSoldierOnEdges(200)
                            .build();

        System.out.println( kingdom.report());
        System.out.println("kingdom name "+kingdom.getKingName()+" Country Name: "+kingdom.getListcountry().get(1).getName_country()+" nbr of citizien "+kingdom.getListcountry().get(1).getListNbrOfCitizenInCities());
        System.out.println("nbr of soldier "+kingdom.currentPower());
    }
}
