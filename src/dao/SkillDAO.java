package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utility.ConnectionManager;
import model.Skill;


public class SkillDAO {
	static List<Skill> skillShare= new ArrayList<Skill>(); 
	
	final String SELECT_ALL_BLOGS = "Select * from SKILL1";
	
	public List< Skill > listAllSkills() throws SQLException, Exception {

		Skill skills = new Skill();
		
		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(SELECT_ALL_BLOGS);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			int skillId = rs.getInt("ID");
			String skillName = rs.getString("NAME");
			
			System.out.println(skillId);
			System.out.println(skillName);
			
			skills.setSkilld(skillId);
			skills.setSkillName(skillName);

			
			skillShare.add(skills);
	}
		return skillShare;
}

}




















/*public class SkillDAO {
	public List< Skill > listAllSkills() throws SQLException, Exception {

		Skill skills=null;
		
		
		
		//insert all the details into database

		ConnectionManager cm=new ConnectionManager();
		String sql="SELECT * (ID,NAME)VALUES(?,?)";
		//Create statement object
		PreparedStatement st= cm.getConnection().prepareStatement(sql);
		
		
		List skills=st.get
		st.executeUpdate();
		cm.getConnection().close();
		
		return (List<Skill>) skills;
	}
}
*/


