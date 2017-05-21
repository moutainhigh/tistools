/**
 * 
 */
package org.tis.tools.rservice.om.capable;

import java.util.Date;
import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.base.exception.ToolsRuntimeException;
import org.tis.tools.model.po.om.OmEmployee;
import org.tis.tools.model.po.om.OmOrg;
import org.tis.tools.model.po.om.OmPosition;

//FIXME 接口实现时注意
// 1、每个接口的返回值，目前简单以模型对象“占位”，考虑数据结构的合理性，具体实现时，应编写更有针对性的VO对象；
// 2、实现功能是目标，到底这个目标的路（接口）有很多条，如果路线（接口）重复/不够了，可视情况删减/增加；
// 3、接口的改动请组内做 论证 后再执行！


/**
 * <pre>
 * 对OM组织模块中机构（Organization）概念对象的管理服务功能；
 * 满足《4.4.1 机构管理用例》描述中的功能需求，如：新增机构、查询机构信息等；
 * 这些功能主要供Branch Manager这样的管理型系统使用；
 * 
 * 特别说明：
 * 关于操作日志何时记录？
 * 此处IOrgRService提供对机构的操作服务，不关注之外的信息。
 * 建议在‘后管’类系统中进行操作日志记录（通过调用日志服务），因为BM清楚谁在做操作，操作结果如何。
 * 
 * </pre>
 * 
 * @author megapro
 *
 */
public interface IOrgRService {
	
	
	/*
	 * ==========================================
	 * 机构管理相关的服务
	 * 
	 * 生成机构代码
	 * 新增机构
	 * 拷贝机构
	 * 修改机构
	 * 移动机构（调整机构层级）
	 * ==========================================
	 */
	
	/**
	 * 生成机构代码
	 * 
	 * @param areaCode
	 *            区域代码
	 * @param orgDegree
	 *            机构等级
	 * @param orgType
	 *            机构类型
	 * @return 机构代码
	 * @throws ToolsRuntimeException
	 */
	String genOrgCode(String areaCode, String orgDegree, String orgType) throws ToolsRuntimeException;

	/**
	 * <pre>
	 * 新建一个（机构树）根节点机构。
	 * 
	 * 说明：
	 * 除参数传入字段外，程序按照‘根节点机构’补充其他信息；
	 * 新建后，机构状态停留在‘停用’；
	 * </pre>
	 * 
	 * @param orgCode
	 *            机构代码
	 * @param orgName
	 *            机构名称
	 * @param orgType
	 *            机构类型
	 * @param orgDegree
	 *            机构等级
	 * @return 新建机构信息
	 * @throws ToolsRuntimeException
	 */
	OmOrg createRootOrg(String orgCode, String orgName, String orgType, String orgDegree) throws ToolsRuntimeException;

	/**
	 * <pre>
	 * 新建一个子节点机构
	 * 
	 * 说明：
	 * 除参数传入字段外，程序按照‘子节点机构’补充其他信息；
	 * 新建后，机构状态停留在‘停用’；
	 * </pre>
	 * 
	 * @param orgCode
	 *            机构代码
	 * @param orgName
	 *            机构名称
	 * @param orgType
	 *            机构类型
	 * @param orgDegree
	 *            机构等级
	 * @param parentsOrgCode
	 *            父机构代码
	 * @param sortNo
	 *            位于机构树的排列顺序，如果为0或null，则排到最后。
	 * @return 新建机构信息
	 * @throws ToolsRuntimeException
	 */
	OmOrg createChildOrg(String orgCode, String orgName, String orgType, String orgDegree, String parentsOrgCode,
			int sortNo) throws ToolsRuntimeException;
	
	/**
	 * <pre>
	 * 新建一个子节点机构
	 * 
	 * 说明：
	 * 以OmOrg指定入参时，需要调用者指定父机构GUID；
	 * 系统检查“机构代码、机构名称、机构类型、机构等级、父机构GUID”等必输字段，通过后新建机构；
	 * 新建后，机构状态停留在‘停用’；
	 * </pre>
	 * 
	 * @param newOrg
	 *            新机构信息
	 * @return 新建机构信息
	 * @throws ToolsRuntimeException
	 */
	OmOrg createChildOrg(OmOrg newOrg) throws ToolsRuntimeException;

	/**
	 * <pre>
	 * 修改机构信息
	 * 
	 * 说明：
	 * 只修改传入对象（omOrg）有值的字段；
	 * 应避免对（逻辑上）不可直接修改字段的更新，如：机构状态不能直接通过修改而更新；
	 * </pre>
	 * 
	 * @param omOrg
	 *            待修改机构信息
	 * @return 修改后的机构信息
	 * @throws ToolsRuntimeException
	 */
	void updateOrg(OmOrg omOrg) throws ToolsRuntimeException;
	
