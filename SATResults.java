public class SATResults {

    private String name;
    private Address address;
    private int satScore;
    private boolean passed;

    public SATResults(String name, Address address, int satScore) {
        this.name = name;
        this.address = address;
        this.satScore = satScore;
        this.passed = satScore > 0.3 * 1600;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public int getSatScore() {
        return satScore;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSatScore(int satScore) {
        this.satScore = satScore;
        this.passed = satScore > 0.3 * 1600;
    }
}


