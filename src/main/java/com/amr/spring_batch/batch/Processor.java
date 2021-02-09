package com.amr.spring_batch.batch;

import java.util.Date;

import com.amr.spring_batch.db.User;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<User, User> {
    @Override
    public User process(User user) throws Exception {
        // TODO : Need to prepare Request here
        user.setCreateDate(new Date());
        return user;
    }
}
