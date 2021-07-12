package com.luv2code.springboot.thymeleafdemo.service;


import com.luv2code.springboot.thymeleafdemo.dao.AdminRepository;
import com.luv2code.springboot.thymeleafdemo.dao.EmployeeRepository;
import com.luv2code.springboot.thymeleafdemo.entity.Admin;
import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
//@Transactional(transactionManager = "admin-transactionManager")
public class AdminServiceImpl implements AdminService{

   // @Autowired
   // private AdminDAOImpl adminDao;

   /* @Override
    public void saveAdmin(Admin admin) {
        adminDao.saveAdmin(admin);
    }*/

    private AdminRepository adminRepository;
    @Override
    public void save(Admin admin ){
        adminRepository.save(admin);
    }

}