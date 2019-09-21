package Documents;

public class BirthCertificate extends Document {
    private String fathersName;
    private String mothersName;
    private String citizenship;

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    protected BirthCertificate() {
    }
    protected BirthCertificate(String owner, int yearsOfValability, String fathersName, String mothersName, String citizenship){
        super(owner,yearsOfValability);
        this.fathersName=fathersName;
        this.mothersName=mothersName;
        this.citizenship=citizenship;
    }
}
