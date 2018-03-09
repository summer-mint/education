package springbootdemo.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import springbootdemo.com.Entity.User;


@Component
public interface Userdao extends JpaRepository<User,Integer>{

	public User findByuserId(long userId);

	 
}
