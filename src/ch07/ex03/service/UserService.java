package ch07.ex03.service;

import ch07.ex03.domain.User;

public interface UserService {
	public User getUser();
	public void addUser(User user);//추가
	public void fixUser(String userName);//수정
	public void delUser();//삭제
}
