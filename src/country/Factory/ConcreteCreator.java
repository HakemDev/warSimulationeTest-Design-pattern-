package country.Factory;

public class ConcreteCreator extends Creator{
    @Override
    public CountryProduct country() {
        return new ConcreteCountryProduct();

    }
}