	/**
	 * <pre>
	 * 移动机构，及调整机构层级，将机构（orgCode）从原父机构（fromParentsOrgCode）调整到新父机构（toParentsOrgCode）下。
	 * 如果机构有下级机构，逻辑上会被一同拖动（重新生成并修改‘机构序列’），
	 * 一般在机构树上拖拽机构节点时执行。
	 * </pre>
	 * 
	 * @param orgCode
	 *            待调整机构代码
	 * @param fromParentsOrgCode
	 *            原父机构代码
	 * @param toParentsOrgCode
	 *            新父机构代码（可空，表示将原机构提升为根节点机构）
	 * @param toSortNo
	 *            位于新父机构树下的顺序号，如果为0或null，则排到最后。
	 * @return false - 调整失败(机构保持原层级顺序)</br>
	 *         true - 调整成功
	 * @throws ToolsRuntimeException
	 */
	boolean moveOrg(String orgCode, String fromParentsOrgCode, String toParentsOrgCode, int toSortNo)
			throws ToolsRuntimeException;

	/**
	 * <pre>
	 * 浅复制机构，根据已有机构（copyFromOrgCode）生成一条新的机构信息，默认排在当前树结构中最后。
	 * 
	 * 说明：
	 * 此为浅拷贝，只复制机构表（OM_ORG）记录自己；
	 * 通过拷贝新生成的机构状态为‘停用’；
	 * </pre>
	 * 
	 * @param copyFromOrgCode
	 *            源机构（必须指定）
	 * @param newOrgCode
	 *            新的机构代码（必须指定）
	 * @return 新机构
	 * @throws ToolsRuntimeException
	 */
	OmOrg copyOrg(String copyFromOrgCode, String newOrgCode) throws ToolsRuntimeException;
	
	/**
	 * <pre>
	 * 深度复制机构，根据已有机构（copyFromOrgCode）生成一条新的机构信息，默认排在当前树结构中最后。
	 * 
	 * 说明：深度复制时，包括内容为 —— 
	 *  复制机构本身；
	 * 	可指定，同时复制机构所拥有的角色；
	 * 	可指定，同时复制机构下的岗位（OmPosition）信息，其中新岗位代码默认增加Copyfrom前缀表示标识；
	 * 	可指定，同时复制新岗位所拥有的角色；
	 * 	可指定，同时复制机构下的工作组（OmGroup）信息，其中新工作组代码默认增加Copyfrom前缀表示标识；
	 * 	可指定，同时复制新工作组所拥有的角色；
	 * 	通过拷贝新生成的机构状态为‘停用’；
	 * 
	 * 特别说明：深度复制时，不复制内容包括（不合理） —— 
	 * 	不复制机构下从属子机构；（逻辑上一个机构不会同时有两个上级机构）
	 * 	不复制机构对应业务机构信息；（逻辑上新机构将作为什么业务机构分类不确定）
	 * 	不复制机构人员所属关系；（暂不实现，看具体需求）
	 * </pre>
	 * 
	 * @param copyFromOrgCode
	 *            源机构（必须指定）
	 * @param newOrgCode
	 *            新的机构代码（必须指定）
	 * @param copyOrgRole
	 *            是否同时复制机构拥有的角色</br>
	 *            true - 复制 </br>
	 *            false - 不复制（默认）
	 * @param copyPosition
	 *            是否同时复制机构下岗位</br>
	 *            true - 复制 </br>
	 *            false - 不复制（默认）
	 * @param copyPositionRole
	 *            是否同时复制岗位拥有的角色</br>
	 *            true - 复制 </br>
	 *            false - 不复制（默认）
	 * @param copyGroup
	 *            是否复制机构拥有的工作组</br>
	 *            true - 复制 </br>
	 *            false - 不复制（默认）
	 * @param copyGroupRole
	 *            是否复制机构拥有的工作组拥有的角色</br>
	 *            true - 复制 </br>
	 *            false - 不复制（默认）
	 * @return 新机构信息
	 * @throws ToolsRuntimeException
	 */
	OmOrg copyOrgDeep(String copyFromOrgCode, String newOrgCode, boolean copyOrgRole, boolean copyPosition,
			boolean copyPositionRole, boolean copyGroup, boolean copyGroupRole) throws ToolsRuntimeException;

	/*
	 * ==========================================
	 * 处理机构状态的服务
	 * 
	 * 停用 --（enabled）-->  正常
	 * 正常 --（cancel）-->   注销
	 * 注销 --（reenable）--> 正常
	 * 注销 --（disable）-->  停用
	 * ==========================================
	 */
	
