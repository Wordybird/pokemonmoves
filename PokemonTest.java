import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PokemonTest{
  Pokemon pokemon;
  Moves moves;

  @Before 
  public void before() {
    pokemon = new Pokemon("Charmander");
    moves = new Moves();
  }

  @Test
  public void hasName() {
    assertEquals("Charmander", pokemon.getName()); 
  }

  @Test
  public void hasNoMovesAtStart() {
    assertEquals(0, pokemon.moveCount());
  }

  @Test
  public void learnsAMove() {
    pokemon.learn(moves);
    assertEquals(1, pokemon.moveCount());
  }  


  @Test
  public void shouldDeleteMoves() {
    pokemon.learn(moves);
    assertEquals(1, pokemon.moveCount());
    pokemon.delete();
    assertEquals(0, pokemon.moveCount());
  }

}
