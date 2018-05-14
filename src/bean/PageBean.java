package bean;

public class PageBean {
	private int page;
	private int pagesize = 4;
	private int totalpage;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	@Override
	public String toString() {
		return "PageBean [page=" + page + ", pagesize=" + pagesize + ", totalpage=" + totalpage + "]";
	}
	
}
