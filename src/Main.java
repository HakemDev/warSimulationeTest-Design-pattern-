import Kingdom.Kingdom;
import Kingdom.Kingdom.KingdomBuilder;
public class Main {
    public static void main(String[] args){
        Kingdom kingdom=new KingdomBuilder()
                            .addKing("Hamza")
                            .addCountry("France",20,100,50,200,100,100)
                            .addCountry("Spain",30,200,40,300)
                            .addSoldierOnEdges(500)
                            .build();


        System.out.println( kingdom.report());
        //System.out.println("kingdom name "+kingdom.getKingName()+" Country Name: "+kingdom.getListcountry().get(1).getName_country()+" nbr of citizien "+kingdom.getListcountry().get(1).getListNbrOfCitizenInCities());
        System.out.println("nbr of soldier "+kingdom.currentPower());
    }
}
