package repls;

public class repl182 {
    public static void main(String[] args) {
        Variables var=new Variables("John","Doe","123-45-6789",10,25,1900);

        System.out.println(var.getFirstname());
        System.out.println(var.getLastname());
        System.out.println(var.formatBirthday());
        System.out.println(var.getSsn());


    }

}
    class Variables{
   private String firstname,lastname,ssn;
   private int birthmonth,birthday,birthyear;

    public Variables(String firstname, String lastname, String ssn, int birthmonth, int birthday, int birthyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String formatBirthday(){

        String date=Integer.toString(birthmonth)+"/"+Integer.toString(birthday)+"/"+Integer.toString(birthyear);
        return date;
    }
}
