package com.baizhi.controller;

import com.baizhi.entity.Album;
import com.baizhi.service.AlbumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class AlbumController {
    @Autowired
    private AlbumServiceImpl albumServiceImpl;

    @RequestMapping("/test")
    public Object test() {
        Album album = albumServiceImpl.selectByPrimaryKey(1);
        return "index";
    }

}
