package JavaAvancado.aula3;

public class ThreadExemplo {
    public static void main(String[] args) {
        GerarPDF iniciarGerarPdf = new GerarPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGerarPdf);

        iniciarGerarPdf.start();
        iniciarBarraDeCarregamento.start();
    }
}
class GerarPDF extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("iniciando...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }
}
class BarraDeCarregamento extends Thread {
    private Thread iniciarGerarPdf;

    public BarraDeCarregamento(Thread iniciarGerarPdf) {
        this.iniciarGerarPdf = iniciarGerarPdf;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500);

                if (!iniciarGerarPdf.isAlive()) {
                    break;
                }
                System.out.println("Loading...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*class BarradeCarregamento2 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(3000);
            System.out.println("rodei2: " + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class BarradeCarregamento3 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(1000);
            System.out.println("rodei3: " + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
*/
