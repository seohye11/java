package com.pcwk.library.dao;

import java.util.List;

import com.pcwk.cmn.DTO;
import com.pcwk.cmn.WorkDiv;
import com.pcwk.library.domain.Book;

public class AddressBookDao implements WorkDiv<Book> {

	@Override
	public List<Book> doRetrieve(DTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int doSave(Book dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doDelete(Book dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DTO doselectOne(Book dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int doUpdate(Book dto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
