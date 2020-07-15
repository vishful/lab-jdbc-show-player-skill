package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utility.ConnectionManager;
import dao.SkillDAO;
import model.Skill;

public class Main{
	
	public static void main(String[]args) throws SQLException, Exception {

		Skill skills = new Skill();
		SkillDAO skilldao =  new SkillDAO();
		List<Skill> skillList = new ArrayList<Skill>();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		System.out.println("Read");
		skillList =skilldao.listAllSkills();
		if(skillList!=null)
		{
		for(Skill skills1:skillList) {
			System.out.println(skills1.getSkilld());
			System.out.println(skills1.getSkillName());
		
	}
	
}
}
}