package com.example.mindoc_transfer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class MindocTransferApplicationTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(MindocTransferApplicationTests.class);


	public static void main(String[] args) {
		String text = "帮助中心book\n" +
				"![](/uploads/202006/attach_161acf25ee0cfd3c.png)\n" +
				"![](/uploads/202006/attach_161acebdd9e82efc.png)";

		String regex = "\\!\\[\\]\\(";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		ArrayList<String> al=new ArrayList<String>();

		while (m.find()) {
			al.add(m.group(0));
		}
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).toString());
		}

	}
}
