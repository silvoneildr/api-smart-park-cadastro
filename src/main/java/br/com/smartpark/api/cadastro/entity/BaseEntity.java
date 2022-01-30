package br.com.smartpark.api.cadastro.entity;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public class BaseEntity {

    @Column(name = "DATA_CRIACAO", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "DATA_ALTERACAO")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}