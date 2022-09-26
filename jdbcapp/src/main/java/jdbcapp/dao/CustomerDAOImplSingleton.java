package jdbcapp.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import jdbcapp.dto.Customer;
import jdbcapp.util.DBConnSingleton;
import jdbcapp.util.DBConnectionUtil;

public class CustomerDAOImplSingleton implements CustomerDAO {

	public Integer addCustomer(Customer customer) {
		int row=0;
		PreparedStatement preparedstatement;
		try {
			preparedstatement = DBConnSingleton.getInstance()
					.prepareStatement("INSERT INTO customer(customerId,customerName,birthDate,mobile,email) VALUES(?,?,?,?,?)");
			preparedstatement.setInt(1,customer.getCustomerId());
			preparedstatement.setString(2,customer.getCustomerName());
			preparedstatement.setDate(3,Date.valueOf(customer.getBirthDate()));
			preparedstatement.setLong(4,customer.getMobile());
			preparedstatement.setString(5, customer.getEmail());
			row=preparedstatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}

	public Customer getCustomerById(Integer customerId) {
		//parameterized query or dynamic query will have to use 
		//select *from customer where customerId=1;
		Customer customer=new Customer();
		try {
			PreparedStatement pStmt= DBConnSingleton.getInstance()
					.prepareStatement("select *from customer where customerId=?");
			pStmt.setInt(1,customerId);
			ResultSet rs=pStmt.executeQuery();
			if(rs.next()) {
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString("customerName"));
				customer.setEmail(rs.getString("email"));
				customer.setMobile(rs.getLong("mobile"));
				customer.setBirthDate(rs.getDate(3).toLocalDate());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}

	public List<Customer> getAllCustomers() {
		List<Customer> customerList=new ArrayList<Customer>();
		//get a connection object
		try {
		Connection con=DBConnSingleton.getInstance();
		//Create a statement 
		
			Statement statement = con.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from customer");
			
		//Process the resultset
		if(resultSet.next()) {
			Customer customer=new Customer();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerName(resultSet.getString("customerName"));
			customer.setEmail(resultSet.getString("email"));
			customer.setMobile(resultSet.getLong("mobile"));
			customer.setBirthDate(resultSet.getDate(3).toLocalDate());
			customerList.add(customer);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerList;
	}

	public Integer updateCustomer(Customer customer) {
		int row=0;
		PreparedStatement update;
		try {
			update = DBConnSingleton.getInstance()
					.prepareStatement("UPDATE customer SET customerName=?, birthDate=?,mobile=?,email=?  WHERE customerId=?");
			
			update.setString(1,customer.getCustomerName());
			update.setDate(2, Date.valueOf(customer.getBirthDate()));
			update.setLong(3, customer.getMobile());
			update.setString(4,customer.getEmail());
			update.setInt(5,customer.getCustomerId() );
			row=update.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return row;
	}

	public Integer deleteCustomer(Integer customerId) {
		int row=0;
		PreparedStatement pStmt;
		try {
			pStmt = DBConnSingleton.getInstance()
					.prepareStatement("DELETE  FROM customer WHERE customerId=?");
			pStmt.setInt(1,customerId);
			row=pStmt.executeUpdate();
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}
	public void addCustomerUsingSP(Customer customer) {
		try {
			CallableStatement cstmt = DBConnSingleton.getInstance().prepareCall("{call add_customer(?,?,?,?,?)}");
			cstmt.setInt(1, customer.getCustomerId());
			cstmt.setString(2, customer.getCustomerName());
			cstmt.setDate(3, Date.valueOf(customer.getBirthDate()));
			cstmt.setLong(4, customer.getMobile());
			cstmt.setString(5, customer.getEmail());
			cstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}