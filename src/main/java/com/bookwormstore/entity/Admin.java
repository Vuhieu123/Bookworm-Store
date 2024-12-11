package com.bookwormstore.entity;

import com.bookwormstore.entity.base.PrimaryEntity;
import com.bookwormstore.infrastructure.constant.EntityProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Nationalized;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DynamicUpdate
@Table(name = "admin")
public class Admin extends PrimaryEntity implements Serializable {

    @Column(name = "name", length = EntityProperties.LENGTH_NAME)
    @Nationalized
    private String name;

    @Column(name = "email", length = EntityProperties.LENGTH_NAME)
    private String email;

    @Column(name = "pass_word", length = EntityProperties.LENGTH_NAME)
    private String passWord;

//    @Column(name = "pass_word", length = EntityProperties.LENGTH_NAME)
//    private String passWord;
//
//    @Column(name = "pass_word", length = EntityProperties.LENGTH_NAME)
//    private String passWord;
//
//    @Column(name = "pass_word", length = EntityProperties.LENGTH_NAME)
//    private String passWord;

}
