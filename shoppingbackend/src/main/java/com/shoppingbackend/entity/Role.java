package com.shoppingbackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user1_id_seq")
	@SequenceGenerator(name = "user1_id_seq", sequenceName = "user1_id_seq", allocationSize = 1)
	@Column(name = "id")
    private int id;

    @Column(name = "role")
    private String role;

    public Role() {
    }

    public int getRoleId() {
        return id;
    }

    public void setRoleId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
