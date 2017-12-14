package com.nvidia.build.mesos.model;

import com.nvidia.build.mesos.util.JsonFormatter;

/**
 * @author
 */
public class ImageInfo {

	/**
	 * Alt of the image tag. *
	 */
	private String alt;
	/**
	 * Src of the image tag. *
	 */
	private String src;

	public ImageInfo() {
	}

	public ImageInfo(String alt, String src) {
		this.alt = alt;
		this.src = src;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JsonFormatter.toJSON(this);
	}

	@Override public String toString() {
		return toJSON();
	}
}
