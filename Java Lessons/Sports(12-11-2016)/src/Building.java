public class Building
{
    
    
 String name;
 double SquareFeet;
 int numClass;
 // a double to hold the number of square feet in the building,
 // and an integer to hold the number of classrooms in the building.
//worth 3 pts

 // Constructor to initialize the data fields.
 public Building(String theName, double theSquareFeet, int classRooms)
 {
     this.name = theName;
     this.SquareFeet = theSquareFeet;
     this.numClass = classRooms;
 }
 public void setNumberOfSquareFeet(double newSquareFootage)
 {
     this.SquareFeet = newSquareFootage;
 }
 // Return the average square feet per classroom.
 public double averageRoomSize()
 {
    return SquareFeet;
 }
 // Return the first two characters of the building name as a string
 public String getAbbreviatedBuildingName()
 {

     return(String.valueOf(name.charAt(0)) + String.valueOf(name.charAt(1)));
 }
}