	/**
	 * <pre>
	 * （根据orgCode）启用机构
	 * 
	 * 说明：
	 * 将机构状态从'停用'转变为'正常'
	 * 启用机构时可同时指定生效日期和失效日期
	 * </pre>
	 * 
	 * @param orgCode
	 *            机构代码
	 * @param startDate
	 *            生效日期（不指定，默认为启用时日期）
	 * @param endDate
	 *            失效日期（不指定，则没有失效日期）
	 * @return 启用后的机构信息
	 * @throws ToolsRuntimeException
	 */
	OmOrg enabledOrg(String orgCode, Date startDate, Date endDate) throws ToolsRuntimeException;

	/**
	 * <pre>
	 * （根据机构代码）重新启用机构
	 * 
	 * </pre>
	 * 
	 * @param orgCode
	 *            机构代码
	 * @return 重启后的机构
	 * @throws ToolsRuntimeException
	 */
	OmOrg reenabledOrg( String orgCode )  throws ToolsRuntimeException;

	/**
	 * <pre>
	 * （根据机构代码）停用机构
	 * 
	 * 说明：
	 * 停用机构，意味着去掉机构智能，停用后的机构回到‘停用’状态，可被删除；
	 * </pre>
	 * 
	 * @param orgCode
	 *            机构代码
	 * @return 停用后的机构信息
	 * @throws ToolsRuntimeException
	 */
	OmOrg disabledOrg( String orgCode )  throws ToolsRuntimeException;
	
	/**
	 * <pre>
	 * 根据机构代码注销机构
	 * 
	 * </pre>
	 * 
	 * @param orgCode
	 *            机构代码
	 * @return 注销后的机构
	 * @throws ToolsRuntimeException
	 */
	OmOrg cancelOrg(String orgCode) throws ToolsRuntimeException;
	
	/**
	 * <pre>
	 * 根据org_code删除（记录删除）空机构
	 * 
	 * <ol>何为‘空机构’：
	 * <li/>机构状态必须为‘停用’；
	 * <li/>机构不能存在下级机构；
	 * <li/>机构不能有关联业务机构定义；
	 * <li/>机构不能有员工；
	 * <li/>机构不能有岗位定义；
	 * <li/>结构不能有工作组；
	 * </ol>
	 * <ol>一并删除的关联数据包括：
	 * <li/>机构对应的角色集映射关系（AC_PARTY_ROLE）；
	 * <ol/>
	 * </pre>
	 * 
	 * @param orgCode
	 *            待删除机构的org_code（机构代码）
	 * @throws ToolsRuntimeException
	 */
	void deleteEmptyOrg(String orgCode) throws ToolsRuntimeException;
	
	/**
	 * <pre>
	 * 根据条件（WhereCondition）批量删除空机构
	 * 
	 * </pre>
	 * @param wc 条件
	 */
	void deleteEmptyOrgsByCondition(WhereCondition wc) throws ToolsRuntimeException;
	
	/*
	 * ==========================================
	 * 对机构信息的查询服务
	 * 
	 * 查询机构信息
	 * 查询机构下子机构列表
	 * 查询机构下人员列表
	 * 查询机构下岗位列表
	 * ==========================================
	 */
	
	/**
	 * <pre>
	 * 根据机构代码（orgCode）查询机构记录
	 * </pre>
	 * 
	 * @param orgCode
	 *            机构代码
	 * @return 对应的机构记录，无记录返回null
	 */
	OmOrg queryOrg(String orgCode);

	/**
	 * <pre>
	 * 根据条件（WhereCondition）查询机构记录
	 * 
	 * 说明：
	 * 根据查询意图拼接WhereCondition；
	 * </pre>
	 * 
	 * @param wc
	 *            查询条件
	 * @return 匹配条件的机构记录们，无记录返回null
	 */
	List<OmOrg> queryOrgsByCondition(WhereCondition wc);
	
	/**
	 * <pre>
	 * 查询机构下直属子机构记录（只包括第一层）
	 * 
	 * 说明：
	 * 一般在展示机构树时调用
	 * </pre>
	 * 
	 * @param orgCode
	 *            机构代码
	 * @return 子机构记录们，无记录返回null
	 */
	List<OmOrg> queryChilds(String orgCode);

	/**
	 * <pre>
	 * 查询机构（orgCode）下所有子机构记录（该机构下，完整的树结构，意味着嵌套查询所有层级的子机构）
	 * </pre>
	 * 
	 * @param orgCode
	 *            机构代码
	 * @return 子机构记录们，无记录返回null
	 */
	List<OmOrg> queryAllChilds(String orgCode) ;

	/**
	 * <pre>
	 * 查询机构（orgCode）下所有子机构记录（该机构下，完整的树结构，意味着嵌套查询所有层级的子机构）
	 * </pre>
	 * 
	 * @param orgCode
	 *            机构代码
	 * @param orgCondition
	 *            查询条件
	 * @return 子机构记录们，无记录返回null
	 */
	List<OmOrg> queryChildsByCondition(String orgCode, OmOrg orgCondition);

	/**
	 * 查询所有根节点机构
	 * @return
	 */
	List<OmOrg> queryAllRoot() ;
}