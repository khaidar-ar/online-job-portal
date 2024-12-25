package com.job_portal.server_app.entity;

import java.util.UUID;

import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@SQLRestriction("deleted  <> true")
@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "uuid", nullable = false, unique = true)
    private String uuid = UUID.randomUUID().toString();

    @Column(name = "deleted", columnDefinition = "boolean default false", nullable = false)
    private Boolean deleted;

}
