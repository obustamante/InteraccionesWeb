package co.edu.usc.interacciones.dao.model;

import co.edu.usc.interacciones.dao.model.Registrossanitarios;
import co.edu.usc.interacciones.dao.model.RegistrossanitariosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistrossanitariosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int countByExample(RegistrossanitariosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int deleteByExample(RegistrossanitariosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String codigoinvima);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int insert(Registrossanitarios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int insertSelective(Registrossanitarios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    List<Registrossanitarios> selectByExample(RegistrossanitariosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    Registrossanitarios selectByPrimaryKey(String codigoinvima);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Registrossanitarios record, @Param("example") RegistrossanitariosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Registrossanitarios record, @Param("example") RegistrossanitariosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Registrossanitarios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Registrossanitarios record);
}