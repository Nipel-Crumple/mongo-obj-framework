package org.smof.element;

import org.bson.types.ObjectId;

@SuppressWarnings("javadoc")
public interface Element {

	public static final String ID = "_id";

	public ObjectId getId();
	
	public String getIdAsString();

	public void setId(final ObjectId id);
}
