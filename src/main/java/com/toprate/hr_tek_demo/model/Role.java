package com.toprate.hr_tek_demo.model;

import com.toprate.hr_tek_demo.base.model.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "role")
public class Role implements BaseEntity {
    @Id
    @Column(name = "role_name", nullable = false)
    private String roleName;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<User> userList;

    @Override
    public Serializable getId() {
        return roleName;
    }
}
