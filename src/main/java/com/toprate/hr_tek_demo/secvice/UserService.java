package com.toprate.hr_tek_demo.secvice;

import com.toprate.hr_tek_demo.dto.SearchUserDto;
import com.toprate.hr_tek_demo.base.service.GenericService;
import com.toprate.hr_tek_demo.model.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface UserService extends GenericService<User, String> {

    void deleteUser(User user);

    List<User> searchUserByKeyword(SearchUserDto searchUserDto);

    Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

    User getUserByGmail(String gmail);

    List<User> getAllByRole(String name);
}
