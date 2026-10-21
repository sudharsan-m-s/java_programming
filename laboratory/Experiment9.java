class ReservationThread extends Thread
{
    public void run()
    {
        try{
            for(int i=0; i<=5; i++)
            {
                System.out.println("Ticket "+i+": Reservation in progress...");
                Thread.sleep(500);
            }
        }catch(InterruptedException e)
        {
            System.out.println("Reservation interrupted");
        }
    }
}

class StatusThread implements Runnable
{
    public void run()
    {
        try{
            for(int i=0; i<=5; i++)
            {
                System.out.println("Ticket "+i+" confirmed");
                Thread.sleep(500);
            }
        }catch(InterruptedException e)
        {
            System.out.println("Reservation interrupted");
        }
    }
}

public class EXPERIMENT9
{
    public static void main(String[] args) {
        ReservationThread r = new ReservationThread();
        StatusThread th = new StatusThread();
        Thread s = new Thread(th);
        r.start();
        s.start();
    }
}
