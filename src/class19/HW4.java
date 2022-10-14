package class19;

public class HW4 {
    /* Write program: userClass  that has a constructor that initializes instance variable name and mobile number. Create a subclass
    userInfo that will have user address variable and it also being initialized through constructor call. Print users name, mobile
     number and address in userDetails method. Test your code.*/

     static class User {
        String name;
        String mobileNumber;

         User(String name, String mobileNumber) {
            this.name = name;
            this.mobileNumber = mobileNumber;
        }
        void userDetails (){
            System.out.println("User's name is "+name+" and his phone number is "+mobileNumber);
        }

    }

     static class UserInfo extends User {
        String address;
        void address () {
            System.out.println("256 Dundas Rd, Chicago, Il, 45834");
        }

        UserInfo(String name, String mobileNumber,String address) {
            super(name, mobileNumber);
            this.address=address;
        }
    }

    static class UserTester {
        public static void main(String[] args) {


            UserInfo userinfo = new UserInfo("George", "1565849621","256 Dundas Rd, Chicago, Il, 45834");
            userinfo.userDetails();
            userinfo.address();
        }
    }

}
