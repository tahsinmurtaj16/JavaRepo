public class Apartment extends Property{
    int noOfRooms;
    String type;
    double rent;
    public Apartment(int nRooms,String tpe,double rpm,String location,String propertyID){
        super(location,propertyID);
        noOfRooms = nRooms;
        type = tpe;
        rent= rpm;
    }
    @Override
    public String toString()
    {
        if(this.rent >= 60000 ){
            return super.toString() + " no_of_rooms: "+noOfRooms+" type: "+type + " Property Make profit";
        }
        else
            return super.toString() + " no_of_rooms: "+noOfRooms+" type: "+type + " Property Make no profit";
    }

}
