package Q2;

public class Procces1 <T extends Data> extends Thread{
    private T sd;

    /**
     * standart constructor that get an object referance to a SharedData
     * @param sd
     */
    public Procces1(T sd){this.sd = sd;}

    @Override
    public void run() {
        int x,y;
        for (int i = 0; i < 10; i++)
        {
            x = (int)(Math.random()*100);
            y = (int)(Math.random()*100);
            sd.update(x,y);
            try {
                Thread.sleep((int)(Math.random()*1000));
            }catch (InterruptedException e){System.out.printf("Erorr int P1: %s%n",e.getMessage());}
        }
    }
}
