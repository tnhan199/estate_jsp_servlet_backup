package com.trantrongnhan.paging;

public interface Pageable {
	Integer getPage();
	Integer getOffset();
	Integer getLimit();
	void setPage(Integer page);
	Integer getTotalPage();
	void setTotalPage(Integer totalPage);
	Integer getMaxPageItem();
}
