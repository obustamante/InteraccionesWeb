package co.edu.usc.interacciones.dao.model;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductosMoleculasMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.productos_moleculas
     *
     * @mbggenerated
     */
    int countByExample(ProductosMoleculasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.productos_moleculas
     *
     * @mbggenerated
     */
    int deleteByExample(ProductosMoleculasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.productos_moleculas
     *
     * @mbggenerated
     */
    int insert(ProductosMoleculas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.productos_moleculas
     *
     * @mbggenerated
     */
    int insertSelective(ProductosMoleculas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.productos_moleculas
     *
     * @mbggenerated
     */
    List<ProductosMoleculas> selectByExample(ProductosMoleculasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.productos_moleculas
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductosMoleculas record, @Param("example") ProductosMoleculasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.productos_moleculas
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductosMoleculas record, @Param("example") ProductosMoleculasExample example);
}