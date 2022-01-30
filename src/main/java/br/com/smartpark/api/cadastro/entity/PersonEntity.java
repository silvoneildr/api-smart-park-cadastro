package br.com.smartpark.api.cadastro.entity;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PESSOA", schema = "cadastro")
public class PersonEntity extends BaseEntity {

    @Id
    @Column(name = "PESSOA_ID")
    @GeneratedValue(strategy = IDENTITY)
    private Long personId;

    @Column(name = "TIPO")
    private String personType;
}
