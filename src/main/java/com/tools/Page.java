package com.tools;

import java.util.List;

/**
 * Created by pact on 2019/1/3.
 */
public class Page<T> {
    private T query; //查询条件
    private List<T> result; //每页条数list
    private Integer currentPage;//当前页
    private Integer size;//每页条数
    private Long count;//总数

    public T getQuery() {
        return query;
    }

    public void setQuery(T query) {
        this.query = query;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

}
