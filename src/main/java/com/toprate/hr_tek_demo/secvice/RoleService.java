package com.toprate.hr_tek_demo.secvice;

import com.toprate.hr_tek_demo.base.service.GenericService;
import com.toprate.hr_tek_demo.model.Role;

import java.util.List;

public interface RoleService extends GenericService<Role, String> {

    List<Role> getAllRole();
}
