package co.edu.usc.interacciones.dao.model;

import co.edu.usc.interacciones.dao.model.Lotes;
import co.edu.usc.interacciones.dao.model.LotesExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    int countByExample(LotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    int deleteByExample(LotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal idlotes);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    int insert(Lotes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    int insertSelective(Lotes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    List<Lotes> selectByExample(LotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    Lotes selectByPrimaryKey(BigDecimal idlotes);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Lotes record, @Param("example") LotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Lotes record, @Param("example") LotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Lotes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Lotes record);
}