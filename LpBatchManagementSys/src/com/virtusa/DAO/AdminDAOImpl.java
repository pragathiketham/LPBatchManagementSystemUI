package com.virtusa.DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Admin;
import com.virtusa.integrate.ConnectionManager;
import com.virtusa.model.AdminModel;
import com.virtusa.model.LpDetailsModel;
import com.virtusa.model.ViewBatchDetailsModel;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public List<ViewBatchDetailsModel> viewBatchDetails() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from batch");
		
		List<ViewBatchDetailsModel> batchDetailsModelList = new ArrayList<>();
		while(resultSet.next()) {
			ViewBatchDetailsModel viewBatchDetailsModel = new ViewBatchDetailsModel();
			viewBatchDetailsModel.setBatchId(resultSet.getString("batch_id"));
			viewBatchDetailsModel.setBatchName(resultSet.getString("batch_name"));
			viewBatchDetailsModel.setBatchCapacity(resultSet.getString("batch_capacity"));
			viewBatchDetailsModel.setBatchMentorId(resultSet.getString("batch_mentor_id"));
			viewBatchDetailsModel.setBatchVenueId(resultSet.getString("batch_venue_id"));
			viewBatchDetailsModel.setBatchStartDate(resultSet.getDate("batch_startDate"));
			viewBatchDetailsModel.setBatchEndDate(resultSet.getDate("batch_endDate"));
			batchDetailsModelList.add(viewBatchDetailsModel);	
			
			System.out.println(batchDetailsModelList);
		}
		
		ConnectionManager.closeConnection();
		return batchDetailsModelList;
	}
	
	@Override
    public List<LpDetailsModel> lpDetailsListShow() throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        Connection connection = ConnectionManager.openConnection();
        Statement statement =connection.createStatement();
        List<LpDetailsModel> lpdetailsModellist = new ArrayList<LpDetailsModel>();
        ResultSet res = statement.executeQuery("select * from lpdetails");
        while(res.next()) {
            LpDetailsModel lpdetailsmodel = new LpDetailsModel();
            lpdetailsmodel.setLpid(res.getString("lp_id"));
            lpdetailsmodel.setLastname(res.getString("first_name"));
            lpdetailsmodel.setFirstname(res.getString("last_name"));
            lpdetailsmodel.setDob(res.getDate("dob"));
            lpdetailsmodel.setPhonenumber(res.getString("phone_number"));
            lpdetailsmodel.setLpid(res.getString("email"));
            lpdetailsmodel.setDesignation(res.getString("designation"));
            lpdetailsmodel.setCity(res.getString("city"));
            lpdetailsmodel.setState(res.getString("state"));
            lpdetailsmodel.setCountry(res.getString("country"));
            lpdetailsModellist.add(lpdetailsmodel);
        }
   
        ConnectionManager.closeConnection();
        return lpdetailsModellist;
	}

	@Override
	public boolean updateAdminProfile(Admin admin) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Connection connection = ConnectionManager.openConnection();
		 PreparedStatement statement=connection.prepareStatement("UPDATE admindetails SET first_name=?,last_name=?,phone_number=?,email=?,role=?,city=?,state=?,country=? where admin_id=?");

		 statement.setString(1, admin.getFirstName());
			statement.setString(2, admin.getLastName());
			statement.setString(3, admin.getPhoneNumber());
			statement.setString(4, admin.getEmail());
			statement.setString(5, admin.getRole());
			statement.setString(6, admin.getCity());
			statement.setString(7, admin.getState());
			statement.setString(8, admin.getCountry());
			statement.setString(9, admin.getAdminId());
			int rows=statement.executeUpdate();
			ConnectionManager.closeConnection();
			boolean result=false;
			if (rows > 0)

				result = true;
			else
				return false;

			return result;
			
		
	}

	@Override
	public List<Admin> adminProfileView(String userId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = ConnectionManager.openConnection();
PreparedStatement statement = connection.prepareStatement("select admin_id,first_name,last_name,phone_number,email,role,city,state,country from admin_details where admin_id=?");
		
		statement.setString(1, userId);

		ResultSet resultSet = statement.executeQuery();
		Admin admin = new Admin();
		
		List<Admin> adminList = new ArrayList<>();
		
		while (resultSet.next()) {

			admin.setAdminId(resultSet.getString("admin_id"));
			admin.setFirstName(resultSet.getString("first_name"));
			admin.setLastName(resultSet.getString("last_name"));
			admin.setEmail(resultSet.getString("email"));
			admin.setPhoneNumber(resultSet.getString("phone_number"));
			admin.setRole(resultSet.getString("role"));
			admin.setCity(resultSet.getString("city"));
			admin.setState(resultSet.getString("state"));
			admin.setCountry(resultSet.getString("country"));
			adminList.add(admin);
		}
		ConnectionManager.closeConnection();
		return adminList;
		
	}

	
}
