package Sprint4.Uppgift133;

public class Medicin implements Runnable {
    String medicinNamn;
    double interval;

    public Medicin(String MedicinNamn, double ggrPerMinut) {
        this.medicinNamn = medicinNamn;
        this.interval = (60 / ggrPerMinut) * 1000;
    }


    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(Math.round(interval));
                System.out.println("Dags att ta " + medicinNamn);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

