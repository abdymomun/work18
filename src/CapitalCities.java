public enum CapitalCities {
    LONDON("United Kingdom", 8_908_081, 1572),
    TOKYO("Japan", 13_515_271, 1457),
    PARIS("France", 2_140_526, 508),
    MOSCOW("Russia", 12_537_954, 1147),
    CANBERRA("Australia", 431_215, 1913);

    private final String country;
    private final int population;
    private final int foundedYear;

    CapitalCities(String country, int population, int foundedYear) {
        this.country = country;
        this.population = population;
        this.foundedYear = foundedYear;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public int getFoundedYear() {
        return foundedYear;
    }
}

