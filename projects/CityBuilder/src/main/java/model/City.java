package model;

public class City {

    private String name;
    private String country;
    private String category;
    private double population;
    private boolean capital;

    public City(String name, String country, double population, boolean capital) {
        this.name = name;
        this.country = country;
        this.population = population;
        this.capital = capital;

        if(!this.capital){
            this.category = this.population > 6 ? "Big" : "Small";
        }else{
            this.category = this.population > 7 ? "Big" : "Small";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("name='").append(name).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", population=").append(population);
        sb.append(", capital=").append(capital);
        sb.append('}');
        return sb.toString();
    }
}
