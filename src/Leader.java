public abstract class Leader {
    public String getName() {
        return name;
    }

    private String name;

    public String getCountry() {
        return country;
    }

    private String country;

    public int getYearsInPower() {
        return yearsInPower;
    }

    private int yearsInPower;

    public Leader(String name,String country, int yearsInPower) {
        this.name = name;
        this.country = country;
        this.yearsInPower = yearsInPower;
    }

    public abstract String giveSpeech();

    //prints information of the chosen leader
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in Power: " + yearsInPower);
    }
}