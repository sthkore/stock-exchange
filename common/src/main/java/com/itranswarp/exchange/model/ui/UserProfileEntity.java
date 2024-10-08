package com.itranswarp.exchange.model.ui;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import com.itranswarp.exchange.model.support.EntitySupport;

@Entity
@Table(name = "user_profiles", uniqueConstraints = { @UniqueConstraint(name = "UNI_EMAIL", columnNames = { "email" }) })
public class UserProfileEntity implements EntitySupport {

    /**
     * 关联至用户ID.
     */
    @Id
    @Column(nullable = false, updatable = false)
    public Long userId;

    /**
     * 登录Email
     */
    @Column(nullable = false, updatable = false, length = VAR_CHAR_100)
    public String email;

    @Column(nullable = false, length = VAR_CHAR_100)
    public String name;

    @Column(nullable = false, updatable = false)
    public long createdAt;

    @Column(nullable = false)
    public long updatedAt;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "UserProfileEntity [userId=" + userId + ", email=" + email + ", name=" + name + ", createdAt="
                + createdAt + ", updatedAt=" + updatedAt + "]";
    }
}
