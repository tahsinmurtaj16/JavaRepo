class StudentAdvance extends Advance{
    private long studentID ;
    public StudentAdvance(int mDays,long Sid){
        super(mDays);
        studentID = Sid;
    }
    @Override
    public  double getPrice(){
        double price = 0;
        return super.getPrice()/2;

    }
    @Override
    public String toString(){
        return super.toString()+" StudentId is :" + studentID;
    }

}