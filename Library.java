/* This is a stub for the Library class */


import java.util.Hashtable;
public class Library extends Building {
  private Hashtable<String, Boolean> collection;



    public Library(String name,String address, int nFloors) {
      // System.out.println("You have built a library: 📖");
      super(name,address,nFloors);

     this.collection = new Hashtable<String,Boolean>();
    }

    public void addTitle(String title){
      if (collection.containsKey(title)){
        throw new RuntimeException(title +" already exists");
      }
      else{
      collection.put(title,true);}

    }


    public String removeTitle(String title){
      if (collection.containsKey(title)){
        collection.remove(title);
      }
      else{
        throw new RuntimeException(title+" does not exists");
      }
      return title;
    }

    public void checkOut(String title){
      if (!collection.containsKey(title)){

        throw new RuntimeException("sorry this book does not exist in the collection"); 
      }
      if (collection.get(title)==false){

        throw new RuntimeException("sorry this book is already checked out");
      }
      collection.put(title,false);
    }

    public void returnBook(String title){
      if (!collection.containsKey(title)){
        collection.put(title,true);
      }
     
    }

    public boolean containsTitle(String title){
      return this.collection.containsKey(title);
      }

      public boolean isAvailable(String title){
        return collection.get(title);

      }

      public void printCollection(){
        for (String title:this.collection.keySet()){
          System.out.print(title);
        if (this.collection.get(title)){
          System.out.println(":  Available");
        }
        else{
          System.out.println( ": checked out");
        }
      }
        
      }


      
    public static void main(String[] args) {
     Library Neilson= new Library("neilson","smith college",4);
      Neilson.addTitle("hala");
      // Neilson.addTitle("hala");
      Neilson.addTitle("maloul");
      Neilson.checkOut("maloul");
      Neilson.printCollection();
      
    }
  
  }