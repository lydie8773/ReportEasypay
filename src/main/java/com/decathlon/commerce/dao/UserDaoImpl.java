package com.decathlon.commerce.dao;

import com.decathlon.commerce.model.User;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("userDao")
public class UserDaoImpl extends AbstractDao<String, User> implements UserDao {

	static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	public User findByUserid(String userid) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("userid", userid));
		User user = (User)crit.uniqueResult();

		return user;
	}

	public User findByName(String name) {
		logger.info("name ::", name);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("userid ::", name));
		User user = (User)crit.uniqueResult();
//		if(user!=null){
//			Hibernate.initialize(user.getUserProfiles());
//		}
		return user;
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("userid"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<User> users = (List<User>) criteria.list();
		
		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
		return users;
	}

	public void save(User user) {
		persist(user);
	}

	@Override
	public void deleteByUserid(String userid) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("userid ::", userid));
		User user = (User)crit.uniqueResult();
		delete(user);
	}

}
