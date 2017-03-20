package actions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import pojos.*;
import dao.*;

public class ContactAction extends ActionSupport implements ModelDriven<Contact>{

	
	private Contact contact=new Contact();
	private List<Contact> contactList;

	
	private ContactManager dao;
	
	public ContactAction() {
		System.out.println("in contact action constr");
		dao = new ContactManager();
	}
	
	public String execute() throws Exception{
		
		contactList = dao.list();
		System.out.println(contactList);
		System.out.println(contactList.size());
		return SUCCESS;
	}
	public String add() throws Exception{
		System.out.println(getContact());
		
		dao.add(getContact());
		
		return SUCCESS;
	}
	public String delete() throws Exception{
		dao.delete(contact.getId());
		return SUCCESS;
	}
	public Contact getContact() {
		return contact;
	}
	public List<Contact> getContactList() {
		return contactList;
	}
	public void setContactList(List<Contact> contactsList) {
		this.contactList = contactsList;
	}
	//for pushing Contact 

	@Override
	public Contact getModel() {
		// TODO Auto-generated method stub
		return contact;
	}
	
}
