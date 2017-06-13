package com.java1234.service.base;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 通用Service基类,其他Service继承该基类即可
 *
 * @author xinfeng.hu on 2015/2/3.
 * @version 1.0.0
 * @category 杭州尤拉夫科技有限公司
 */
public interface BaseService<T> {

    /**
     * 只获取一条数据，当查询的结果多于一条数据是抛出异常。
     *
     * @param record
     * @return
     */
    public T selectOne(T record);

    /**
     * 分页查询
     *
     * @param record
     * @return
     */
    public PageInfo<T> selectPage(T record);

    /**
     * 根据条件查询返回数据列表
     * 
     * @param record
     * @return
     */
    public List<T> select(T record);

    /**
     * 根据条件查询返回数据条数
     * 
     * @param record
     * @return
     */
    public int selectCount(T record);

    /**
     * 根据主键查询
     *
     * @param pk 主键
     * @return
     */
    public T selectByPrimaryKey(Object pk);

    /**
     * 插入，空属性也会插入
     * 
     * @param record
     * @return
     */
    public int insert(T record);

    /**
     * 插入，空属性不会插入
     * 
     * @param record
     * @return
     */
    public int insertSelective(T record);

    /**
     * 插入列表，空属性不会插入
     * 
     * @param recordList
     * @return
     */
    public int insertListSelective(List<T> recordList);

    /**
     * 根据条件删除
     * 
     * @param key
     * @return
     */
    public int delete(T key);

    /**
     * 根据主键删除
     * 
     * @param pk
     * @return
     */
    public int deleteByPrimaryKey(Object pk);

    /**
     * 根据主键修改，空值条件会修改成null
     * 
     * @param record
     * @return
     */
    public int updateByPrimaryKey(T record);

    /**
     * 根据主键修改，空值条件不会修改成null
     * 
     * @param record
     * @return
     */
    public int updateByPrimaryKeySelective(T record);
}