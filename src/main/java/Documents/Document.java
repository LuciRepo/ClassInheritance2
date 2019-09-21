package Documents;

import sun.util.calendar.BaseCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Document {
    /*public Date issuingDateStringToDate(String s) {

        Date result = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            result = dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();

        }
        return result;
    }*/
    private BaseCalendar.Date issuingDate;
    private String issuingAuthority;
    private int yearsOfValidity;
    private String owner;

    public BaseCalendar.Date getIssuingDate() {
        return issuingDate;
    }

    public void setIssuingDate(BaseCalendar.Date issuingDate) {
        this.issuingDate = issuingDate;
    }

    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public int getYearsOfValidity() {
        return yearsOfValidity;
    }

    public void setYearsOfValidity(int yearsOfValidity) {
        this.yearsOfValidity = yearsOfValidity;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    protected Document() {

    }
// ce format trebuie sa aiba BaseCalendar.Date, pentru a-l initializa??
    protected Document(BaseCalendar.Date issuingDate, String owner, int yearsOfValidity) {
        this.issuingDate = issuingDate;
        this.owner = owner;
        this.yearsOfValidity = yearsOfValidity;
    }
   protected Document(String owner, int yearsOfValidity){
       this.owner=owner;
       this.yearsOfValidity=yearsOfValidity;
   }

}
