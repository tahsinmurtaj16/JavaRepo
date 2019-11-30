public  class Property {
    String propertyID ;
    String location;
    public Property(String location,String propertyID){
        this.location = location ;
        this.propertyID = propertyID;

    }



    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String toString()
    {
        return "Property ID is : "+propertyID + " ,  Location: "+location;
    }
}
