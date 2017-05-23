package org.tis.tools;

import java.io.Serializable;

/**
 * Model class of 角色数据范围权限对应.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class AcRoleDatascope implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 权限集(角色). */
	private AcRole roleacRole;

	/** 数据范围权限. */
	private AcDatascope datascopeacDatascope;

	/**
	 * Constructor.
	 */
	public AcRoleDatascope() {
	}

	/**
	 * Set the 权限集(角色).
	 * 
	 * @param roleacRole
	 *            权限集(角色)
	 */
	public void setroleacRole(AcRole roleacRole) {
		this.roleacRole = roleacRole;
	}

	/**
	 * Get the 权限集(角色).
	 * 
	 * @return 权限集(角色)
	 */
	public AcRole getroleacRole() {
		return this.roleacRole;
	}

	/**
	 * Set the 数据范围权限.
	 * 
	 * @param datascopeacDatascope
	 *            数据范围权限
	 */
	public void setdatascopeacDatascope(AcDatascope datascopeacDatascope) {
		this.datascopeacDatascope = datascopeacDatascope;
	}

	/**
	 * Get the 数据范围权限.
	 * 
	 * @return 数据范围权限
	 */
	public AcDatascope getdatascopeacDatascope() {
		return this.datascopeacDatascope;
	}


}