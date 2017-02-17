package com.rnh.showmethecard.model.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.rnh.showmethecard.model.mapper.CardMapper;


@Repository(value = "cardDao")
public class MysqlCardDao implements CardDao {
	
	@Autowired
	@Qualifier("cardMapper")
	private CardMapper cardMapper;	
	
	
	@Override
	public int selectCardDbBySiteUrl(String siteUrl) {
		System.out.println("mysql");
		String a = cardMapper.selectCardDbBySiteUrl(siteUrl);
		int b = 0;
		if(a == null){
			return b;
		}
//		System.out.printf("a: %d//b: %d \n", a , b );
		return b = Integer.parseInt(a);
	}
	
	@Override
	public void insertCardDb(String userId, String url) {
	}
	
	@Override
	public void insertMyCard(int cardNo, String mycComment) {
	}

//	@Override
//	public Member selectMemberById(String mId) {
//		Member member = memberMapper.selectMemberById(mId);
//		return member;
//	}
//
//	@Override
//	public Member selectMemberByIdAndPasswd(String mId, String password) {
//		HashMap<String, Object> params = new HashMap<>();
//		params.put("mId", mId);
//		params.put("password", password);
//		
//		Member member = memberMapper.selectMemberByIdAndPasswd(params);
//		return member;
//	}
//
//	@Override
//	public void updateMemberById(Member member) {
//		memberMapper.updateMemberById(member);	
//	}
//
//	@Override
//	public void deleteMemberById(String mId) {
//		memberMapper.deleteMemberById(mId);		
//	}
//
//	@Override
//	public List<Member> selectMemberList() {
//		List<Member> members = memberMapper.selectMembers();
//		return members;
//	}
//
//	@Override
//	public List<MemberHistory> selectPointHistory(String mId) {
//		List <MemberHistory> history = memberMapper.selectPointHistory(mId);
//		return history;
//	}

}









