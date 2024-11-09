public class MilitaryDictator extends Leader implements PowerActions {
    private String militaryRank;

    public MilitaryDictator(String name, String country, int yearsInPower, String militaryRank) {
        super(name, country, yearsInPower);
        this.militaryRank = militaryRank;
    }

    @Override
    public String giveSpeech() {
        return "I am " + getName() + ", a proud " + militaryRank + " leading " + getCountry() + "!";
    }

    @Override
    public void implementPolicy(String policy) {
        System.out.println("Implementing military policy: " + policy);
    }

    @Override
    public void repressOpposition() {
        System.out.println("Repressing opposition with military force.");
    }

    @Override
    public void holdParade() {
        System.out.println("Holding a grand military parade!");
    }

    public String getName() {
        return super.getName();
    }

    public String getCountry() {
        return super.getCountry();
    }
}