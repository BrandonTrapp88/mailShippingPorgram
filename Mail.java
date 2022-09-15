
/**
 * Write a description of class Mail here.
 *
 * @author: Brandon Trapp
 * @version date: 9-3-22 2:59pm
 * 
 * Class sets the destination, units, postage,tytpe, and destination for the mail class also sets
 * up the getters. 
 */
public class Mail
{
    private String type = "";
    private String  destination = ""; 
    private int units = 0; 
    private double postagePerUnit = 0.0; 
    

//setter for destination 
public void setDestination(String dest) {
    this.destination = dest;
}
//setter for units 
public void setUnits(int howMany) {
    this.units = howMany; 
}
//setter for postage
public void setPostagePerUnit(double stamps) {
    this.postagePerUnit = stamps; 
}
//setter for letter or package type
public void setType(String type) {
    this.type = type;
}
//getter fpr destination 
public String getDestination(){
    return this.destination;

}
//getter fpr units 
public int getUnits() {
    return this.units; 
}
//getter for postage
public double getPostagePerUnit() {
    return this.postagePerUnit; 
}
//getter for package type 
public String getType() {
    return this.type;
}

}