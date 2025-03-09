package mynote.bit;

public class BitStatus {

    public static void main(String[] args) {
        User user = new User("김인수");

        user.addStatus(User.석화);
        user.addStatus(User.중독);
        user.addStatus(User.동결);

        System.out.println(user.printStatus());

        user.removeStatus(User.동결);
        System.out.println(user.printStatus());
    }

}
