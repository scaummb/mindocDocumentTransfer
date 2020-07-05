package com.example.mindoc_transfer.core.service;


import com.example.mindoc_transfer.core.bean.UserLogon;

public interface UserService {
    UserLogon logon(String identify, String password);
}
