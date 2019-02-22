package com.baizhi.service;

import com.baizhi.dao.AlbumMapper;
import com.baizhi.entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public Album selectByPrimaryKey(Integer id) {
        return albumMapper.selectByPrimaryKey(1);
    }
}