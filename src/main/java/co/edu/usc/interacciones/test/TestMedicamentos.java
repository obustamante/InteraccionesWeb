package co.edu.usc.interacciones.test;

import co.edu.usc.interacciones.dao.model.*;
import co.edu.usc.interacciones.utiles.DBUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class TestMedicamentos {

    public static void main(String[] args) {

        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.getSession();

            EstadosExample estadosExample = new EstadosExample();
            estadosExample.createCriteria().andNombreIsNotNull();

            EstadosMapper estadosMapper = sqlSession.getMapper(EstadosMapper.class);
            List<Estados> resultadoEstados = estadosMapper.selectByExample(estadosExample);

            for (Estados estados : resultadoEstados) {
                System.out.println(estados.getIdestado() + ". " + estados.getNombre());
            }

            RegistrossanitariosExample registrossanitariosExample = new RegistrossanitariosExample();
            registrossanitariosExample.createCriteria().andNombreIsNotNull().andNombreLike("A%");

            RegistrossanitariosMapper registrossanitariosMapper = sqlSession.getMapper(RegistrossanitariosMapper.class);
            List<Registrossanitarios> list = registrossanitariosMapper.selectByExample(registrossanitariosExample);

            /*
            for (Registrossanitarios reg: list) {
                System.out.println(reg.getNombre());
            }*/
            for (int i = 0; i < 30; i++) {
                System.out.println("|" + list.get(i).getNombre() + "|");
            }

            System.out.println("Aquí 3");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
