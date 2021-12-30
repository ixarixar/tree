package com.example.demo.service;

import com.example.demo.dao.ITreeDao;
import com.example.demo.model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreeSrv<treeDao> {

    @Autowired
    ITreeDao treeDao;

    public Iterable<Tree> findAll(){
        Tree t = new Tree();
        t.setName("jakieś dane");
        t.setRoot_id(0L);
        t.setEnabled(true);
        t.setCount(0);
        treeDao.save(t);

        return treeDao.findAll();
    }

}
