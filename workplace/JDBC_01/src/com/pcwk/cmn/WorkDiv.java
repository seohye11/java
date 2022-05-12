package com.pcwk.cmn;

import java.util.List;

/**
 * 모든 DAO?�� WorkDiv�? implements 받을 �?.
 * @author ITSC
 *
 */
public interface WorkDiv<T> {

	/**
	 * <pre>
	 * 목록조회
	 * @param dto
	 * @return List<DTO>
	 * </pre>
	 */
	public abstract List<T> doRetrieve(DTO dto);
	
	/**
	 * <pre>
	 * ?���?
	 * @param dto
	 * @return 1(?���?)/0(?��?��)
	 * </pre>
	 */
	public abstract int doSave(T dto);
	
	/**
	 * <pre>
	 * ?��?��
	 * @param dto
	 * @return 1(?���?)/0(?��?��)
	 * </pre>
	 */
	public int doDelete(T dto);
	
	/**
	 * <pre>
	 * ?��건조?��
	 * @param dto
	 * @return DTO
	 * </pre>
	 */
	public T doSelectOne(T dto);
	
	/**
	 * <pre>
	 * ?��?��:delete,insert
	 * @param dto
	 * @return 1(?���?)/0(?��?��)
	 * </pre>
	 */
	public int doUpdate(T dto);
	
	
	
	default String excelDown(String path) {
		return "download_path";
	}
	
	
}
