package HM.HM1;

public class CreateMail {
    /*
    Create a method createEmail(). Based on values of users name,
     lastName and email type, your method should return complete email Address.
     Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     Write a method to return whether given number is prime or not?
     */
    String firstName;
String lastName;
String email;

    void createEmail(){
        System.out.println(firstName+lastName + "@"+email);

    }

    public static void main(String[] args) {
        CreateMail lol=new CreateMail();
        lol.firstName="Adam";
        lol.lastName="Jonna";
        lol.email="Yahoo.com";

        lol.createEmail();
    }
}
