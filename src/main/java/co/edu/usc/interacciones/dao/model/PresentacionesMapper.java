package co.edu.usc.interacciones.dao.model;

import co.edu.usc.interacciones.dao.model.Presentaciones;
import co.edu.usc.interacciones.dao.model.PresentacionesExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PresentacionesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presentaciones
     *
     * @mbggenerated
     */
    int countByExample(PresentacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presentaciones
     *
     * @mbggenerated
     */
    int deleteByExample(PresentacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presentaciones
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal idpresentaciones);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presentaciones
     *
     * @mbggenerated
     */
    int insert(Presentaciones record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presentaciones
     *
     * @mbggenerated
     */
    int insertSelective(Presentaciones record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presentaciones
     *
     * @mbggenerated
     */
    List<Presentaciones> selectByExample(PresentacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presentaciones
     *
     * @mbggenerated
     */
    Presentaciones selectByPrimaryKey(BigDecimal idpresentaciones);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presentaciones
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Presentaciones record, @Param("example") PresentacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presentaciones
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Presentaciones record, @Param("example") PresentacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presentaciones
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Presentaciones record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presentaciones
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Presentaciones record);
}