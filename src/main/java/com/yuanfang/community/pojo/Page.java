package com.yuanfang.community.pojo;

/**
 * 封装分页相关的数据
 */
public class Page {

    //当前页码
    private int currentPage = 1;

    //每页显示的条数
    private int limit = 10;

    //帖子的总条数
    private int rows;

    //当前路径
    private String path;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        if(currentPage >= 1){
            this.currentPage = currentPage;
        }
    }

    public int getLimit() {

        return limit;
    }

    public void setLimit(int limit) {
        if(limit >=1 && limit <= 100){
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取当前页的起始行号
     * @return
     */
    public int getOffset(){
        return (currentPage - 1) * limit;
    }

    /**
     * 获取总的页数
     * @return
     */
    public int getTotal(){
        if(rows % limit == 0){
            return rows / limit;
        }else{
            return rows / limit + 1;
        }
    }

    /**
     * 获取分页状态栏的起始页码
     * @return
     */
    public int getFrom(){
        int from = currentPage - 2;
        return from < 1 ? 1 : from;
    }

    /**
     * 获取分页状态栏的结束页码
     * @return
     */
    public int getTo(){
        int to = currentPage + 2;
        int total = getTotal();
        return to > total ? total : to;
    }
}
