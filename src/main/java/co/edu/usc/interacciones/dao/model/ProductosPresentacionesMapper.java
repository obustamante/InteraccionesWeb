package co.edu.usc.interacciones.dao.model;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductosPresentacionesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    int countByExample(ProductosPresentacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    int deleteByExample(ProductosPresentacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String cum);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    int insert(ProductosPresentaciones record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    int insertSelective(ProductosPresentaciones record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    List<ProductosPresentaciones> selectByExample(ProductosPresentacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    ProductosPresentaciones selectByPrimaryKey(String cum);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductosPresentaciones record, @Param("example") ProductosPresentacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductosPresentaciones record, @Param("example") ProductosPresentacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductosPresentaciones record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductosPresentaciones record);
}