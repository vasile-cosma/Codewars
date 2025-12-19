import static org.junit.Assert.*;

import org.junit.Test;

public class SmashWordsTest {

	@Test
	public void validate() {
	assertEquals("hello", SmashWords.smash(new String[] { "hello" }));
    assertEquals("hello world", SmashWords.smash(new String[] { "hello", "world"}));
    assertEquals("hello world this is great", SmashWords.smash(new String[] {"hello", "world", "this", "is", "great"}));
	}
	
}