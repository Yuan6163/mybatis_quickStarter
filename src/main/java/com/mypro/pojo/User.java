package com.mypro.pojo;


/**
 * @author ColdCurrent
 * @Package com.mypro.pojo
 * @Description:
 * @date 2021/12/13 下午 3:01
 */
public class User {
    private Long Id;

    private String Name;

    private String Psw;

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Psw='" + Psw + '\'' +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPsw() {
        return Psw;
    }

    public void setPsw(String psw) {
        Psw = psw;
    }
}
