import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  

  public House(ArrayList<String> residents, boolean hasDiningRoom) {
    super(residents, hasDiningRoom);
    residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  public boolean getHasDiningRoom(){
    return this.hasDiningRoom;
  }

  public ArrayList<String> nResidents(){
    return this.residents;
  }

  public void moveIn(String name){
    residents.add(name);
    System.out.println(name);
  }

  public String moveOut(String name){
    residents.remove(name);
    return name;
  }

  public boolean isResident(String person){
    if (residents.contains(person)){
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args) {
    new House();
  }

}