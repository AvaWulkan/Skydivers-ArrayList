package skydivers.arraylist;


public class Skydiver {

    private int licenseNr;
    private String name;
    private int age;
    private int jumps;
    private String licenseGrade;
    private String club;

    public Skydiver(int licenseNr, String name, int age, int jumps, String licenseGrade, String club) {
        this.licenseNr = licenseNr;
        this.name = name;
        this.age = age;
        this.jumps = jumps;
        this.licenseGrade = licenseGrade;
        this.club = club;
    }

    public int getLicenseNr() {
        return licenseNr;
    }

    public void setLicenseNr(int licenseNr) {
        this.licenseNr = licenseNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJumps() {
        return jumps;
    }

    public void setJumps(int jumps) {
        this.jumps = jumps;
    }

    public String getLicenseGrade() {
        return licenseGrade;
    }

    public void setLicenseGrade(String licenseGrade) {
        this.licenseGrade = licenseGrade;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return licenseNr + " " + name + " " + age + " years old " + jumps + " jumps " + licenseGrade + " " + club;
    }

}
