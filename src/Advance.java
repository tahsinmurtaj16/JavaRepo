public class Advance extends Ticket {
   private int days;

   public Advance(int mDays){
       days = mDays;
   }
   @Override
    public double getPrice(){
       double price=0;
       if(days >= 10){
           price = 30.00;
       }
       else if(days > 0 && days < 10){
           price = 40.00;
       }
       return price;
   }



}
