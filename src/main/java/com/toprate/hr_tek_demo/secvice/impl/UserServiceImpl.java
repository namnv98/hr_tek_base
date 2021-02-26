package com.toprate.hr_tek_demo.secvice.impl;

import com.toprate.hr_tek_demo.dto.SearchUserDto;
import com.toprate.hr_tek_demo.base.service.GenericServiceImpl;
import com.toprate.hr_tek_demo.model.User;
import com.toprate.hr_tek_demo.repository.UserRepository;
import com.toprate.hr_tek_demo.secvice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, String> implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    // xoa 1 nguoi dung khoi he thong
    @Override
    public void deleteUser(User user) {
        user.setEnable(0);
        userRepository.save(user);
    }
    
    // tim kiem theo tat ca cac tieu chi
    @Override
    public List<User> searchUserByKeyword(SearchUserDto data) {
        return null;
    }

    // phan trang
    @Override
    public Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return userRepository.findAll(pageable);
    }

    @Override
    public User getUserByGmail(String gmail) {
        return userRepository.findByGmail(gmail).orElse(null);
    }

    @Override
    public List<User> getAllByRole(String name) {
        return userRepository.findByRole_RoleName(name);
    }


}
