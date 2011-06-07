package coffeeforrest.forrest.post.comments;

import java.util.List;

import coffeeforrest.forrest.ForrestObject;

public class ForrestResp extends ForrestObject {

	private static final long serialVersionUID = -6707385723945429972L;
	
	// JSON Fields
	private List<ForrestComment> comments;
	private int count;
	
	
	/**
	 * @return the comments
	 */
	public List<ForrestComment> getComments() {
		return comments;
	}
	
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

}
