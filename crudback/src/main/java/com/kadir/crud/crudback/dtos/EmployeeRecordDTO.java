package com.kadir.crud.crudback.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.beans.Transient;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeRecordDTO {
    private long id;
    private String name;
    private String phone;
    private String email;
    private String photo;

    @Transient
    private String getPhotoUrl()
    {
        if(photo == null)return null;
        else return "/employee-photo" + id + "/" + photo;
    }


}
