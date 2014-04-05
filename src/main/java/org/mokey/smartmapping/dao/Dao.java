package org.mokey.smartmapping.dao;

import java.util.List;

import org.mokey.smartmapping.models.Parameters;

public interface Dao {
	public boolean insert(String...items);
	public List<Parameters> fetch(String... items);
}
