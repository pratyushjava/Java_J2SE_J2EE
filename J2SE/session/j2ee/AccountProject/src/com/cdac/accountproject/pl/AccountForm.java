package com.cdac.accountproject.pl;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.cdac.accountproject.dal.Account;
import com.cdac.accountproject.dal.AccountDao;
import com.cdac.accountproject.dal.AccountDaoImpl;

public class AccountForm extends JFrame{
JPanel panel;
JLabel l1,l2,l3,info;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5,b6;

public AccountForm() {

	initGui();

}

void initGui()
{
panel=new JPanel();

panel.setBackground(Color.cyan);
l1=new JLabel("Accno");
l2=new JLabel("Name");
l3=new JLabel("Balance");
info=new JLabel("");

t1=new JTextField(10);
t2=new JTextField(10);
t3=new JTextField(10);

b1=new JButton("CREATE");
b2=new JButton("RETRIEVE");
b3=new JButton("UPDATE");
b4=new JButton("DELETE");
b5=new JButton("RETRIEVEALL");
b6=new JButton("EXIT");


panel.add(l1);
panel.add(t1);
panel.add(l2);
panel.add(t2);
panel.add(l3);
panel.add(t3);
panel.add(b1);
panel.add(b2);
panel.add(b3);
panel.add(b4);
panel.add(b5);
panel.add(b6);

add(panel);

setTitle("Account Form");
setSize(500,500);
setVisible(true);

b1.addActionListener(new AccountService());

b2.addActionListener(new AccountService());

b3.addActionListener(new AccountService());

b4.addActionListener(new AccountService());

b5.addActionListener(new AccountService());

b6.addActionListener(new AccountService());

}//initGUI

public static void main(String[] args) {
	
	new AccountForm();
	
}
	
class AccountService implements ActionListener{

AccountDao ad=new AccountDaoImpl();	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {

		Integer accno=Integer.parseInt(t1.getText());
		String name=t2.getText();
		Double balance=Double.parseDouble(t3.getText());
		
	
		Account a=new Account();
		a.setAccno(accno);
		a.setName(name);
		a.setBalance(balance);
		
		
		
		if(ae.getSource()==b1)
		{
			if(ad.createAccount(a))
			JOptionPane.showMessageDialog(null,"Account created successfully");
			else
			JOptionPane.showMessageDialog(null,"Problem in");
				
			
			
			
		}
			if(ae.getSource()==b2)
			{
				Account ac=ad.retrieveAccount(accno);
				
				if(ac!=null)
					JOptionPane.showMessageDialog(null,"Account found");
					else
					JOptionPane.showMessageDialog(null,"Problem in");
		
				
				
				
			}
				if(ae.getSource()==b3)
	             {
					if(ad.updateAccount(a))
						JOptionPane.showMessageDialog(null,"Account updated successfully");
						else
						JOptionPane.showMessageDialog(null,"Problem in");
								
					
					
	             }
					if(ae.getSource()==b4)
					{
						if(ad.deleteAccount(accno))
							JOptionPane.showMessageDialog(null,"Account deleted successfully");
							else
							JOptionPane.showMessageDialog(null,"Problem in");
									
						
					}
						if(ae.getSource()==b5)
						{
							ArrayList<Account> accounts=ad.retrieveAllAccounts();
							
							if(accounts.size()>0)
							JOptionPane.showMessageDialog(null,"Accounts found");
							else
							JOptionPane.showMessageDialog(null,"Problem in");
												
							
						}	

							if(ae.getSource()==b6)
							{
							System.exit(0);	
						}
		
		
	
		
	}
	
}





}
