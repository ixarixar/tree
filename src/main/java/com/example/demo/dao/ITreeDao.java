package com.example.demo.dao;

import com.example.demo.model.Tree;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ITreeDao extends CrudRepository<Tree, Long>{

}
