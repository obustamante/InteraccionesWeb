package co.edu.usc.interacciones.dao.model;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EstadosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.estados
     *
     * @mbggenerated
     */
    int countByExample(EstadosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.estados
     *
     * @mbggenerated
     */
    int deleteByExample(EstadosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.estados
     *
     * @mbggenerated
     */
    int insert(Estados record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.estados
     *
     * @mbggenerated
     */
    int insertSelective(Estados record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.estados
     *
     * @mbggenerated
     */
    List<Estados> selectByExample(EstadosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.estados
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Estados record, @Param("example") EstadosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.estados
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Estados record, @Param("example") EstadosExample example);
}