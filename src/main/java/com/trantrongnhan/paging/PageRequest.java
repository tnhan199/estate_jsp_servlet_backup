package com.trantrongnhan.paging;

public class PageRequest implements Pageable {
	private Integer page;
	private Integer maxPageItem;
	private Integer totalPage;
	public PageRequest() {
		
	}
	public PageRequest(Integer page,Integer maxPageItem,Integer totalPage) {
		this.maxPageItem=maxPageItem;
		this.page=page;
		this.totalPage=totalPage;
	}
	@Override
	public Integer getPage() {
		return this.page;
	}
	@Override
	public Integer getOffset() {
		return (page-1)*maxPageItem;
	}
	@Override
	public Integer getLimit() {
		// TODO Auto-generated method stub
		return this.maxPageItem;
	}
	@Override
	public Integer getMaxPageItem() {
		return maxPageItem;
	}
	public void setMaxPageItem(Integer maxPageItem) {
		this.maxPageItem = maxPageItem;
	}
	@Override
	public Integer getTotalPage() {
		return totalPage;
	}
	@Override
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	@Override
	public void setPage(Integer page) {
		this.page = page;
	}
	
}
