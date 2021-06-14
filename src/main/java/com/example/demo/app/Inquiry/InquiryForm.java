package com.example.demo.app.Inquiry;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InquiryForm {

    @Size(min=1,max=20,message="20文字以上")
    private String name;

    @NotNull
    @Email(message = "E-mailが違う")
    private String email;

    @NotNull
    private String contents;

    public InquiryForm(String name) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
