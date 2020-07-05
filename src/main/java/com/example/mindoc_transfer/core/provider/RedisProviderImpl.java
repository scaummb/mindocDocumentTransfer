package com.example.mindoc_transfer.core.provider;

import com.example.mindoc_transfer.core.utils.redis.RedisTemplateFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * redis 操作类
 *
 * @author moubin.mo
 * @date: 2019/8/31 17:12
 */

@Component
public class RedisProviderImpl implements RedisProvider {

	private static final Logger LOGGER = LoggerFactory.getLogger(RedisProviderImpl.class);

	@Autowired
	private RedisTemplateFactory redisTemplateFactory;

	/**
	 * 从redisFactory获取redisTemplate
	 */
	@Override
	public RedisTemplate getRedisTemplate(){
		return redisTemplateFactory.getRedisTemplate();
	}
}
