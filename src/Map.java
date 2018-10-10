public class Map<K, V> {
  private K key;
  private V value;

  Map(K key, V value){
    this.key = key;
    this.value = value;
  }

  @Override
  public String toString(){
    return "Year : " + key + " | Car  : " + value;
  }

  public static void main(String [] args){
    Map<Integer, String> m1 = new Map(1989, "GT-R");
    Map<Integer, String> m2 = new Map(1969, "Capri");
    Map<Integer, String> m3 = new Map(1953, "Corvette C1");

    System.out.println(m1 + "\n" + m2 + "\n" + m3);
  }
}
