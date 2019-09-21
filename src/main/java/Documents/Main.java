package Documents;

import sun.util.calendar.BaseCalendar;

public class Main {
    public static void main (String[]args){
    Document firstDocument=new Document("Peter",3);
    Document secondDocument= new Document("Florin",3);
    BirthCertificate firstBirthCertificate=new BirthCertificate("Ana",100,"Ion","Dana","romanca");
    BirthCertificate secondBirthCertificate=new BirthCertificate("Dan",100,"Ion","Dana","roman");
    MarriageCertificate firstMarriageCertificate=new MarriageCertificate("Dan",20,"Mona");
    MarriageCertificate secondMarriageCertificate=new MarriageCertificate("Monica",20,"Marius");
    OwnershipCertificate firstOwnershipCertificate=new OwnershipCertificate("Tom",20,"land",200);
    OwnershipCertificate secondOwnershipCertificate=new OwnershipCertificate("Joe",23,"land",2300);
    }
}
