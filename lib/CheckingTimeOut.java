package lib;

public class CheckingTimeOut {
    public String getResponse() {
        try {
            Thread.sleep(150);
        } catch (Exception e) {
            System.out.println("Some unexpected Exception");
        }
        return "Response Delievered";

    }
}
