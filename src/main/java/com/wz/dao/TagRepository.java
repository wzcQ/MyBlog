package com.wz.dao;

import com.wz.po.Tag;
import com.wz.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);

    //查询数量最多 标签
    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
