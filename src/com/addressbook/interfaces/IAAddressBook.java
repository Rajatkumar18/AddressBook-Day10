package com.addressbook.interfaces;

import com.addressbook.model.Contacts;

public interface IAAddressBook {

	int createContacts(Contacts contacts);
	void showContacts();
	void editContacts(String firstName);
	void deleteContacts(String firstName);



}
