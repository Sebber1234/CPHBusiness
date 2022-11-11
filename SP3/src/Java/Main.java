public class Main {
    public static void main(String[] args) {

        UserManager.getInstance().loadUsers();
        //MediaManager.getInstance().loadMedia();

        GUI loginpage = new GUI();
    }
}
