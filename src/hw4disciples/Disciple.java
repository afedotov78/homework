package hw4disciples;

public class Disciple implements Comparable <Disciple> {

    private String disciple;

    public Disciple(String disciple) {
        this.disciple = disciple;
    }

    public String getDisciple() {
        return disciple;
    }

    public int getClassNumber() {
        String s = this.disciple;
        return Integer.parseInt(s.substring(0, s.indexOf(" ")));
    }

    public String getLastName() {
        String s = this.disciple;
        return s.substring(s.indexOf(" ")+1);
    }

    @Override
    public int compareTo(Disciple s) {
        int result = (this.getClassNumber()!=(s.getClassNumber())? (this.getClassNumber()-s.getClassNumber()) : (this.getLastName().compareTo(s.getLastName())));
        return result;
    }
}
