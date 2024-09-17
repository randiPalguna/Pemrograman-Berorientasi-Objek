public class ClockDemo {
    public static void main(String[] args) throws InterruptedException {
        ClockDisplay clock = new ClockDisplay();
        clock.setTime(18, 54);
    
        while(true) {
            clock.minIncrement();
            System.out.println(" tick...");
            System.out.println("Current time: " + clock.getTime());
            Thread.sleep(1 * 60 * 1000);
        }
    }
}
