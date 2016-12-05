public class Pokemon{
  private String name;
  private Moves[] movepool;

  public Pokemon(String name) {
    this.name = name;
    this.movepool = new Moves[4];
  }

  public String getName() {
    return this.name;
  }

  public int moveCount() {
    int count=0;
    for (Moves moves : movepool) {
      if (moves != null) {
        count++;
      }
    }
    return count;
  }

  public void learn(Moves moves) {
    if (movepoolFull()) {
      return;
    }
    int moveCount = moveCount();
    movepool[moveCount] = moves;
  }

  public boolean movepoolFull() {
    return moveCount() == movepool.length;
  }

  public void delete() {
    for (int i = 0; i < movepool.length; i++) {
      movepool[i] = null;
    }
  }

}
