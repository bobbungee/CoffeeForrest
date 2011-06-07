package coffeeforrest.forrest.users.info;

import coffeeforrest.forrest.ForrestObject;

public class ForrestPhotos extends ForrestObject {

	private static final long serialVersionUID = -2656520533556913331L;
	
	// fields
	private String xl_url;
	private String large_url;
	private String medium_url;
	private String small_url;
	private String thumb_url;
	
	/**
	 * @return the xl_url
	 */
	public String getXlUrl() {
		return xl_url;
	}
	
	/**
	 * @return the large_url
	 */
	public String getLargeUrl() {
		return large_url;
	}
	
	/**
	 * @return the medium_url
	 */
	public String getMediumUrl() {
		return medium_url;
	}
	
	/**
	 * @return the small_url
	 */
	public String getSmallUrl() {
		return small_url;
	}
	
	/**
	 * @return the thumb_url
	 */
	public String getThumbUrl() {
		return thumb_url;
	}

}
