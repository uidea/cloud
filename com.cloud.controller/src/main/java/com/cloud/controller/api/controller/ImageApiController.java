package com.cloud.controller.api.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.controller.api.ImageApi;
import com.cloud.controller.java8.test.AsciiPic;

/**
 * ClassName: aaa Function: TODO Description: TODO date: 2019年1月22日 上午9:12:38
 * 
 * @author liubin
 * @email aguai_liu@163.com
 * @version
 * @since JDK 1.8
 */

@RestController
public class ImageApiController implements ImageApi {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloud.controller.api.ImageApi#getUser()
	 */
	@Override
	public ResponseEntity<String> getUser() {
		try {
			AsciiPic.createAsciiPic(AsciiPic.toBufferedImage(AsciiPic.creatImage("/demo.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
