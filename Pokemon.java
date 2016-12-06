import java.util.*;

public class Pokemon{
  private String name;
  private ArrayList<Moveable> movepool;

  public Pokemon(String name) {
    this.name = name;
    this.movepool = new ArrayList<Moveable>();
  }

  public String getName() {
    return this.name;
  }

  public int moveCount() {
    return movepool.size();
  }

  public void learn(Moveable moves) {
    movepool.add(moves);
  }

  public void delete() {
    movepool.clear();
  }

}
