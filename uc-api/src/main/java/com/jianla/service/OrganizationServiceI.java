package com.jianla.service;

import com.jianla.model.OrgnizationModel;
import com.jianla.model.base.Page;

/**
 * 组织（机构，企业）服务接口
 *
 */
public interface OrganizationServiceI {
	
	/**
	 * 新增企业
	 * 
	 * @param model 要新增的企业
	 * @return 新增企业id
	 */
	Long save(OrgnizationModel model);

	/**
	 * 删除企业
	 * 
	 * @param model 要删除的企业
	 */
	void delete(Long id);

	/**
	 * 更新企业
	 * 
	 * @param model 要更新的企业 ，id不能为空
	 */
	void update(OrgnizationModel model);

	/**
	 * 通过主键id查找企业
	 * 
	 * @param id 企业 id
	 * @return 对应的企业
	 */
	OrgnizationModel findOrgById(Long id);

	/**
	 * 通过qq的openid查找企业
	 * @param openid
	 * @return  
	 */
	OrgnizationModel findOrgByQQopenid(String openid);

	/**
	 * 查询企业
	 * 
	 * @param page 数据的分页信息
	 * @param orgnizationModel 字段查询信息存放达到对应的字段中，id字段精确查询，字符串字段都是模糊查询
	 * @return 满足要求的企业集合
	 */
	Page<OrgnizationModel> findOrg(final Page<OrgnizationModel> page, OrgnizationModel orgnizationModel);

	/**
	 * 账号或机构中文名唯一性验证
	 * 
	 * @param name
	 * @return
	 */
	public Boolean uniqueCheck(String name, short type);

	/**
	 * 邮箱唯一性验证
	 * 
	 * @param email 要验证的邮箱
	 * @return 是否唯一
	 */
	public Boolean onlyEmailCheck(String email);

}
