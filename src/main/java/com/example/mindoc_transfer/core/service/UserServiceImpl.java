package com.example.mindoc_transfer.core.service;


import com.example.mindoc_transfer.core.bean.UserLogon;
import com.example.mindoc_transfer.core.constants.TransferConstants;
import com.example.mindoc_transfer.core.utils.RestPostUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public UserLogon logon(String identify, String password) {
        Map<String, String> params = new HashMap(){{
            put("userIdentifier", identify);
            put("password", password);
            put("regionCode", TransferConstants.REGION);
        }};
        UserLogon userLogonLogon = (UserLogon) RestPostUtils.doPostRequestToOPC(TransferConstants.LOGON_URL, params, UserLogon.class);
        return userLogonLogon;
    }

}
