	package com.ib.metier;

	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
	import java.util.List;

import com.ib.beans.User;
import com.ib.beans.Comptes;
import com.ib.beans.Operations;
import com.ib.metier.Message;

public class BddConnect {
	
public static List<User> findAllUser() {
		
		List<User> users=new ArrayList<User>();
		
        Connection con = null;
        Statement stmt = null;
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        	con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test", "root", "root");
            stmt = (Statement) con.createStatement();
           
            ResultSet rset = stmt.executeQuery("select * from sac_person");
          
            while (rset.next()) {
            	User user =new User();
            	user.setPerson_id(rset.getInt(1));
                user.setPerson_external_id(rset.getString(2));
                user.setPerson_firstname(rset.getString(3));
                user.setPerson_lastname(rset.getString(4));
                user.setPerson_email(rset.getString(5));
                user.setPerson_password(rset.getString(6));
                user.setPerson_dob(rset.getString(7));
                user.setPerson_token(rset.getString(8));
                user.setPerson_phone_number(rset.getString(9));
                user.setPerson_created_At(rset.getString(10));
                user.setPerson_updated_at(rset.getString(11));
                user.setPerson_advisor_id(rset.getInt(12));
                user.setPerson_is_advisor(rset.getInt(13));
            	
            	users.add(user);
            	
            	
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
		return users;
	}
	
	
	
public static List<Operations> findOperation( int idClient) {
    List<Operations> operations = new ArrayList<Operations>();
    Connection con = null;
    Statement stmt = null;
    try {
    	Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test", "root", "root");
        stmt = (Statement) con.createStatement();
        ResultSet rset = stmt.executeQuery("select * from sac_operation where ope_account_id="+ idClient);
        while (rset.next()) {
        	Operations operation = new Operations();
        	operation.setOp_id(rset.getInt(1));
        	operation.setOp_type(rset.getString(2));
        	operation.setOpe_amount(rset.getInt(3));
        	operation.setOpDescription(rset.getString(4));
        	operation.setOpeAccountId(rset.getInt(5));
        	operation.setOpeCreated(rset.getTimestamp(6));
        	operation.setOpeUpdated(rset.getTimestamp(7));
        	operation.setOpe_dispute(rset.getInt(8));
        	operations.add(operation);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
		e.printStackTrace();
	} finally {

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
	return operations;
}
	
	public static List<Operations> findOperationId( int idOperation) {
        List<Operations> operations = new ArrayList<Operations>();
        Connection con = null;
        Statement stmt = null;
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test", "root", "root");
            stmt = (Statement) con.createStatement();
            ResultSet rset = stmt.executeQuery("select * from sac_operation where ope_id="+ idOperation);
            while (rset.next()) {
            	Operations operation = new Operations();
            	operation.setOp_id(rset.getInt(1));
            	operation.setOp_type(rset.getString(2));
            	operation.setOpe_amount(rset.getInt(3));
            	operation.setOpDescription(rset.getString(4));
            	operation.setOpeAccountId(rset.getInt(5));
            	operation.setOpeCreated(rset.getTimestamp(6));
            	operation.setOpeUpdated(rset.getTimestamp(7));
            	operation.setOpe_dispute(rset.getInt(8));
            	operations.add(operation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
		return operations;
	}
	private static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}
	public static void ajoutMsg(Message msg ){
		Connection con = null;
        Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test", "root", "root");
            String query = "Insert Into sac_messages VALUES ( null,?,?,?,?)";
            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
            preparedStmt.setString(1, msg.getMsg_content());
            preparedStmt.setInt(2,msg.getMsg_from() );
            preparedStmt.setInt(3,msg.getMsg_to() );
            preparedStmt.setTimestamp(4,getCurrentTimeStamp());
            preparedStmt.executeUpdate();
            System.out.println("c bonn");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            if (stmt != null) {
                try {
                    // Le stmt.close ferme automatiquement le rset.
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
	}
	public static void suppOperation(int clientID,int num_op ){
		Connection con = null;
        Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test", "root", "root");
            String query = "delete from sac_operation where ope_id=? and ope_account_id=?";
            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
            preparedStmt.setInt(1, num_op);
            preparedStmt.setInt(2,clientID);
            preparedStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            if (stmt != null) {
                try {
                    // Le stmt.close ferme automatiquement le rset.
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
	}
	
	public static List<Comptes> findCompte( int idClient) {
        List<Comptes> comptes = new ArrayList<Comptes>();
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test", "root", "root");
            stmt = (Statement) con.createStatement();
            ResultSet rset = stmt.executeQuery("select * from sac_accounts where account_customer_id="+ idClient);
            while (rset.next()) {
                Comptes compte = new Comptes();
                compte.setAccount_id(rset.getInt(1));
                compte.setAccount_customer_id(rset.getString(2));
                compte.setAccount_balance(rset.getFloat(3));
                compte.setAccount_type(rset.getString(4));
                compte.setAccount_is_default(rset.getInt(5));
               
                comptes.add(compte);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

           if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

           if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return comptes;
    }
	
	
	
	public static List<User> findUser( int idConseiller) {
        List<User> users = new ArrayList<User>();
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test", "root", "root");
            stmt = (Statement) con.createStatement();
            ResultSet rset = stmt.executeQuery("select * from sac_person where person_advisor_id="+ idConseiller);
            while (rset.next()) {
                User user = new User();
                             
                user.setPerson_id(rset.getInt(1));
                user.setPerson_external_id(rset.getString(2));
                user.setPerson_firstname(rset.getString(3));
                user.setPerson_lastname(rset.getString(4));
                user.setPerson_email(rset.getString(5));
                user.setPerson_password(rset.getString(6));
                user.setPerson_dob(rset.getString(7));
                user.setPerson_token(rset.getString(8));
                user.setPerson_phone_number(rset.getString(9));
                user.setPerson_created_At(rset.getString(10));
                user.setPerson_updated_at(rset.getString(11));
                user.setPerson_advisor_id(rset.getInt(12));
                user.setPerson_is_advisor(rset.getInt(13));
               
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

           if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

           if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return users;
    }
		
		
		public static void ajoutUser(int client_external_id, String lastname, String firstname, String email, String password, String dob, String phone, int advisor){
			Connection con = null;
	        Statement stmt = null;
	        
	        Timestamp created = getCurrentTimeStamp();
	       
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				 con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test", "root", "root");
				String query = "INSERT INTO sac_person (person_id , person_external_id , person_firstname , person_lastname , person_email , person_password , person_dob , person_phone_number , person_created_At , person_updated_at , person_advisor_id , person_is_advisor )"
						+ "VALUES(null, '"+ client_external_id +"','"+ firstname+"','"+lastname+"','"+email+"','"+password+"','"+dob+"','"+phone+"', '"+created+"', '"+created+"', '"+advisor+"', 0)";
				System.out.println("Ajout user avant");
				
	            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
	           
	            preparedStmt.executeUpdate();
	            
	            System.out.println("Ajout user apr�s");
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} finally {
	            if (stmt != null) {
	                try {
	                  
	                    stmt.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }

	            if (con != null) {
	                try {
	                    con.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
		}
		
		public static void UpdateUser(int client_id, String lastname, String firstname, String email, String password){
			Connection con = null;
	        Statement stmt = null;
	        
	        
	       
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test", "root", "root");
				
				String query = "UPDATE `sac_person` set person_firstname='"+firstname+"', person_lastname='"+lastname+"',person_email='"+email+"', person_password='"+password+"' where person_id='"+client_id+"' ";
				
				//String query = "INSERT INTO users () VALUES('"+ clientid +"','"+ name+"','"+surname+"','"+NewPass+"','0','1','"+token+"')";
				System.out.println("Modif user avant");
				
				PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
	                 
	           
	            preparedStmt.executeUpdate();
	            
	            System.out.println("Modif user apr�s");
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} finally {
	            if (stmt != null) {
	                try {
	                  
	                    stmt.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }

	            if (con != null) {
	                try {
	                    con.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
		}
		
		public static void UpdateUserConseiller(int client_external_id, String lastname, String firstname, String email, String password){
			Connection con = null;
	        Statement stmt = null;
	        
	        
	       
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test", "root", "root");
				
				System.out.println("Modif Conseiller user avant");
				
				if (firstname!=""){
					
					System.out.println("dans le firstname");
					
					String query = "UPDATE sac_person set person_firstname='"+firstname+"' where person_external_id='"+client_external_id+"' ";
					PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query); 
		            preparedStmt.executeUpdate();
				}
				
				
				
				if (lastname!=""){
					
					String query = "UPDATE sac_person set person_lastname='"+lastname+"' where person_external_id='"+client_external_id+"' ";
					PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query); 
		            preparedStmt.executeUpdate();
				}
				
				if (email!=""){
					
					String query = "UPDATE sac_person set person_email='"+email+"' where person_external_id='"+client_external_id+"' ";
					PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query); 
		            preparedStmt.executeUpdate();
				}
				
				if (password!=""){
					
					String query = "UPDATE sac_person set person_password='"+password+"' where person_external_id='"+client_external_id+"' ";
					PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query); 
		            preparedStmt.executeUpdate();
				}
	            
	            System.out.println("Modif Conseiller user apr�s");
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} finally {
	            if (stmt != null) {
	                try {
	                  
	                    stmt.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }

	            if (con != null) {
	                try {
	                    con.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
		}
		
}
