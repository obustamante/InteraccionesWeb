package co.edu.usc.interacciones.dao.model;

import co.edu.usc.interacciones.dao.model.Componentesactivos;
import co.edu.usc.interacciones.dao.model.ComponentesactivosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComponentesactivosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentesactivos
     *
     * @mbggenerated
     */
    int countByExample(ComponentesactivosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentesactivos
     *
     * @mbggenerated
     */
    int deleteByExample(ComponentesactivosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentesactivos
     *
     * @mbggenerated
     */
    int insert(Componentesactivos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentesactivos
     *
     * @mbggenerated
     */
    int insertSelective(Componentesactivos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentesactivos
     *
     * @mbggenerated
     */
    List<Componentesactivos> selectByExample(ComponentesactivosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentesactivos
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Componentesactivos record, @Param("example") ComponentesactivosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentesactivos
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Componentesactivos record, @Param("example") ComponentesactivosExample example);
}