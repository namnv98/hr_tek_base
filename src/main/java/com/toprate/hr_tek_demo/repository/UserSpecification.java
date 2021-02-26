//package com.toprate.hr_tek_demo.repository;
//
//import com.toprate.hr_tek_demo.dto.SearchUserDto;
//import com.toprate.hr_tek_demo.generic.jpa.repository.specification.BaseQuerySpecification;
//import com.toprate.hr_tek_demo.generic.jpa.repository.specification.Filter;
//import com.toprate.hr_tek_demo.model.Role_;
//import com.toprate.hr_tek_demo.model.User;
//import com.toprate.hr_tek_demo.model.Users_;
//import org.apache.commons.lang.StringUtils;
//import org.springframework.data.jpa.domain.Specification;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UserSpecification extends BaseQuerySpecification<User> {
//
//    // tim kiem nguoi dung theo trang thai va quyen
//    public Specification<User> searchUser(SearchUserDto data) {
//        if (data.getRole().equals(StringUtils.EMPTY) && data.getStatus().equals(StringUtils.EMPTY) && data.getKeyword().equals(StringUtils.EMPTY)) {
//            return null;
//        }
//        return super.initWhere().and(findByStatus(data.getStatus())).or(findByRole(data.getRole()));
//    }
//
//    // tim kiem nguoi dung theo trang thai
//    private Specification<User> findByStatus(String status) {
//        if (status == null || StringUtils.EMPTY.equals(status)) {
//            return null;
//        }
//        return super.equalsSpecification(Users_.STATUS, status);
//    }
//
//    // tim kiem nguoi dung theo quyen
//    private Specification<User> findByRole(String role) {
//        if (role == null || StringUtils.EMPTY.equals(role)) {
//            return null;
//        }
//        Filter<String> stringFilter = new Filter<>();
//        stringFilter.setEquals(role);
//        return super.buildJoinSpecification(stringFilter, Users_.role, Role_.roleName);
//    }
//
//    // tim kiem nguoi dung theo ten
//    private Specification<User> findByName(String name) {
//        if (name == null || StringUtils.EMPTY.equals(name)) {
//            return null;
//        }
//        return super.likeSpecification(Users_.NAME, name);
//    }
//
//    // tim kiem nguoi dung theo email
//    private Specification<User> findByMail(String mail) {
//        if (mail == null || StringUtils.EMPTY.equals(mail)) {
//            return null;
//        }
//        return super.likeSpecification(Users_.GMAIL, mail);
//    }
//
//    // Tim kiem nguoi dung theo sdt
//    private Specification<User> findByPhone(String phone) {
//        if (phone == null || StringUtils.EMPTY.equals(phone)) {
//            return null;
//        }
//        return super.likeSpecification(Users_.PHONE, phone);
//    }
//
//    // Tim kiem nguoi dung theo trang thai su dung like
//    private Specification<User> findLikeByStatus(String status) {
//        if (status == null || StringUtils.EMPTY.equals(status)) {
//            return null;
//        }
//        return super.likeSpecification(Users_.STATUS, status);
//    }
//
//    // tim kiem nguoi dung theo quyen su dung like
//    private Specification<User> findLikeByRole(String role) {
//        if (role == null || StringUtils.EMPTY.equals(role)) {
//            return null;
//        }
//        Filter<String> stringFilter = new Filter<>();
//        stringFilter.setLike(role);
//        return super.buildJoinSpecification(stringFilter, Users_.role, Role_.roleName);
//    }
//}
