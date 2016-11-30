package com.evergrande.mybatis.common;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User: cuican
 * Date: 2016-11-30
 * Time: 11:14
 */
public interface EntityDao<T extends Entity> {

	int insert(T t);

	T findById(int id);

	int update(T t);

	List<T> queryInIds(@Param("ids") Collection<Integer> ids);

	List<T> queryAll(RowBounds rowBounds);

	int batchInsert(List<T> items);

}
