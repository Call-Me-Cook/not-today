import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("PollingTask Run!");

            }
        };
        TimerTask task2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("PollingTask2 Run!"+new Date());
                System.out.println("aaa");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        Timer timer = new Timer();
        Timer timer2 = new Timer();
        timer.scheduleAtFixedRate(task, 0, 1000);
        timer.scheduleAtFixedRate(task2, 0, 1000);
    }

}
