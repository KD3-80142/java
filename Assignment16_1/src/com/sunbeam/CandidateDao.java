package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable {
	private Connection con;
	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}
	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int save(Candidate c) throws SQLException {
		String sql = "INSERT into candidates values (?,?,?,?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1,c.getId());
			stmt.setString(2,c.getName());
			stmt.setString(3,c.getParty());
			stmt.setInt(4,c.getVotes());
	
			int cnt = stmt.executeUpdate();
			return cnt;
		} 
	}
	public int update(Candidate c) throws SQLException {
		String sql = "UPDATE candidates SET name=?,party=? where id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1,c.getName());
			stmt.setString(2,c.getParty());
         	stmt.setInt(3, c.getId());
			int cnt = stmt.executeUpdate();
			return cnt; 
		} 
	}
	public List<PartyVotes> getPartywiseVotes() throws SQLException{
		List<PartyVotes> pv= new ArrayList<>();
		String sql="SELECT party,sum(votes) from candidates group by party";
		try(PreparedStatement st = con.prepareStatement(sql)){
           //st.setString(1, sql);
           try(ResultSet rs = st.executeQuery()){
        	   while(rs.next()) {
        		    int votes = rs.getInt("sum(votes)");
					String party = rs.getString("party");
					
					PartyVotes c = new PartyVotes(votes, party);
					pv.add(c);
					
        	   }
        	   
           }
           
		}
		
		return pv;
		
	}
	
	
	
	
	
	
	
}
