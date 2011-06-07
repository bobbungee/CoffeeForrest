package coffeeforrest;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import coffeeforrest.forrest.stats.*;

public class Stats implements java.io.Serializable, APIRequest {

	private static final long serialVersionUID = -7999755423595296447L;
	
	private String useragent = null;
	private Gson gson;
	
	public Stats() {
		gson = new GsonBuilder().create();
	}
	
	/**
	 * @param useragent Instantiate Stats with a custom User-Agent
	 */
	public Stats(String useragent) {
		this();
		this.useragent = useragent;
	}
	
	/**
	 * 
	 * @return A ForrestItem class populated with fetched values
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public ForrestItem getStats() throws IllegalStateException, IOException {
		String JSON = (useragent == null ? Request.sendRequest("stats", Request.HTTPOperation.GET) : 
										   Request.sendRequest("stats", useragent, Request.HTTPOperation.GET));
		
		return gson.fromJson(JSON, ForrestItem.class);
	}

}
