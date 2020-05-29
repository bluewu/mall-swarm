package cn.blue.mall.demo.mapper;

import cn.blue.mall.demo.model.PmsBrand;
import cn.blue.mall.demo.model.PmsBrandExample;
import java.util.List;
import org.springframework.data.repository.query.Param;

/**
 * <Description> <br>
 *
 * @author WuYingge<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2020/05/29 10:10 上午 <br>
 * @see cn.blue.mall.demo.mapper <br>
 */
public interface PmsBrandMapper {

    long countByExample(PmsBrandExample example);

    int deleteByExample(PmsBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    int insertSelective(PmsBrand record);

    List<PmsBrand> selectByExampleWithBLOBs(PmsBrandExample example);

    List<PmsBrand> selectByExample(PmsBrandExample example);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    int updateByExample(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKeyWithBLOBs(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);
}
