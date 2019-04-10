package devgym.thread;

public class DaemonThreadChallenge implements Runnable {

    public static void main(String... doYourBest) {
        Thread thread = new Thread(new DaemonThreadChallenge());
//         ##REPLACE##
        // A
//        thread.setDaemon(true);
//        thread.start();

        // B
//        thread.setDaemon(false);
//        thread.start();

        // C
//        thread.setDaemon(true);
//        thread.run();

        // D
        thread.setDaemon(true);
        thread.start();
        thread.start();
    }

    @Override
    public void run() {
        for (;;) {
            System.out.println("For ever");
        }
    }
}
