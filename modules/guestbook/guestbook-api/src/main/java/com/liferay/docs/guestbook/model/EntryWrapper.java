/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.guestbook.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Entry}.
 * </p>
 *
 * @author lifera7
 * @see Entry
 * @generated
 */
@ProviderType
public class EntryWrapper implements Entry, ModelWrapper<Entry> {

	public EntryWrapper(Entry entry) {
		_entry = entry;
	}

	@Override
	public Class<?> getModelClass() {
		return Entry.class;
	}

	@Override
	public String getModelClassName() {
		return Entry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("entryId", getEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("message", getMessage());
		attributes.put("guestbookId", getGuestbookId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		Long guestbookId = (Long)attributes.get("guestbookId");

		if (guestbookId != null) {
			setGuestbookId(guestbookId);
		}
	}

	@Override
	public Object clone() {
		return new EntryWrapper((Entry)_entry.clone());
	}

	@Override
	public int compareTo(Entry entry) {
		return _entry.compareTo(entry);
	}

	/**
	 * Returns the company ID of this entry.
	 *
	 * @return the company ID of this entry
	 */
	@Override
	public long getCompanyId() {
		return _entry.getCompanyId();
	}

	/**
	 * Returns the create date of this entry.
	 *
	 * @return the create date of this entry
	 */
	@Override
	public Date getCreateDate() {
		return _entry.getCreateDate();
	}

	/**
	 * Returns the email of this entry.
	 *
	 * @return the email of this entry
	 */
	@Override
	public String getEmail() {
		return _entry.getEmail();
	}

	/**
	 * Returns the entry ID of this entry.
	 *
	 * @return the entry ID of this entry
	 */
	@Override
	public long getEntryId() {
		return _entry.getEntryId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _entry.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this entry.
	 *
	 * @return the group ID of this entry
	 */
	@Override
	public long getGroupId() {
		return _entry.getGroupId();
	}

	/**
	 * Returns the guestbook ID of this entry.
	 *
	 * @return the guestbook ID of this entry
	 */
	@Override
	public long getGuestbookId() {
		return _entry.getGuestbookId();
	}

	/**
	 * Returns the message of this entry.
	 *
	 * @return the message of this entry
	 */
	@Override
	public String getMessage() {
		return _entry.getMessage();
	}

	/**
	 * Returns the modified date of this entry.
	 *
	 * @return the modified date of this entry
	 */
	@Override
	public Date getModifiedDate() {
		return _entry.getModifiedDate();
	}

	/**
	 * Returns the name of this entry.
	 *
	 * @return the name of this entry
	 */
	@Override
	public String getName() {
		return _entry.getName();
	}

	/**
	 * Returns the primary key of this entry.
	 *
	 * @return the primary key of this entry
	 */
	@Override
	public long getPrimaryKey() {
		return _entry.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _entry.getPrimaryKeyObj();
	}

	/**
	 * Returns the user ID of this entry.
	 *
	 * @return the user ID of this entry
	 */
	@Override
	public long getUserId() {
		return _entry.getUserId();
	}

	/**
	 * Returns the user name of this entry.
	 *
	 * @return the user name of this entry
	 */
	@Override
	public String getUserName() {
		return _entry.getUserName();
	}

	/**
	 * Returns the user uuid of this entry.
	 *
	 * @return the user uuid of this entry
	 */
	@Override
	public String getUserUuid() {
		return _entry.getUserUuid();
	}

	/**
	 * Returns the uuid of this entry.
	 *
	 * @return the uuid of this entry
	 */
	@Override
	public String getUuid() {
		return _entry.getUuid();
	}

	@Override
	public int hashCode() {
		return _entry.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _entry.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _entry.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _entry.isNew();
	}

	@Override
	public void persist() {
		_entry.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_entry.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this entry.
	 *
	 * @param companyId the company ID of this entry
	 */
	@Override
	public void setCompanyId(long companyId) {
		_entry.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this entry.
	 *
	 * @param createDate the create date of this entry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_entry.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this entry.
	 *
	 * @param email the email of this entry
	 */
	@Override
	public void setEmail(String email) {
		_entry.setEmail(email);
	}

	/**
	 * Sets the entry ID of this entry.
	 *
	 * @param entryId the entry ID of this entry
	 */
	@Override
	public void setEntryId(long entryId) {
		_entry.setEntryId(entryId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_entry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_entry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_entry.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this entry.
	 *
	 * @param groupId the group ID of this entry
	 */
	@Override
	public void setGroupId(long groupId) {
		_entry.setGroupId(groupId);
	}

	/**
	 * Sets the guestbook ID of this entry.
	 *
	 * @param guestbookId the guestbook ID of this entry
	 */
	@Override
	public void setGuestbookId(long guestbookId) {
		_entry.setGuestbookId(guestbookId);
	}

	/**
	 * Sets the message of this entry.
	 *
	 * @param message the message of this entry
	 */
	@Override
	public void setMessage(String message) {
		_entry.setMessage(message);
	}

	/**
	 * Sets the modified date of this entry.
	 *
	 * @param modifiedDate the modified date of this entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_entry.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this entry.
	 *
	 * @param name the name of this entry
	 */
	@Override
	public void setName(String name) {
		_entry.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_entry.setNew(n);
	}

	/**
	 * Sets the primary key of this entry.
	 *
	 * @param primaryKey the primary key of this entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_entry.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_entry.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the user ID of this entry.
	 *
	 * @param userId the user ID of this entry
	 */
	@Override
	public void setUserId(long userId) {
		_entry.setUserId(userId);
	}

	/**
	 * Sets the user name of this entry.
	 *
	 * @param userName the user name of this entry
	 */
	@Override
	public void setUserName(String userName) {
		_entry.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this entry.
	 *
	 * @param userUuid the user uuid of this entry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_entry.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this entry.
	 *
	 * @param uuid the uuid of this entry
	 */
	@Override
	public void setUuid(String uuid) {
		_entry.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Entry> toCacheModel() {
		return _entry.toCacheModel();
	}

	@Override
	public Entry toEscapedModel() {
		return new EntryWrapper(_entry.toEscapedModel());
	}

	@Override
	public String toString() {
		return _entry.toString();
	}

	@Override
	public Entry toUnescapedModel() {
		return new EntryWrapper(_entry.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _entry.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EntryWrapper)) {
			return false;
		}

		EntryWrapper entryWrapper = (EntryWrapper)obj;

		if (Objects.equals(_entry, entryWrapper._entry)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _entry.getStagedModelType();
	}

	@Override
	public Entry getWrappedModel() {
		return _entry;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entry.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _entry.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_entry.resetOriginalValues();
	}

	private final Entry _entry;

}