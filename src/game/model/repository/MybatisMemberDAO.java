package game.model.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import game.model.domain.Member;

@Repository
public class MybatisMemberDAO implements MemberDAO{
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	

	public int insert(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List selectAll() {
		return sessionTemplate.selectList("Member.selectAll");
	}

	
	public Member select(int member_id) {
		// TODO Auto-generated method stub
		return null;
	}


	public int update(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int delete(int member_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
