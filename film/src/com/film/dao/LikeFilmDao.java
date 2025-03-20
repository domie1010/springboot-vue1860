package com.film.dao;

import java.util.List;
import com.film.model.LikeFilm;

/**
 * 喜爱影片Dao接口
 */
public interface LikeFilmDao {
	/**
	 * 新增喜爱影片
	 * @param likeFilm
	 * @return
	 */
	public int add(LikeFilm likeFilm);
	
	/**
	 * 删除喜爱影片
	 * @param id
	 * @return
	 */
	public int delete(LikeFilm likeFilm);
	
	/**
	 * 查询喜爱影片集合
	 * @param map
	 * @return
	 */
	public List<LikeFilm> findByUserId(Integer userId);
	
	/**
	 * 检验是否关注
	 * @param likeFilm
	 * @return
	 */
	public int checkFind(LikeFilm likeFilm);

	/**
	 * 查询喜爱影片总数
	 * @param userId
	 * @return
	 */
	public Long getTotal(Integer userId);

}
