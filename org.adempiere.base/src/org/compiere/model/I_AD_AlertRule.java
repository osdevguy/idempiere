/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_AlertRule
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
public interface I_AD_AlertRule 
{

    /** TableName=AD_AlertRule */
    public static final String Table_Name = "AD_AlertRule";

    /** AD_Table_ID=593 */
    public static final int Table_ID = 593;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_AlertRule_ID */
    public static final String COLUMNNAME_AD_AlertRule_ID = "AD_AlertRule_ID";

	/** Set Alert Rule.
	  * Definition of the alert element
	  */
	public void setAD_AlertRule_ID (int AD_AlertRule_ID);

	/** Get Alert Rule.
	  * Definition of the alert element
	  */
	public int getAD_AlertRule_ID();

    /** Column name AD_AlertRule_UU */
    public static final String COLUMNNAME_AD_AlertRule_UU = "AD_AlertRule_UU";

	/** Set AD_AlertRule_UU	  */
	public void setAD_AlertRule_UU (String AD_AlertRule_UU);

	/** Get AD_AlertRule_UU	  */
	public String getAD_AlertRule_UU();

    /** Column name AD_Alert_ID */
    public static final String COLUMNNAME_AD_Alert_ID = "AD_Alert_ID";

	/** Set Alert.
	  * iDempiere Alert
	  */
	public void setAD_Alert_ID (int AD_Alert_ID);

	/** Get Alert.
	  * iDempiere Alert
	  */
	public int getAD_Alert_ID();

	public org.compiere.model.I_AD_Alert getAD_Alert() throws RuntimeException;

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name AD_Table_ID */
    public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

	/** Set Table.
	  * Database Table information
	  */
	public void setAD_Table_ID (int AD_Table_ID);

	/** Get Table.
	  * Database Table information
	  */
	public int getAD_Table_ID();

	public org.compiere.model.I_AD_Table getAD_Table() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name ErrorMsg */
    public static final String COLUMNNAME_ErrorMsg = "ErrorMsg";

	/** Set Error Msg	  */
	public void setErrorMsg (String ErrorMsg);

	/** Get Error Msg	  */
	public String getErrorMsg();

    /** Column name FromClause */
    public static final String COLUMNNAME_FromClause = "FromClause";

	/** Set Sql FROM.
	  * SQL FROM clause
	  */
	public void setFromClause (String FromClause);

	/** Get Sql FROM.
	  * SQL FROM clause
	  */
	public String getFromClause();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsValid */
    public static final String COLUMNNAME_IsValid = "IsValid";

	/** Set Valid.
	  * Element is valid
	  */
	public void setIsValid (boolean IsValid);

	/** Get Valid.
	  * Element is valid
	  */
	public boolean isValid();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name OtherClause */
    public static final String COLUMNNAME_OtherClause = "OtherClause";

	/** Set Other SQL Clause.
	  * Other SQL Clause
	  */
	public void setOtherClause (String OtherClause);

	/** Get Other SQL Clause.
	  * Other SQL Clause
	  */
	public String getOtherClause();

    /** Column name PostProcessing */
    public static final String COLUMNNAME_PostProcessing = "PostProcessing";

	/** Set Post Processing.
	  * Process SQL after executing the query
	  */
	public void setPostProcessing (String PostProcessing);

	/** Get Post Processing.
	  * Process SQL after executing the query
	  */
	public String getPostProcessing();

    /** Column name PreProcessing */
    public static final String COLUMNNAME_PreProcessing = "PreProcessing";

	/** Set Pre Processing.
	  * Process SQL before executing the query
	  */
	public void setPreProcessing (String PreProcessing);

	/** Get Pre Processing.
	  * Process SQL before executing the query
	  */
	public String getPreProcessing();

    /** Column name SelectClause */
    public static final String COLUMNNAME_SelectClause = "SelectClause";

	/** Set Sql SELECT.
	  * SQL SELECT clause
	  */
	public void setSelectClause (String SelectClause);

	/** Get Sql SELECT.
	  * SQL SELECT clause
	  */
	public String getSelectClause();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name WhereClause */
    public static final String COLUMNNAME_WhereClause = "WhereClause";

	/** Set Sql WHERE.
	  * Fully qualified SQL WHERE clause
	  */
	public void setWhereClause (String WhereClause);

	/** Get Sql WHERE.
	  * Fully qualified SQL WHERE clause
	  */
	public String getWhereClause();
}
