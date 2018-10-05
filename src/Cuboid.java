

public class Cuboid<N extends Number>{
  private N length;
  private N height;
  private N breadth;

  Cuboid(){

  }

  Cuboid(N length, N height, N breadth){
    this.length = length;
    this.height = height;
    this.breadth = breadth;
  }

  public void setLength(N length){
    this.length = length;
  }

  public void setHeight(N height){
    this.height = height;
  }

  public void setBreadth(N breadth){
    this.breadth = breadth;
  }

  public N getLength(){
    return length;
  }

  public N getHeight(){
    return height;
  }

  public N getBreadth(){
    return breadth;
  }

  public double getVolume(){
    //double x = length;

    return (length.doubleValue() * height.doubleValue() * breadth.doubleValue());
  }

  @Override
  public String toString(){
    return "Length  : " + length +
        "\nHeight  : " + height +
        "\nBreadth : " + breadth;
  }

  public static void main(String[] args){
    Cuboid<Double> c1 = new Cuboid<>(1.0, 2.0, 3.0);
    //Cuboid<String> c2 = new Cuboid<>("One", "Two", "Three");

    System.out.println(c1 + "\n");
    System.out.println("The volume is: " + c1.getVolume());
    //System.out.println(c2);
  }
}
