public class Main {
    public static void main(String[] args) {
        CapitalCities city = CapitalCities.TOKYO;

        System.out.println("City: " + city);
        System.out.println("Country: " + city.getCountry());
        System.out.println("Population: " + city.getPopulation());
        System.out.println("Founded Year: " + city.getFoundedYear());
    }
}