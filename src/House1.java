public class House1 extends Property{
    int noOfRooms;
    String type;
    double rent;
    public House1(int nRooms,String tpe,double rpm,String location,String propertyID){
        super(location,propertyID);
        noOfRooms = nRooms;
        type = tpe;
        rent= rpm;
    }
    @Override
    public String toString()
    {
        if(this.rent >= 100000 ){
            return super.toString() + " no_of_rooms: "+noOfRooms+" type: "+type + "Property Make profit";
        }
        else
            return super.toString() + " no_of_rooms: "+noOfRooms+" type: "+type + "Property Make no  profit";
    }

}
