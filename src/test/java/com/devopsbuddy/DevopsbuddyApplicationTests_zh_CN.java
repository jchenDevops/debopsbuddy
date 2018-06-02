package com.devopsbuddy;

import com.devopsbuddy.web.i18n.I18NService;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DevopsbuddyApplication.class)
@WebAppConfiguration
public class DevopsbuddyApplicationTests_zh_CN {

	@Autowired
	private I18NService i18NService;

	@Test
	public void testMessageByLocaleService() throws Exception {
		String expectedResult = "基本会员";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId, new Locale("zh","CN"));
		Assert.assertEquals("The actual and expected Strings don't match", expectedResult, actual);
	}

}
