package com.toprate.hr_tek_demo.model;

import com.toprate.hr_tek_demo.base.model.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User implements BaseEntity {
    @Id
    @GeneratedValue(generator = "my_generatorUser")
    @GenericGenerator(name = "my_generatorUser", strategy = "com.toprate.hr_tek_demo.generators.GeneratorUserId")
    @Column(name = "user_id", length = 20)
    private String userId;

    @Column(name = "name")
    private String name;

    @Column(name = "gmail")
    private String gmail;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birth_day")
    private Date birthDay;

    @Column(name = "enable")
    private int enable;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "role_name", nullable = false)
    private Role role;

    @Override
    public Serializable getId() {
        return userId;
    }
}
