package repls;

public class repl181  {
    public static void main(String[] args) {
     Accout acc=new Accout();
     acc.setAcc_no("7560504000");
     acc.setName("Sumair");
     acc.setEmail("sumiar@syntax.com");
     acc.setAmount(5000);

        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}
 class Accout{
    private String acc_no;
    private String name,email;
   private double amount;

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
