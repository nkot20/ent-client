package com.isj.gestiondenote.ClientWeb.Model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
    private String username;
    List<AuthorityDto> authorities;
    private String accessToken;
    private  String tokenType;
    private String name;
    private String matricule;
    private String filiere;
    private String classe;
    private List<DroitDtoPrint> droitDtoPrint;
;}
