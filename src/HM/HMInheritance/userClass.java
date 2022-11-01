package HM.HMInheritance;

public class userClass {

    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
     Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    String phone;

    public userClass(String name,String phone){
        this.name=name;
        this.phone=phone;

    }
}
class userInfo extends userClass{
    String address;
    public userInfo(String name, String phone,String address) {
        super(name, phone);
        this.address=address;
    }
    public void userDetails(){
        System.out.println("Name "+name+" Phone "+phone+" address "+address);
    }
}

class testUser{
    public static void main(String[] args) {
        userInfo user1=new userInfo("Ivan","818-717-2323","Pittsburgh");
        user1.userDetails();

    }
}
