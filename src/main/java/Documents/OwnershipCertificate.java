package Documents;

public class OwnershipCertificate extends Document {
    private String propertyType;
    private int area;

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public OwnershipCertificate() {

    }

    public OwnershipCertificate(String owner, int yearsOfValability, String propertyType, int area) {
        super(owner, yearsOfValability);
        this.propertyType = propertyType;
        this.area = area;
    }
}
