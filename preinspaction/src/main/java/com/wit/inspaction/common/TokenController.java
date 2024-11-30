package com.wit.inspaction.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tokens")
public class TokenController {

    @Autowired
    private UserTokenRepository userTokenRepository;

    @PostMapping
    public ResponseEntity<Void> saveToken(@RequestBody UserToken userToken) {
    	
    	
    	System.out.println("userToken ::: " + userToken.getId());
    	System.out.println("userToken ::: " + userToken.getDeviceToken());
    	System.out.println("userToken ::: " + userToken.getUserId());
    	
        userTokenRepository.save(userToken);
        return ResponseEntity.ok().build();
    }

    // 푸시 알림 전송 메소드를 추가할 수 있습니다.
}

