package Q2;

    public class Procces2 <T extends Data> extends Thread{
        private T sd;//the object to work on.

        /**
         * standart constructor that get an object referance to a SharedData
         * @param sd
         */
        public Procces2(T sd){this.sd = sd;}

        @Override
        public void run() {
          int temp;
            for (int i = 0; i < 10; i++)
            {
                temp = sd.getDiff();
                //System.out.printf("P2: get: %s%n",temp.toString());
                try {
                    Thread.sleep((int)(Math.random()*1000));
                }catch (InterruptedException e){System.out.printf("Erorr in P2: %s%n",e.getMessage());}
            }
        }
    }


