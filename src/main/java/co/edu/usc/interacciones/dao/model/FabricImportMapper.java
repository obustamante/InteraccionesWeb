package co.edu.usc.interacciones.dao.model;

import co.edu.usc.interacciones.dao.model.FabricImport;
import co.edu.usc.interacciones.dao.model.FabricImportExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FabricImportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fabric_import
     *
     * @mbggenerated
     */
    int countByExample(FabricImportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fabric_import
     *
     * @mbggenerated
     */
    int deleteByExample(FabricImportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fabric_import
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal idfabricImport);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fabric_import
     *
     * @mbggenerated
     */
    int insert(FabricImport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fabric_import
     *
     * @mbggenerated
     */
    int insertSelective(FabricImport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fabric_import
     *
     * @mbggenerated
     */
    List<FabricImport> selectByExample(FabricImportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fabric_import
     *
     * @mbggenerated
     */
    FabricImport selectByPrimaryKey(BigDecimal idfabricImport);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fabric_import
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FabricImport record, @Param("example") FabricImportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fabric_import
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FabricImport record, @Param("example") FabricImportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fabric_import
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FabricImport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fabric_import
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FabricImport record);
}