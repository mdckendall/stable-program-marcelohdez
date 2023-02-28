import java.util.ArrayList;

public record Stable(String address, ArrayList<Horse> horses) {
  @Override
  public String toString() {
    var sb = new StringBuilder();
    for (int i = 0; i < horses.size(); i++) {
      var horse = horses.get(i);
      
      sb.append("Horse #").append(i + 1)
        .append(' ').append(horse)
        .append('\n');
    }
    
    return sb.toString();
  }
}
