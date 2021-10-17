package model;

import java.util.List;

/**
 * @创建时间：2021/4/14
 * @描述
 */
public class Page<T>{
    //当前页
    private int curPage;
    //当前显示条数
    private int pageSize;
    //总页数
    private int totalPage;
    //总条数
    private int totalCount;
    //展示的数据
    private List<T> Data;

    public int getCurPage() {
        return curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public List<T> getData() {
        return Data;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setData(List<T> data) {
        Data = data;
    }
}
