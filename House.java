import java.util.ArrayList;

/* This is a stub for the House class */
/**
 This class is used for the House Data

 */
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
}

public int nResidents(){
  return this.residents.size();

}

/**
  This constructer accepts data 
 */
  public House(String name,String address, int nFloors,boolean hasDiningRoom) {
    // System.out.println("You have built a house: 🏠");
    super(name,address,nFloors);
    this.residents=new ArrayList<String>();
    this.hasDiningRoom=hasDiningRoom;


  }
 
  public boolean isResident(String person){
     return this.residents.contains(person);
      
     }

    
  
  public void moveIn(String name){
    if (isResident(name)){
      throw new RuntimeException(name+"is already a resident");
    }
    else{
    residents.add(name);}}

    public String moveOut(String name){
      if (isResident(name)){

        residents.remove(name);
        return name;
      
        
      }
      else{
        throw new RuntimeException(name+"is not a resident");}}
    

  

  
public String toString(){
  String describtion=super.toString();
  describtion+="There are currently"+this.residents.size()+"residents in this house";
  describtion+="this house";
  if (this.hasDiningRoom){
    describtion+="has";
  }
  else{
    describtion+="does not have";

  }
  describtion+="a dining room";

  return describtion;

}
  public static void main(String[] args) {
  House wilson=new House("wilson","hkhk",4,true);
 System.out.println(wilson);

 wilson.moveIn("Hala");
 System.out.println(wilson);
  }

}