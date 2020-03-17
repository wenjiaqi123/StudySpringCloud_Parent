package com.gsm.utils;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.Assert.*;

public class PwdUtilsTest {

    @Test
    public void aaa() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("123456");
        System.out.println(encode);

        boolean matches = bCryptPasswordEncoder.matches("123456", "$2a$10$3cTT54x3qfRk.NfzyEJ9TOF.pYREpskNFyZozhTHAMXhuQai7Bi/6");
        System.out.println(matches);
    }
}