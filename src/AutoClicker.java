import java.awt.*;
import java.awt.event.InputEvent;

public class AutoClicker {

    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();

        // menunggu 5 detik sebelum program dijalankan
        Thread.sleep(5000);

        // melakukan klik mouse setiap 2 detik selama 30 detik
        for (int i = 0; i < 15; i++) {
            // mengklik posisi tertentu pada layar
            robot.mouseMove(500, 500);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(2000);
        }
    }
}
