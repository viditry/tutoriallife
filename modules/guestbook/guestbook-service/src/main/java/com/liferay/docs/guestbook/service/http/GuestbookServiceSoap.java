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

package com.liferay.docs.guestbook.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.guestbook.service.GuestbookServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>GuestbookServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.docs.guestbook.model.GuestbookSoap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.docs.guestbook.model.Guestbook</code>, that is translated to a
 * <code>com.liferay.docs.guestbook.model.GuestbookSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author lifera7
 * @see GuestbookServiceHttp
 * @generated
 */
@ProviderType
public class GuestbookServiceSoap {

	public static com.liferay.docs.guestbook.model.GuestbookSoap addGuestbook(
			long userId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.docs.guestbook.model.Guestbook returnValue =
				GuestbookServiceUtil.addGuestbook(userId, name, serviceContext);

			return com.liferay.docs.guestbook.model.GuestbookSoap.toSoapModel(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.guestbook.model.GuestbookSoap[]
			getGuestbooks(long groupId)
		throws RemoteException {

		try {
			java.util.List<com.liferay.docs.guestbook.model.Guestbook>
				returnValue = GuestbookServiceUtil.getGuestbooks(groupId);

			return com.liferay.docs.guestbook.model.GuestbookSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.guestbook.model.GuestbookSoap[]
			getGuestbooks(long groupId, int start, int end)
		throws RemoteException {

		try {
			java.util.List<com.liferay.docs.guestbook.model.Guestbook>
				returnValue = GuestbookServiceUtil.getGuestbooks(
					groupId, start, end);

			return com.liferay.docs.guestbook.model.GuestbookSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.guestbook.model.GuestbookSoap[]
			getGuestbooks(
				long groupId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.docs.guestbook.model.Guestbook> obc)
		throws RemoteException {

		try {
			java.util.List<com.liferay.docs.guestbook.model.Guestbook>
				returnValue = GuestbookServiceUtil.getGuestbooks(
					groupId, start, end, obc);

			return com.liferay.docs.guestbook.model.GuestbookSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getGuestbooksCount(long groupId) throws RemoteException {
		try {
			int returnValue = GuestbookServiceUtil.getGuestbooksCount(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(GuestbookServiceSoap.class);

}