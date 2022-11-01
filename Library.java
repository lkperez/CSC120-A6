import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building {
  private Hashtable<String, Boolean> collection;

    public Library(Hashtable<String, Boolean> collection) {
      super(collection);
      collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title){
      collection.put(title,boolean);
    }

    public String removeTitle(String title){
      collection.remove(title);
      return title;
      
    }

    public void CheckOut(String title){
      collection.replace(title,true,false);
    }

    public void returnBook(String title){
      collection.replace(title, false, true);
    }

    public boolean containsTitle(String title){
      if (collection.containsKey(title)){
        return true;
      }else{
          return false;
        }
      }

    public boolean isAvailable(String title){
      if (collection.containsValue(true)){
        return true;
      }else{
        return false;
      }
    }

    public void printCollection(){
      System.out.println(collection);
    }
  
    public static void main(String[] args) {
      new Library();
    }
  
  }