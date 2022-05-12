package com.pcwk.cmn;

import java.util.List;

import org.apache.log4j.Logger;

import com.pcwk.movie.domain.Movie;

public interface LoggerManager {
	//LOG
	public final static Logger LOG = Logger.getLogger(LoggerManager.class);

	List<Movie> doRetrieve(DTO dto);

	int doSave(Movie dto);

	int doDelete(Movie dto);

	Movie doselectOne(Movie dto);

	int doUpdate(Movie dto);

}
