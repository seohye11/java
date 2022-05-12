package com.pcwk.cmn;

import java.util.List;

/**
 * ëª¨ë“  DAO?Š” WorkDivë¥? implements ë°›ì„ ê²?.
 * @author ITSC
 *
 */
public interface WorkDiv<T> {

	/**
	 * <pre>
	 * ëª©ë¡ì¡°íšŒ
	 * @param dto
	 * @return List<DTO>
	 * </pre>
	 */
	public abstract List<T> doRetrieve(DTO dto);
	
	/**
	 * <pre>
	 * ?“±ë¡?
	 * @param dto
	 * @return 1(?„±ê³?)/0(?‹¤?Œ¨)
	 * </pre>
	 */
	public abstract int doSave(T dto);
	
	/**
	 * <pre>
	 * ?‚­? œ
	 * @param dto
	 * @return 1(?„±ê³?)/0(?‹¤?Œ¨)
	 * </pre>
	 */
	public int doDelete(T dto);
	
	/**
	 * <pre>
	 * ?‹¨ê±´ì¡°?šŒ
	 * @param dto
	 * @return DTO
	 * </pre>
	 */
	public T doSelectOne(T dto);
	
	/**
	 * <pre>
	 * ?ˆ˜? •:delete,insert
	 * @param dto
	 * @return 1(?„±ê³?)/0(?‹¤?Œ¨)
	 * </pre>
	 */
	public int doUpdate(T dto);
	
	
	
	default String excelDown(String path) {
		return "download_path";
	}
	
	
}
