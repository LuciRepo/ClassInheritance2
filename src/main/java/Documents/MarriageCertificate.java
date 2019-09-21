package Documents;

public class MarriageCertificate extends Document {
    private String spouse;

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }
    protected MarriageCertificate(){

    }
    protected MarriageCertificate(String owner, int yearsOfValability,  String spose){
        super (owner,yearsOfValability);
        this.spouse=spouse;
    }
}
