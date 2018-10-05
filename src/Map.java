public class Map<T> {
  private T key;
  private T value;

  Map(T key, T value){
    this.key = key;
    this.value = value;
  }

  @Override
  public String toString(){
    return "Year : " + key + " | Car  : " + value;
  }

  public static void main(String [] args){
    Map m1 = new Map(1989, "GT-R");
    Map m2 = new Map(1969, "Capri");
    Map m3 = new Map(1953, "Corvette C1");

    System.out.println(m1 + "\n" + m2 + "\n" + m3);
  }
}
