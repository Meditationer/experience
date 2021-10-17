package model;

import java.util.List;

/**
 * @����ʱ�䣺2021/4/14
 * @����
 */
public class Page<T>{
    //��ǰҳ
    private int curPage;
    //��ǰ��ʾ����
    private int pageSize;
    //��ҳ��
    private int totalPage;
    //������
    private int totalCount;
    //չʾ������
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
