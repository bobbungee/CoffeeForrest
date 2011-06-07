package coffeeforrest;

import java.io.IOException;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.cache.CacheConfig;
import org.apache.http.impl.client.cache.CachingHttpClient;

public final class Request {
	
	/**
	 * The Base URL of the Forrst API
	 */
	public static final String BASE_URL = "http://forrst.com/api/v2/";
	
	// cannot instantiate class
	private Request() {}
	
	/**
	 * 
	 * @param path The appending path to the BASE_URL
	 * @param op The HTTPOperation to use
	 * @return Returns requested JSON
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	protected static String sendRequest(String path, HTTPOperation op) 
										throws IllegalStateException, IOException {
		return sendRequest(path, "CoffeeForrest Forrst API Java Wrapper", op);
	}
	
	/**
	 * 
	 * @param path The appending path to the BASE_URL
	 * @param useragent The custom User-Agent to use
	 * @param op The HTTPOperation to use
	 * @return Returns requested JSON
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	protected static String sendRequest(String path, String useragent, HTTPOperation op) 
										throws IllegalStateException, IOException {
		
		CacheConfig cacheConfig = new CacheConfig();
		cacheConfig.setMaxCacheEntries(1000);
		cacheConfig.setMaxObjectSizeBytes(8192);
		
		StringBuilder json = new StringBuilder();
		HttpClient httpclient = new CachingHttpClient(new DefaultHttpClient(), cacheConfig);
		HttpRequestBase httpop = null;
		
		switch (op) {
		
		case GET:
			httpop = new HttpGet(BASE_URL+path);
			break;
		
		case POST:
			httpop = new HttpPost(BASE_URL+path);
			break;
		
		}
		
        try {
        	httpclient.getParams().setParameter(
        			"http.useragent",
        		    useragent
        	);
        	
            // Create a response handler
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String responseBody = httpclient.execute(httpop, responseHandler);
            json.append(responseBody);
         
        } finally {
            // When HttpClient instance is no longer needed,
            // shut down the connection manager to ensure
            // immediate deallocation of all system resources
            httpclient.getConnectionManager().shutdown();
        }
        
        return json.toString();
	}
	
	/**
	 * HTTP Operations of GET and POST
	 */
	protected static enum HTTPOperation {
		GET, POST
	}

}
