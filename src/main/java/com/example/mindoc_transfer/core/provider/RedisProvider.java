package com.example.mindoc_transfer.core.provider;

import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author moubin.mo
 * @date: 2019/8/31 17:11
 */

public interface RedisProvider {

	RedisTemplate getRedisTemplate();
}
