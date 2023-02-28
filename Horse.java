//Create the Horse class here.
public record Horse(String name, double weight, boolean tamed) {
  @Override
  public String toString() {
    var sb = new StringBuilder();
    
    sb.append("Name: ").append(name)
      .append(" Weight: ").append(weight)
      .append(" Tame: ").append(tamed);
    
    return sb.toString();
  }
}
