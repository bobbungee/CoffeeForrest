package coffeeforrest;

import static org.junit.Assert.*;
import org.junit.Test;

import coffeeforrest.Request;
import coffeeforrest.Request.HTTPOperation;

import java.io.IOException;

public class RequestTest {
	
	@Test
	public void testSendRequest() throws IllegalStateException, IOException {
		String str = Request.sendRequest("stats", HTTPOperation.GET);
		
		assertTrue("sendRequest() Returned bad Request", 
					str.contains("stat") && str.contains("in") && str.contains("env"));
	}

}
