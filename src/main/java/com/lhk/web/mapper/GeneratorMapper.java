package com.lhk.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lhk.web.model.entity.Generator;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author i7 12700KF
 * @description 针对表【generator(代码生成器)】的数据库操作Mapper
 * @createDate 2024-12-23 20:44:46
 * @Entity com.lhk.web.model.entity.Generator
 */
public interface GeneratorMapper extends BaseMapper<Generator> {

    @Select("SELECT id, distPath FROM generator WHERE isDelete = 1")
    List<Generator> listDeletedGenerator();

}




