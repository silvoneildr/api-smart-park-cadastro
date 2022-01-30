package br.com.smartpark.api.cadastro.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonDTO {
    private String personType;
}
