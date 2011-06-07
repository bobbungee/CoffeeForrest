package coffeeforrest;

import java.io.IOException;

import static org.junit.Assert.*;
import org.junit.Test;

public class StatsTest {
	
	@Test
	public void testGetStats() throws IllegalStateException, IOException {
		Stats stats = new Stats();
		
		assertTrue("Fetched wrong thing", stats.getStats().getEnv().equals("prod"));
	}

}
