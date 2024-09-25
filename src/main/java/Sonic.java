public class Sonic extends Vehicle {
    public static String warrantyNumber = "1 (800) MR GOODWRENCH";

    @Override
    public String toString() {
        //ok to ref a static var from an instance method, just remember it's 1 copy for all instances
        return super.toString() + "Warranty Phone Number: " + warrantyNumber;
    }
}
