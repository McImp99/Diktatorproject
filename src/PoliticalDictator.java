public class PoliticalDictator extends Leader implements PowerActions {
    private String partyName;
    //Constructor
    public PoliticalDictator(String name, String country, int yearsInPower, String partyName) {
        super(name, country, yearsInPower);
        this.partyName = partyName;
    }
    //Overrides leaders general method of speech
    @Override
    public String giveSpeech() {
        return "As the leader of the " + partyName + ", I will guide " + getCountry() + " to greatness!";
    }
    //overrides leaders general method of policy
    @Override
    public void implementPolicy(String policy) {
        System.out.println("Implementing political policy: " + policy);
    }

    @Override
    public void repressOpposition() {
        System.out.println("Repressing opposition through political means.");
    }

    @Override
    public void holdParade() {
        System.out.println("Holding a grand political parade!");
    }

    public String getName() {
        return super.getName();
    }

    public String getCountry() {
        return super.getCountry();
    }
}